package gold.ssj.community.controller;

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
public class IndexController {
    public String index(){
        return "index";
    }
}
