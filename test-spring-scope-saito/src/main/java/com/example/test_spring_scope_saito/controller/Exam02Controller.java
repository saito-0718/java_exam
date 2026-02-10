package com.example.test_spring_scope_saito.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/exam02")
public class Exam02Controller {

    @Autowired
    private HttpSession session;

    @RequestMapping("")
    public String index() {
        return "exam02";
    }

    @RequestMapping("/result")
    public String result(String num1, String num2) {
        int result = sum(num1, num2);
        session.setAttribute("num1", num1);
        session.setAttribute("num2", num2);
        session.setAttribute("result", result);
        return "exam02-result";
    }

    @RequestMapping("/result2")
    public String getResult2() {
        return "exam02-result2";
    }

    private int sum(String num1, String num2) {
        int intNum1 = Integer.valueOf(num1);
        int intNum2 = Integer.valueOf(num2);
        return intNum1 + intNum2;
    }

}
