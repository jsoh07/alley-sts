package kr.co.mapper;

import kr.co.domain.AuthVO;

import kr.co.domain.General_MemberVO;

public interface General_MemberMapper {
	
	public General_MemberVO read(String userid);

	public void signup(General_MemberVO vo);
	
	public void insertAuth(AuthVO auth);
	
	public int CheckId(General_MemberVO vo);
	
	public int CheckEmail(General_MemberVO vo);
	
	public int CheckPhone(General_MemberVO vo);
}
