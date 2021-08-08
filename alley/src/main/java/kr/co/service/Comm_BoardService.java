package kr.co.service;

import java.util.List;

import kr.co.domain.Comm_BoardVO;
import kr.co.domain.Comm_Criteria;

public interface Comm_BoardService {
		
	public void register(Comm_BoardVO cb);// 등록

	public Comm_BoardVO get(Long bno);// 읽기

	public boolean modify(Comm_BoardVO cb);// 수정

	public boolean remove(Long bno);// 삭제

	public List<Comm_BoardVO> getList(Comm_Criteria cri);// 목록
	
	public int getTotal(Comm_Criteria cri);

}
