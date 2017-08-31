package kr.co.bit;
// class -> 객체를 계하는 도구(Modeling)
public class BoardVO {
	// 상태정보(정보은닉)
	private int bno;
	private String title;
	private String content;
	private String writer;

	// 생략되어있는 매서드(디폴트 생성자 매서드)
	public BoardVO() {}
	
	public BoardVO(int bno, String title, String content, String writer) {
		super();
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	// setter getter method
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	
}
