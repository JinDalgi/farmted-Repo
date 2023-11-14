package com.example.hello.hellospring.controller.repository;

import com.example.hello.hellospring.controller.domain.Member;

import javax.swing.text.html.Option;
import java.util.*;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    //실무에서는 동시성 문제가 있을수 있어서 공유되는 문서일때는 무엇을 써야하는데 예시이기 때문에 Hash Map 을 쓸께
    private static long sequence = 0L;
    // 시퀀스는 0,1,2 키 값을 생성해주는 애 ( 실무에서는 동시성 문제가 있어서 어텀 롱을 써야하는데 예제이기 때문 Long 을 사용한다

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {
       return store.values().stream()
                .filter(member -> member.getName().equals(name)) // 람다 사용됨
                .findAny(); //같은 경우에만 필터링 되고 그중에서 찾으면 반환하는것
    }

    @Override
    public List<Member> findALl() {
        return new ArrayList<>(store.values());
    }
}