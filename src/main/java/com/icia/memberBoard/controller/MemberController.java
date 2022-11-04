package com.icia.memberBoard.controller;

import com.icia.memberBoard.DTO.MemberDTO;
import com.icia.memberBoard.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
    @Autowired
    private MemberService memberService;
// 이메일 체크 리턴 String
    @PostMapping("/member/memberEmailCheck")
    public String memberEmailCheck(@RequestParam("q") String q){
        System.out.printf("%s\n",q);
       String result = memberService.memberEMailCheck(q);

        System.out.printf("dd%s\n" , result);
        return result;
    }
    @PostMapping("/member/save")
    public String save(@ModelAttribute MemberDTO memberDTO){
        memberService.save(memberDTO);
        return "index";
    }

}
