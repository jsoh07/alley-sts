package kr.co.domain;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PageDTO {

	// DTO : Data Transfer Object
	// 1~10 쪽번호 표시 예정.
	private int startPage;// 페이징 시작, 처음 목록이라면 1
	private int endPage;// 페이징 끝, 처음 목록이라면 10
	private boolean prev, next;// 이전,다음으로 가기
	private int total;// 총 게시물 수 10
	private Comm_Criteria cri;// 현재 페이지와 페이지당 게시물수

	public PageDTO(Comm_Criteria cri, int total) {
		this.cri = cri;
		this.total = total;

		this.endPage = (int) (Math.ceil(cri.getPageNum() / 10.0)) * 10;
		// 1페이지라고 가정하면 endPage 는 10
		this.startPage = this.endPage - 9;// 1
		int realEnd = (int) (Math.ceil((total * 1.0) / cri.getAmount()));
		// (11.0/10) = 1.1이 되는데 올림 처리하고,정수화 하면 2.
		// 총게시물이 11개라고 가정하면 realEnd=2
		// 페이지당 보여줄 게시물 수는 10개로 가정.

		if (realEnd < this.endPage) {
			this.endPage = realEnd;
		}
		this.prev = this.startPage > 1;
		this.next = this.endPage < realEnd;
	}
}
