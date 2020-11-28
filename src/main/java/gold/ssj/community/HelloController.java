package gold.ssj.community;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ProjectName: [community]
 * @Package: [gold.ssj.community.controller]
 * @Description: [TODO]
 * @Author: [AiKang]
 * @CreateDate: [2020/11/28]
 * @Version: [v1.0]
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String Hello(@RequestParam(name = "name")String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }
}
