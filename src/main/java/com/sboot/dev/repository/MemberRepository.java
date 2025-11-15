package com.sboot.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sboot.dev.domain.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}