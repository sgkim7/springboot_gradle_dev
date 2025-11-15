package com.sboot.dev.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sboot.dev.domain.Member;
import com.sboot.dev.repository.MemberRepository;

@Service
public class MemberService {

	@Autowired
	MemberRepository memberRepository;

	public List<Member> getAllMembers() {
		return memberRepository.findAll();
	}
}
