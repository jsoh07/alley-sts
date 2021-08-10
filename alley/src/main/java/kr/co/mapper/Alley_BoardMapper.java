package kr.co.mapper;

import java.util.List;

import kr.co.domain.Alley_BoardVO;

public interface Alley_BoardMapper {
	
	public List<Alley_BoardVO> getList();
	
	public Alley_BoardVO read(Long ano);
}
