package com.example.hello.hellospring.controller.repository;

import com.example.hello.hellospring.controller.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);  //회원을 저장하면

    Optional<Member> findById(Long Id); //방금 아이디로 회원을 찾는걸 만든다.

    Optional<Member> findByName(String name);

    List<Member> findALl();
}
