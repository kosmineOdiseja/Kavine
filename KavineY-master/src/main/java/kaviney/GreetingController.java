package kaviney;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class GreetingController {

    @GetMapping("/uzsakymai") // cia iskvieciam html file vardu uzsakymai
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "uzsakymai";
    }
    
    @GetMapping("/paruosimas") //cia iskvieciam file html vardu paruosimas 
    public String paruosimas(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "paruosimas";
    }    
       
    @GetMapping("/uzsakymai0012") // o sitas reikalingas tam kad mes kviestume nauja atveji paruosimas, o uzsakymaix yra siaip sugalvotas
    //mes padarom sikla kurio galutinis rezultatas paruosimas. 
    public String uzsakymaix(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "paruosimas";
    }    
    
    @RequestMapping("/simple") //kas cia per simple? realiai jis nereikalingas bet jis yra del skirtingu pavyzdziu :) 
    public @ResponseBody String greeting() {
        return "Hello Simple";
    }    

}
