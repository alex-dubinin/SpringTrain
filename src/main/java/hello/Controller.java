package hello;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by HillelNew5 on 10.10.2017.
 */
@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping(value = "/test.form", method = RequestMethod.GET)
    public String test(@RequestParam("name") String param, Model model) {
        model.addAttribute("name", param);
        return "hello";}

    @RequestMapping(value = "/test2.form", method = RequestMethod.GET)
    public String test2(String param, Model model) {
        model.addAttribute("name", param);
        return "index";}
}
