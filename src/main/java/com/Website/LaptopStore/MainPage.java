package com.Website.LaptopStore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPage {
    @GetMapping("/")
    public String Hungchimto()
    {
        return "index";
    }
}
