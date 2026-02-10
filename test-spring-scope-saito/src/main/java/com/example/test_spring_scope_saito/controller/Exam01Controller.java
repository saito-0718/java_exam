package com.example.test_spring_scope_saito.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam01")
public class Exam01Controller {

    @RequestMapping("")
    public String index() {
        return "exam01";
    }

    @RequestMapping("/login")
    public String login(String email, String password, Model model) {
        model.addAttribute("result", //
                canLogin(email, password) ? "成功" : "失敗");
        return "exam01-result";
    }

    private boolean canLogin(String email, String password) {
        return email.equals("yamada@sample.com")
                && password.equals("yamayama");
    }

}
