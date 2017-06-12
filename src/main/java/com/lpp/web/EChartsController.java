package com.lpp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by tangcheng on 6/12/2017.
 */
@Controller
public class EChartsController {

    @GetMapping("echartsMapDemo.html")
    public String echartsMapDemo() {
        return "echartsMapDemo";
    }

}
