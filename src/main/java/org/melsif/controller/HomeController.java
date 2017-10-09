package org.melsif.controller;

import org.apache.log4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by fliou on 01/10/17.
 */

@Controller
public class HomeController {

    private static final Logger LOGGER =  Logger.getLogger(HomeController.class);

    @GetMapping("/home")
    public String home(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String name = authentication.getName();
        LOGGER.info(name);
        model.addAttribute("name", name);
        return "home";
    }
}
