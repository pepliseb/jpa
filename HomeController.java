package pl.pepliseb.jpa;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @ResponseBody
    @GetMapping ("/")
    public String hello(){
        return "hello";
    }
}
