package etc.stream;

import static etc.stream.Menu.menuList;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class Sorting {

    public static void main(String[] args) {

        // 음식목록 중 칼로리가 낮은 순으로 정렬 (오름차 정렬)
        menuList.stream()
                .sorted(comparing(Dish::getCalories))
                .collect(toList())
                .forEach(System.out::println);

        System.out.println("====================================================");

        // 칼로리로 내림차 정렬 (높은 순)
        menuList.stream()
                .sorted(comparing(Dish::getCalories).reversed())
                .collect(toList())
                .forEach(System.out::println);

        System.out.println("====================================================");

        // 500칼로리보다 작은 요리 중에 top3 필터링
        menuList.stream()
                .filter(dish -> dish.getCalories() < 500) // 칼로리가 500 미만 애들 걸러
                .sorted(comparing(Dish::getCalories).reversed()) // 걸른 애들 정렬 (높은 순)
                .limit(3) // 정렬된 애들 중 상위 3개만 짤라
                .collect(toList()) // 리스트로 줘.
                .forEach(System.out::println); // 반복해서 출력해.

    }

}











