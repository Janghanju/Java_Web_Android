import kr.co.bit.BoardVO;

public class MS01 {
	public static void main(String[] args) {
		
		BoardVO vo= new BoardVO(1, "연습", "연습", "홍길동");
		System.out.print(vo.toString());

		// 1. 배열 : BoardVO[]
		BoardVO[] arr = new BoardVO[3];
		arr[0] = new BoardVO(1, "1연습", "연습1", "홍길동1");
		arr[1] = new BoardVO(2, "2연습", "연습2", "홍길동2");
		arr[2] = new BoardVO(3, "3연습", "연습3", "홍길동3");
		// for
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		for(BoardVO i : arr) {
			System.out.println(i);
		}
	}
}
