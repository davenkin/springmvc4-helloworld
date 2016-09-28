package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("info", "Hello World!");
        return "/WEB-INF/jsp/hello.jsp";
    }
}
