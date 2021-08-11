package kr.co.mapper;

import java.util.List;


import org.apache.ibatis.annotations.Param;

import kr.co.domain.Comm_BoardVO;
import kr.co.domain.Comm_Criteria;

public interface Comm_BoardMapper {
	
	public List<Comm_BoardVO> getList();
	
	public void insert(Comm_BoardVO cb);// 글쓰기
	// bno 는 시퀀스 자동 생성으로 나머지 값만 입력.
	public void insertSelectKey(Comm_BoardVO cb);// 글쓰고 글번호 받기
	// 생성되는 시퀀스 값을 확인하고 나머지 값 입력.
	public Comm_BoardVO read(Long bno);// 읽기
	
	public int delete(Long bno);// 삭제
	
	public int update(Comm_BoardVO cb);// 수정.
	
	public List<Comm_BoardVO> getListWithPaging(Comm_Criteria cri);
	
	public int getTotalCount(Comm_Criteria cri);
	
	public void updateReplyCnt(@Param("bno") Long bno, @Param("amount") int amount);
	// 게시물별 댓글의 갯수 표시
	
}
