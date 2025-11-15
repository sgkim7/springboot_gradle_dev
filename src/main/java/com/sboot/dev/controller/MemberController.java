package com.sboot.dev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sboot.dev.domain.Member;
import com.sboot.dev.service.MemberService;

@RestController
public class MemberController {
	@Autowired
	MemberService testService;

	@GetMapping("/test")
	public List<Member> getAllMembers() {
		List<Member> members = testService.getAllMembers();
		return members;
	}
}