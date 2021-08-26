package kr.co.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.domain.AuthVO;
import kr.co.domain.General_MemberVO;
import kr.co.mapper.General_MemberMapper;
import lombok.extern.log4j.Log4j;

@Service
@Transactional
@Log4j
public class General_MemberServiceImp implements General_MemberService {
	
	@Autowired
	General_MemberMapper gmm;
	
	// 로그인
	@Override
	public General_MemberVO login(String userid) {
		General_MemberVO vo = gmm.read(userid); 
		return vo;
	}
	
	// 회원가입
	@Override
	@Transactional
	public void signup(General_MemberVO vo, AuthVO auth) {
		gmm.signup(vo);
		gmm.insertAuth(auth);

	}
	
	// 아이디체크
	@Override
	public int CheckId(General_MemberVO vo) {
		int result = gmm.CheckId(vo);
		return result;
	}
	
	// 이메일체크
	@Override
	public int CheckEmail(General_MemberVO vo) {
		int result = gmm.CheckEmail(vo);
		return result;
	}
	
	// 전화번호체크
	@Override
	public int CheckPhone(General_MemberVO vo) {
		int result = gmm.CheckPhone(vo);
		return result;
	}

}
