package excavate.ComparableExample;

public class Person implements Comparable<Person>{
    int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person person) {
        return this.age - person.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}
