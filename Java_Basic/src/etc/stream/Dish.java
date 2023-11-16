package etc.stream;

public class Dish {

    private final String name; // 요리 이름
    private final boolean vegetarian; // 채식주의 여부
    private final int calories; // 칼로리
    private final Type type; // 요리 카테고리

    public enum Type {
        MEAT, FISH, OTHER
    }

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", vegetarian=" + vegetarian +
                ", calories=" + calories +
                ", type=" + type +
                '}';
    }
}
