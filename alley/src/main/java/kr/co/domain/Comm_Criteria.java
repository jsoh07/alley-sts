package kr.co.domain;

import org.springframework.web.util.UriComponentsBuilder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Comm_Criteria {
	
	private int pageNum; // 현재 페이지 번호.
	private int amount; // 페이지당 게시물 수.
	private String type;// 검색 타입. 내용+제목+작성자
	private String keyword;// 검색어. 예) 새로
	
	public Comm_Criteria() {
		this(1,10);// 아래쪽 전달값 2개 생성자 호출.
	}
	
	public Comm_Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}
	
	public String[] getTypeArr() {
		// 검색 타입 배열 가져오기.
		return type == null ? new String[] {} : type.split("");
		// 검색타입이 널이라면 비어있는 문자열 배열을 만들고,
		// 그렇지 않다면, 검색타입을 한글자씩 잘라서 문자열 배열로 만듦.
		
	}
	
	public String getListLink() {
		UriComponentsBuilder builder
		= UriComponentsBuilder.fromPath("")
		.queryParam("pageNum", this.pageNum)
		.queryParam("amount", this.getAmount())
		.queryParam("type", this.getType())
		.queryParam("keyword", this.getKeyword());
		
		return builder.toUriString();
	}
}
