<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-11-04
  Time: 오전 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="/resources/js/jquery.js"></script>
    <title>회원 가입 페이지</title>
</head>
<body>
<form action="/member/save" method="post" enctype="multipart/form-data">
    <input type="text" placeholder="이메일" name="memberEmail" id="memberEmail" onblur="memberEmailCheck()">
    <input type="text" placeholder="비밀번호" name="memberPassword" class="form-control">
    <input type="text" placeholder="이름" name="memberName" class="form-control">
    <input type="text" placeholder="전화번호(- 입력x)" name="memberMobile" class="form-control">
    <input type="file" name="memberProfile" class="form-control">

    <input type="submit" value="확인" class="btn btn-primary" onclick="">
</form>
</body>
<script>
    const memberEmailCheck = () => {
        const memberEmailCheck = document.getElementById("memberEmail").value;
        console.log("입력한 이메일 값" + memberEmailCheck);
        $.ajax({
            type: "post",
            url: "/member/memberEmailCheck",
            dataType: "text",
            success: function (result) {
                if (result == "성공") {
                    console.log("사용가능");
                } else {
                    console.log("사용 불가");

                }

            },
            error() {
                alert("실패")
            },

        });
    }

</script>
</html>
