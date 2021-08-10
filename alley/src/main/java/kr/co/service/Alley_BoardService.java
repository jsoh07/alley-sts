package kr.co.service;

import java.util.List;

import kr.co.domain.Alley_BoardVO;

public interface Alley_BoardService {
	
	public Alley_BoardVO get(Long ano);
	
	public List<Alley_BoardVO> getList();

}
