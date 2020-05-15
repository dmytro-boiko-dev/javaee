package chain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RegistrationService {

    @Autowired
    private List<StudentProcessor> processors;

    public void registration(Student student) {

        processors.stream()
                .sorted((a, b) ->
                        a.getPriority().compareTo(b.getPriority()))
                .forEach(next -> next.chain(student));
    }
}
