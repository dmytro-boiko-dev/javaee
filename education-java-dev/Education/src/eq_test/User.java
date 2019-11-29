package eq_test;

import java.util.Objects;

public class User {
    private int age;

    //constructor
    public User(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age;
    }

    @Override
    public int hashCode() {

        return Objects.hash(age);
    }

    public static void main(String[] args) {
        Object object = new User(13);//восходящий кастинг

        User user = new User(12);
        User user1 = new User(12);
        System.out.println(user.equals(user1));
    }
}
