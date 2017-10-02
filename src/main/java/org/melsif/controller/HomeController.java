package org.melsif.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by fliou on 01/10/17.
 */

@Controller
public class HomeController {

    @RequestMapping(method = RequestMethod.GET, value = "/home")
    public String home() {
        return "home";
    }
}
