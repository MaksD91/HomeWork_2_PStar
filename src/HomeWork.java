import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {

        Frend[] frends = {
                new Frend("Tom", 11, true,2.3F),
                new Frend("Don", 12, false, 2.1F),
                new Frend("Max", 12, true, 5.4F),
                new Frend("Pol", 13, false, 4.5F)
        };
        System.out.println("Мои друзья: " + Arrays.toString(frends));


    }
}

class Frend {
    private String name;
    private int age;
    boolean isFriendFromSchool;
    float hoursSpentTogetherLastWeek;

    public Frend(String name, int age, boolean isFriendFromSchool, float hoursSpentTogetherLastWeek) {
        this.name = name;
        this.age = age;
        this.isFriendFromSchool = isFriendFromSchool;
        this.hoursSpentTogetherLastWeek = hoursSpentTogetherLastWeek;
    }

    @Override
    public String toString() {
        return "Друг {" +
                "имя ='" + name + '\'' +
                ", возраст =" + age +
                ", он друг из школы =" + isFriendFromSchool +
                ", на прошлой неделе проведенных вместе часов =" + hoursSpentTogetherLastWeek +
                '}';
    }
}