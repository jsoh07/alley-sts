package kr.co.service;

import kr.co.domain.AuthVO;

import kr.co.domain.General_MemberVO;

public interface General_MemberService {
	
	public General_MemberVO login (String userid); // 로그인
	
	public void signup(General_MemberVO vo, AuthVO auth); // 회원가입
	
	public int CheckId(General_MemberVO vo); // 아이디 체크
	
	public int CheckEmail(General_MemberVO vo); // 이메일 체크
	
	public int CheckPhone(General_MemberVO vo); // 전화번호 체크
}
