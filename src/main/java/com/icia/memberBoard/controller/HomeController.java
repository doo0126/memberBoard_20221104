package com.icia.memberBoard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    // 기본 페이지
    @GetMapping("/")
    public String index(){
        return"index";
    }
    // 회원 가입을 위한 jsp 이동
    @GetMapping("/member/form")
    public String saveForm(){
        return "memberPages/save";
    }
}
