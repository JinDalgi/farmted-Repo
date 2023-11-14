package com.example.farmtedrepo.request_dto;

// MemberRequestDTO.java

import com.example.farmtedrepo.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter@Setter
@AllArgsConstructor
public class MemberRequestDto {

    private String name;
    private String role;
    private String phone;

    // getter, setter, 생성자 등

    public MemberRequestDto(Member member) {

    }
}
