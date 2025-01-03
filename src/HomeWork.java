import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {

        Friend[] friends = {
                new Friend("Tom", 11, true,2.3F),
                new Friend("Don", 12, false, 2.1F),
                new Friend("Max", 12, true, 5.4F),
                new Friend("Pol", 13, false, 4.5F)
        };
        System.out.println("Мои друзья: " + Arrays.toString(friends));


    }
}

class Friend {
    private String name;
    private int age;
    private boolean isFriendFromSchool;
    private float hoursSpentTogetherLastWeek;

    public Friend(String name, int age, boolean isFriendFromSchool, float hoursSpentTogetherLastWeek) {
        this.name = name;
        this.age = age;
        this.isFriendFromSchool = isFriendFromSchool;
        this.hoursSpentTogetherLastWeek = hoursSpentTogetherLastWeek;
    }

    @Override
    public String toString() {
        return "Мои друзья { " +
                "имя = " + name + '\'' +
                ", возраст = " + age +
                ", он друг из школы = " + isFriendFromSchool +
                ", на прошлой неделе проведенных вместе часов было = " + hoursSpentTogetherLastWeek +
                '}';
    }
}