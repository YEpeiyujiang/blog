package com.lrm.web;

import com.lrm.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by limi on 2017/10/13.
 */
@Controller
public class IndexController {

    @GetMapping("/{id}/{home}")
    public String index(@PathVariable Integer id,@PathVariable String name) {
        System.out.println("------------index----------");
        return "index";
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }

}
