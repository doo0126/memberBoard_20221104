package com.icia.memberBoard.service;

import com.icia.memberBoard.DTO.MemberDTO;
import com.icia.memberBoard.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;


    public String memberEMailCheck(String q) {
            String result;
        int resultInt= memberRepository.memberEmailCheck(q);
            if(resultInt >0){
                result="성공";
            }
            else{
                result="실패";
            }
            return result;

    }

    public void save(MemberDTO memberDTO) {
        memberRepository.save(memberDTO);
    }
}
