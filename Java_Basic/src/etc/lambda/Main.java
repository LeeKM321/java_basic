package etc.lambda;

import java.util.List;

import static etc.lambda.Color.*;
import static etc.lambda.FilterApple.*;
import static etc.lambda.MappingApple.*;

public class Main {
    public static void main(String[] args) {

        // 사과 바구니 생성
        List<Apple> appleBasket = List.of(
                new Apple(80, GREEN)
                , new Apple(155, GREEN)
                , new Apple(120, RED)
                , new Apple(97, RED)
                , new Apple(200, GREEN)
                , new Apple(50, RED)
                , new Apple(85, YELLOW)
                , new Apple(75, YELLOW)
        );

        System.out.println("========== 녹색 사과 필터링 ==========");
        List<Apple> greenApples = filterGreenApples(appleBasket);
        for (Apple greenApple : greenApples) {
            System.out.println(greenApple);
        }

        System.out.println("========== 다양한 색상 사과 필터링 ==========");
        List<Apple> filteredColorApples = filterApplesByColor(appleBasket, YELLOW);
        for (Apple filteredColorApple : filteredColorApples) {
            System.out.println(filteredColorApple);
        }

        System.out.println("========== 원하는 조건으로 사과 필터링 ==========");

        // 100g 이하인 사과를 필터링
        List<Apple> apples1 = filterApple(appleBasket, new LightApplePredicate());
        for (Apple apple : apples1) {
            System.out.println(apple);
        }

        // 빨강 또는 노랑 사과만 필터링 하자.
        System.out.println("===========================================================");
        List<Apple> apples2 = filterApple(appleBasket, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor() == RED || apple.getColor() == YELLOW;
            }
        });

        for (Apple apple : apples2) {
            System.out.println(apple);
        }

        System.out.println("===========================================================");

        // 녹색이면서 100g 이상인 사과들만 필터링
        List<Apple> apples3 = filterApple(appleBasket,
              (apple) -> apple.getColor() == GREEN && apple.getWeight() >= 100
        );

        for (Apple apple : apples3) {
            System.out.println(apple);
        }

        System.out.println("========== 여러가지를 필터링 ==========");
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> filter1 = filter(numbers, n -> n % 2 == 1);
        System.out.println(filter1);

        System.out.println("===========================================================");

        List<String> words = List.of("짜장면", "짬뽕", "탕수육", "피자", "삼겹살");

        List<String> filter2 = filter(words, s -> s.length() == 3);
        System.out.println("filter2 = " + filter2);

        List<Apple> filter3 = filter(appleBasket, a -> a.getWeight() < 100);
        for (Apple apple : filter3) {
            System.out.println(apple);
        }

        System.out.println("========== 사과의 색상만 매핑 ==========");
        List<Color> colorList = mappingAppleByColor(appleBasket);
        System.out.println("colorList = " + colorList);

        System.out.println("========== 숫자에서 제곱수를 매핑 ==========");
        List<Integer> map1 = map(numbers, n -> n * n);
        System.out.println("map1 = " + map1);

        System.out.println("========== 문자에서 첫 글자만 매핑 ==========");
        List<Character> map2 = map(words, s -> s.charAt(0));
        System.out.println("map2 = " + map2);

        System.out.println("========== 사과에서 무게만 매핑 ==========");
        List<Integer> map3 = map(appleBasket, a -> a.getWeight());
        System.out.println("map3 = " + map3);

    }
}




