package datapackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/mdstool")
public class MainController {
    @Autowired
    private DataRepository dataRepository;

    @GetMapping(path = "/layer1")
    public @ResponseBody Iterable<TaggingTask> getAllData(){
        Iterable<TaggingTask> all = dataRepository.findAll();

        return all;
    }

    //batch / offset

}
