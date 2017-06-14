package ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by dyg on 2017/6/14.
 */

@Controller
public class AdminController {
    @RequestMapping(value="/hello/{player}",method= RequestMethod.GET)
    public String message(@PathVariable("player") String player){
        return "forward:/success.jsp";
    }
}
