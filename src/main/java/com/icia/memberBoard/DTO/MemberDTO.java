package com.icia.memberBoard.DTO;

import com.icia.memberBoard.service.MemberService;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MemberDTO {
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private String memberMobile;

    //file을 담을 수 있는 필드 만들기
    private MultipartFile boardFile;
    //원본 파일
    private String  originalFileName;
    //서버용 관리 파일
    private String storedFileName;
    //파일 첨부 여부
    private int fileAttached;



}
