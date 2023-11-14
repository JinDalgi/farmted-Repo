package com.example.farmtedrepo.repository;


import com.example.farmtedrepo.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

// MemberRepository.java
public interface MemberRepository extends JpaRepository<Member, Long> {
    // 추가적인 쿼리 메서드 등
}
