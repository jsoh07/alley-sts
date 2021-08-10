package kr.co.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.domain.Alley_BoardVO;
import kr.co.mapper.Alley_BoardMapper;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;


@Log4j
@Service
@AllArgsConstructor
public class Alley_BoardServiceImp implements Alley_BoardService {
	
	@Setter(onMethod_= @Autowired)
	private Alley_BoardMapper abm;

	@Override
	public Alley_BoardVO get(Long ano) {
		log.info("get.." + ano);
		return abm.read(ano);
	}

	@Override
	public List<Alley_BoardVO> getList() {
		log.info("getList..");
		return abm.getList();
	}

}
