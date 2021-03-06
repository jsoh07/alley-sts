package kr.co.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import kr.co.domain.CustomUser;
import kr.co.domain.General_MemberVO;
import kr.co.mapper.General_MemberMapper;
import lombok.Setter;
import lombok.extern.log4j.Log4j;



@Log4j
public class CustomUserDetailsService implements UserDetailsService {
	
	@Setter(onMethod_ = { @Autowired })
	private General_MemberMapper gmm;
	// 쿼리 조작을 위한 매퍼 인터페이스 초기화
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		log.warn("load user by username : " + username);
		General_MemberVO vo = gmm.read(username);
		// 전달된 id로 사용자 정보를 검색
		
		return vo == null ? null : new CustomUser(vo);
		// 검색되지 않으면 널, 검색되면 해당 정보 리턴
		
		// 즉, 아이디와 패스워드로 로그인을 시도한다면
		// 입력한 아이디를 가지고 회원 정보와 권한을 추출하고
		// 그 정보를 이용하여 CustomUser 객체를 초기화 하고
		// CustomUser 객체를 이용하여 UserDetails 객체를 초기화.
	}

}
