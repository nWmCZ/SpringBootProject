package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Controller
@EnableAutoConfiguration
public class SampleController {

    @Autowired
    private RequestRepository requestRepository;

    @RequestMapping("/")
    @ResponseBody
    String home() {

        Request r = new Request();
        r.setSource("web");
        r.setDateTime(LocalDateTime.now());

        requestRepository.save(r);

        return "Added " + r ;
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Request> getAllRequests() {
        // This returns a JSON or XML with the users
        return requestRepository.findAll();
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}