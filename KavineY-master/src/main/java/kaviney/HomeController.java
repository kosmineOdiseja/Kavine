package kaviney;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController { // cia yra bus musu pagrindinis puslapis.

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello World";
    }
}
