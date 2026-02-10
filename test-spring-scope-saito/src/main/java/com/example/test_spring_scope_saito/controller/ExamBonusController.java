package com.example.test_spring_scope_saito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test_spring_scope_saito.domain.User;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/exam03")
public class ExamBonusController {

    @Autowired
    private HttpSession session;

    @RequestMapping("")
    public String index() {
        return "exam-bonus-input";
    }

    @RequestMapping("/login")
    public String login(String email, String password, Model model) {
        if (canLogin(email, password)) {
            User yamada = new User();
            yamada.setName("山田太郎");
            yamada.setEmail("yamada@sample.com");
            yamada.setAge(18);
            session.setAttribute("user", yamada);
            return "exam-bonus-result";
        } else {
            session.setAttribute("result", "失敗");
            return "exam-bonus-input";
        }
    }

    private boolean canLogin(String email, String password) {
        return email.equals("yamada@sample.com")
                && password.equals("yamayama");
    }

}
