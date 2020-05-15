package chain;

import org.springframework.stereotype.Component;

@Component
public class FinancialService implements StudentProcessor{

    @Override
    public Integer getPriority() {
        return 1;
    }

    @Override
    public void chain(Student student) {
        // business logic
    }
}
