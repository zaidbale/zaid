package azure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzuretestingApplication {
    @GetMapping("/azure")
    public String string(){
        return "hi";
    }
    public static void main(String[] args) {
        SpringApplication.run(AzuretestingApplication.class, args);
    }

}
