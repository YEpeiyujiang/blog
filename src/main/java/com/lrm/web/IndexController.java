package com.lrm.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by limi on 2017/10/13.
 */
@Controller
public class IndexController {

    @GetMapping("/{id}/{name}")
    public String index(@PathVariable Integer id ,@PathVariable String name) {
        //int i = 2/0;
//        String blog = null;
//        if(blog == null){
//            throw new NotFoundException("博客不存在");
 //   }
        System.out.println("------------index----------");
        return "index";
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }

}
