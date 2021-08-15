package kr.co.service;

import java.util.List;

import kr.co.domain.Alley_BoardVO;

public interface Alley_BoardService {
	
	public List<Alley_BoardVO> best1();
	
	public List<Alley_BoardVO> best2();
	
	public List<Alley_BoardVO> best3();
	
	public List<Alley_BoardVO> getList();

	public Alley_BoardVO view(Long ano);
	
}
