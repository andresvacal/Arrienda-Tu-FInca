package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
    @GetMapping(value = "/wiki")
    @ResponseBody
    public String welcomeAsHTML() {
        return "template";
    }
}