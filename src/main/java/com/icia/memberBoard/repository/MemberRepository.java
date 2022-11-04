package com.icia.memberBoard.repository;

import com.icia.memberBoard.DTO.MemberDTO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {
@Autowired
    private SqlSessionTemplate sql;


    public int memberEmailCheck(String q) {

       return   sql.selectOne("Member.emailCheck",q);
    }

    public void save(MemberDTO memberDTO) {
        sql.insert("Member.save",memberDTO);
    }
}
