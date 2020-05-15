package chain;

public interface StudentProcessor {
    Integer getPriority();
    void chain(Student student);
}
