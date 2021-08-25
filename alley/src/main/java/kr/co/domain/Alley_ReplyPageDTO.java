package kr.co.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
@Getter
public class Alley_ReplyPageDTO {
	
	private int replyCnt;
	private List<Alley_ReplyVO> list;

}
