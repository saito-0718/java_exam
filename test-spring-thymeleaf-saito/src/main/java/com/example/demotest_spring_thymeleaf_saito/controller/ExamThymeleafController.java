package com.example.demotest_spring_thymeleaf_saito.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demotest_spring_thymeleaf_saito.domain.Member;
import com.example.demotest_spring_thymeleaf_saito.form.MemberForm;

@Controller
@RequestMapping("/exam")
public class ExamThymeleafController {

    @ModelAttribute
    public MemberForm setUpForm() {
        return new MemberForm();
    }

    @RequestMapping("")
    public String index() {
        return "ex-thymeleaf-input";
    }

    @RequestMapping("/result")
    public String result(MemberForm form, Model model) {
        Member member = new Member();
        member.setName(form.getName());
        member.setAge(form.getIntAge());
        member.setHobbyList(form.getHobbyList());
        model.addAttribute("member", member);
        return "ex-thymeleaf-result";
    }
}
