package chain;

import org.springframework.stereotype.Component;

@Component
public class LibraryService implements StudentProcessor {
    @Override
    public Integer getPriority() {
        return 2;
    }

    @Override
    public void chain(Student student) {
        // library logic
    }
}
