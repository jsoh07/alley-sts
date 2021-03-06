package kr.co.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.domain.Comm_Criteria;
import kr.co.domain.Comm_ReplyVO;
import kr.co.domain.ReplyPageDTO;
import kr.co.mapper.Comm_BoardMapper;
import kr.co.mapper.Comm_ReplyMapper;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;


@Log4j // 롬복 로그 이용
@Service // 서비스 클래스를 알리고, 중간 처리를 담당.
@AllArgsConstructor // 모든 매개변수에 대한 생성자 생성. (생성자 여러개 아님)
public class Comm_ReplyServiceImp implements Comm_ReplyService {
	
	@Setter(onMethod_ = @Autowired)
	   private Comm_ReplyMapper crm;
	   // 매퍼를 조작할 수 있도록 멤버 변수를 생성하고,
	   // 객체를 자동 초기화 하고 있다.
	@Setter(onMethod_ =@Autowired)
		private Comm_BoardMapper cbm;
	
	@Transactional
	@Override
	public int register(Comm_ReplyVO vo) {
		log.info("register.." + vo);
		cbm.updateReplyCnt(vo.getBno(), 1);
		return crm.insert(vo);
	}

	@Override
	public Comm_ReplyVO get(Long rno) {
		log.info("get.." + rno);
		return crm.read(rno);
	}
	
	@Transactional
	@Override
	public int remove(Long rno) {
		log.info("remove.." + rno);
		Comm_ReplyVO vo = crm.read(rno);
		cbm.updateReplyCnt(vo.getBno(), -1);
		return crm.delete(rno);
	}

	@Override
	public int modify(Comm_ReplyVO reply) {
		log.info("modify.." + reply);
		return crm.update(reply);
	}

	@Override
	public List<Comm_ReplyVO> getList(Comm_Criteria cri, Long bno) {
		log.info("get reply list" + bno);
		return crm.getListWithPaging(cri, bno);
	}

	@Override
	public ReplyPageDTO getListPage(Comm_Criteria cri, Long bno) {
		return new ReplyPageDTO(crm.getCountByBno(bno),
			crm.getListWithPaging(cri, bno));
	}

}
