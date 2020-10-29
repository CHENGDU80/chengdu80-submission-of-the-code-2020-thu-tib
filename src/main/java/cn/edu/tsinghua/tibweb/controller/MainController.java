package cn.edu.tsinghua.tibweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @ClassName MainController
 * @Description TODO
 * @Author THU
 * @Date 2020/10/28 8:50 下午
 * @Version 1.0
 **/
@RestController
public class MainController {
    @RequestMapping("/index")
    public String index(){
        System.out.println("=====");
        return "/index.html";
//        return new ModelAndView("horizontalbar");
    }
}
