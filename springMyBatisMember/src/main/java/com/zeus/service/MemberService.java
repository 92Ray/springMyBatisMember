package com.zeus.service;

import java.util.List;

import com.zeus.domain.Member;

public interface MemberService {
	// 회원 가입 -> 비즈니스모델(회원테이블가입, 회원권한테이블 가입)
	public int register(Member member) throws Exception;
	
	// 회원리스트, 회원정보, 회원정보수정, 회원삭제, 권한삭제
	public List<Member> list() throws Exception;
	public Member read(Member member) throws Exception;
	public int update(Member member) throws Exception;
	// 회원삭제 -> 비즈니스모델에선 회원테이블에서도 삭제가 되고, 회원권한 테이블에서도 삭제가 같이 이루어짐.
	public int delete(Member member) throws Exception;
	
}
