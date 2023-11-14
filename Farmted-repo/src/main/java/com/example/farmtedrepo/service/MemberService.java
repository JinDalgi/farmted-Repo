package com.example.farmtedrepo.service;

import com.example.farmtedrepo.domain.Member;
import com.example.farmtedrepo.repository.MemberRepository;
import com.example.farmtedrepo.request_dto.MemberRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// MemberService.java
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void signUp(MemberRequestDto requestDTO) {
        // 회원 가입 비즈니스 로직 수행
        // ...

        // Repository를 사용하여 Member 엔티티 저장
        Member member = new Member();
        member.setName(requestDTO.getName());
        member.setRole(requestDTO.getRole());
        member.setPhone(requestDTO.getPhone());

        // 다른 필드들 설정
        memberRepository.save(member);
    }

    public String login(MemberRequestDto requestDto) {
        // 로그인 비즈니스 로직 수행
        // ...

        // 로그인 성공 시 토큰 반환
        // return jwtToken;
    }
}
