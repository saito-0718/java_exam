package com.example.test_spring_mvc_saito.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test_spring_mvc_saito.form.ReceiveNameForm;

@Controller
@RequestMapping("/exam03")
public class ReceiveNameController {

    @ModelAttribute
    public ReceiveNameForm setUpForm() {
        return new ReceiveNameForm();
    }

    @RequestMapping("")
    public String index() {
        return "name-form";
    }

    @RequestMapping("/finish")
    public String finish(String name) {
        System.out.println("入力された値は" + name + "です");
        return "finished";
    }

    @RequestMapping("/exam04")
    public String exam04(ReceiveNameForm form) {
        System.out.println("入力された値は" + form.getName() + "です");
        return "finished";
    }

}
