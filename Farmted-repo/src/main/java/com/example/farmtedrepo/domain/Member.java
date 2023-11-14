package com.example.farmtedrepo.domain;

import jakarta.persistence.*;
import lombok.*;


// Member.java
@Getter@Setter
@NoArgsConstructor //지파에서 파인드에서 가져올때 비어있는 객체에 값을 집어 넣는것?
@Builder
@AllArgsConstructor
@Entity
@Table(name = "members")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String role;

    @Column(nullable = false, unique = true)
    private String phone;

    // 다른 필드들 및 관계 매핑 정보


    // getter, setter, 생성자 등


}
