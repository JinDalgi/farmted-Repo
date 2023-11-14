package com.example.farmtedrepo.controller;

import com.example.farmtedrepo.request_dto.MemberRequestDto;
import com.example.farmtedrepo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// MemberController.java
@RestController
@RequestMapping("/members")
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/signup")
    public ResponseEntity<Void> signUp(@RequestBody MemberRequestDto requestDTO) {
        // 회원 가입 로직 수행
        memberService.signUp(requestDTO);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody MemberRequestDto requestDTO) {
        // 로그인 로직 수행
        String token = memberService.login(requestDTO);
        return ResponseEntity.ok(token);
    }
}
