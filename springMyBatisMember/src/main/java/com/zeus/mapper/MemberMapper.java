package com.zeus.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zeus.domain.Member;
import com.zeus.domain.MemberAuth;

@Mapper
public interface MemberMapper {
	// 회원 가입 및 권한설정
	public int create(Member member) throws Exception; 
	public int createAuth(MemberAuth memberAuth) throws Exception; 
	 
	// 회원리스트, 회원정보, 회원정보수정, 회원삭제, 권한삭제
	public List<Member> list() throws Exception; 
	public Member read(Member member) throws Exception; 
	public int update(Member member) throws Exception; 
	
	public int delete(Member member) throws Exception; 
	public int deleteAuth(Member member) throws Exception;
	
	public List<Member> search(Member member) throws Exception;
}
