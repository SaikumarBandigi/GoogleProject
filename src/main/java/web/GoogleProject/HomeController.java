package web.GoogleProject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }
}



//https://www.linkedin.com/in/saikumar-bandigi-071007133
//https://github.com/SaikumarBandigi