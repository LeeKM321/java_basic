package etc.stream;

import java.util.List;
import java.util.stream.Collectors;

import static etc.stream.Menu.*;

public class Mapping {

    //이름과 타입만 가진 클래스 설계
    private static class DishNameType {
        private String name;
        private Dish.Type type;

        public DishNameType(Dish dish) {
            this.name = dish.getName();
            this.type = dish.getType();
        }

        @Override
        public String toString() {
            return "DishNameType{" +
                    "name='" + name + '\'' +
                    ", type=" + type +
                    '}';
        }
    }

    // 이름과 칼로리만 가진 클래스를 설계
    private static class SimpleDish {
        private String name;
        private int calrories;

        public SimpleDish(String name, int calrories) {
            this.name = name;
            this.calrories = calrories;
        }

        public SimpleDish(Dish dish) {
            this.name = dish.getName();
            this.calrories = dish.getCalories();
        }

        @Override
        public String toString() {
            return "SimpleDish{" +
                    "name='" + name + '\'' +
                    ", calrories=" + calrories +
                    '}';
        }
    }

    public static void main(String[] args) {

        // stream의 map : 컬렉션 (리스트, 셋, 맵...)에서
        // 원하는 정보만 추출하여 새로운 컬렉션으로 반환해 줌.

        List<Integer> nameList = menuList.stream()
                .map(Dish::getCalories)
                .collect(Collectors.toList());

        System.out.println("nameList = " + nameList);

        /*
            요리 목록에서 메뉴 이름과 칼로리를 추출하고 싶다.
         */
        menuList.stream()
                .map(SimpleDish::new)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        /*
            메뉴 목록에서 칼로리가 500칼로리보다 큰
            음식들을 필터링한 다음에 음식의 이름과 타입만 추출해서
            출력해 주세요.
         */
        System.out.println("======================================================");
        menuList.stream()
                .filter(dish -> dish.getCalories() > 500)
                .map(DishNameType::new)
                .collect(Collectors.toList())
                .forEach(ds -> System.out.println("ds = " + ds));


    }
}










