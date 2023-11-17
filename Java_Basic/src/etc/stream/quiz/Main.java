package etc.stream.quiz;

import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = List.of(
                new Transaction(brian, 2021, 300),
                new Transaction(raoul, 2022, 1000),
                new Transaction(raoul, 2021, 400),
                new Transaction(mario, 2021, 710),
                new Transaction(mario, 2022, 700),
                new Transaction(alan, 2022, 950)
        );

        // 연습 1: 2021년에 발생한 모든 거래를 찾아 거래액 오름차 정렬(작은 값에서 큰 값).
        List<Transaction> tr2021 = transactions.stream()
                .filter(trs -> trs.getYear() == 2021)
                .sorted(comparing(Transaction::getValue))
                .collect(toList());

        tr2021.forEach(System.out::println);

        System.out.println("===================================================");

        // 연습 2: 거래자가 근무하는 모든 도시 이름을 중복 없이 나열하시오.
        List<String> cities = transactions.stream()
                .map(trs -> trs.getTrader().getCity())
                .distinct()
                .collect(toList());

        System.out.println("cities = " + cities);

        System.out.println("===================================================");

        // 연습 3: Cambridge에 근무하는 모든 거래자를 찾아 거래자 리스트로 이름순으로 오름차 정렬.
        List<Trader> traders = transactions.stream()
                .map(Transaction::getTrader)
                .filter(td -> td.getCity().equals("Cambridge"))
                .distinct()
                .sorted(comparing(Trader::getName))
                .collect(toList());

        traders.forEach(System.out::println);


        System.out.println("===================================================");

        // 연습 4: 모든 거래자의 이름을 리스트에 모아서 알파벳순으로  오름차 정렬하여 반환

        List<String> nameList = transactions.stream()
                .map(trs -> trs.getTrader().getName())
                .distinct()
                .sorted() // 문자나 숫자는 Comparator를 사용하지 않아도 됩니다.
                .collect(toList());

        System.out.println("nameList = " + nameList);

        System.out.println("===================================================");

        // 연습 5: Milan에 거주하는 거래자가 한명이라도 있는지 여부 확인?
        boolean flag = transactions.stream()
                .anyMatch(trs -> trs.getTrader().getCity().equalsIgnoreCase("milan"));

        System.out.println("any people lived in Milan? = " + flag);


        System.out.println("===================================================");
        // 연습 6: Cambridge에 사는 거래자의 모든 거래액의 총합 출력.
        int totalValue = transactions.stream()
                .filter(trs -> trs.getTrader().getCity().equalsIgnoreCase("cambridge"))
                .mapToInt(Transaction::getValue)
                .sum();
        System.out.println("totalValue = " + totalValue);


        // 연습 7: 모든 거래에서 최고 거래액은 얼마인가?
//        Transaction transaction = transactions.stream()
//                .max(comparing(trs -> trs.getValue()))
//                .get();
//
//        System.out.println("maxValue = " + transaction.getValue());

        int maxValue = transactions.stream()
                .mapToInt(Transaction::getValue)
                .max()
                .getAsInt();
        System.out.println("maxValue = " + maxValue);



        // 연습 8. 가장 작은 거래액을 가진 거래정보 탐색
//        transactions.stream()
//                .min(comparing(Transaction::getValue))
//                .ifPresent(System.out::println);

        Transaction transaction = transactions.stream()
                .min(comparing(Transaction::getValue))
                .get();

        System.out.println("transaction = " + transaction);

    }

}
