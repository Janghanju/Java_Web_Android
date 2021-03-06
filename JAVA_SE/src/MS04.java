import com.google.gson.Gson;

import kr.co.bit.BoardVO;

public class MS04 {

	public static void main(String[] args) {
		
		BoardVO[] arr = new BoardVO[3]; // ArrayList
		arr[0] = new BoardVO(1, "TEST", "TEST", "김갑동");
		arr[1] = new BoardVO(2, "TEST", "TEST", "김갑동");
		arr[2] = new BoardVO(3, "TEST", "TEST", "김갑동");
		
		Gson g = new Gson();
		String json = g.toJson(arr);
		System.out.println(json);
		
		BoardVO[] re = g.fromJson(json, BoardVO[].class);
		for(BoardVO vo : re) {
			System.out.println(vo);
		}
	}

}
