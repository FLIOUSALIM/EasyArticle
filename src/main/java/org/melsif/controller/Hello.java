package org.melsif.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by fliou on 27/09/17.
 */

@Controller
public class Hello {


    @RequestMapping("/admin")
    public String admin(@PathVariable(value="name", required = false) String name, Model model) {
        model.addAttribute("name", name);
        return "admin";
    }

    @RequestMapping("/user")
    public String user(@PathVariable(value="name", required = false) String name, Model model) {
        model.addAttribute("name", name);
        return "user";
    }

}
