package chain;

import org.springframework.stereotype.Component;

@Component
public class CanteenService implements StudentProcessor {
    @Override
    public Integer getPriority() {
        return 3;
    }

    @Override
    public void chain(Student student) {
        // canteen service logic

        // if Student == true
        // else --> next service
    }
}
