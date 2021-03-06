import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import kr.co.bit.BoardVO;

public class MS05 {

	public static void main(String[] args) {
		
		List<BoardVO> list = new ArrayList<BoardVO>();
		list.add(new BoardVO(1, "TEST", "TEST", "김길동"));
		list.add(new BoardVO(2, "TEST", "TEST", "김길동"));
		list.add(new BoardVO(3, "TEST", "TEST", "김길동"));
		list.add(new BoardVO(4, "TEST", "TEST", "김길동"));
		list.add(new BoardVO(5, "TEST", "TEST", "김길동"));
		
		Gson g = new Gson();
		String json = g.toJson(list);
		System.out.println(json);
		
//		BoardVO[] blist = g.fromJson(json, BoardVO[].class);
		List<BoardVO> blist = g.fromJson(json,
				new TypeToken<ArrayList<BoardVO>>() {}.getType());
		
		for(BoardVO i : blist) {
			System.out.println(i);
		}
	}

}
