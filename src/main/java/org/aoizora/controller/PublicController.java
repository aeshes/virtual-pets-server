package org.aoizora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/public")
public class PublicController {

    private final String version;

    @Autowired
    public PublicController(String version) {
        this.version = version;
    }

    @GetMapping("/version")
    public String version(Model model) {
        model.addAttribute("version", version);

        return "version";
    }
}
