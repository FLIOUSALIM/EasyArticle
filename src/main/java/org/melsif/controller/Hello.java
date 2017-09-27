package org.melsif.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;

/**
 * Created by fliou on 27/09/17.
 */

@Controller
public class Hello {

    @RequestMapping("/greeting")
    public String greeting(@PathVariable(value="name", required = false) String name, Model model) {
        model.addAttribute("name", name);
        return "login";
    }
}
