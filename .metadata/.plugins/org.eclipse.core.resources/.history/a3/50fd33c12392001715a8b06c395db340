import com.google.gson.Gson;

import kr.co.bit.BoardVO;

public class MS03 {

	public static void main(String[] args) {
		
		BoardVO vo = new BoardVO(1, "TEST", "TEST", "김동일");
		Gson g = new Gson();
		String json = g.toJson(vo);
		System.out.println(json);
		
		BoardVO bo = g.fromJson(json, BoardVO.class);
		System.out.println(bo);
	}

}
/*
 * Model(class)
 * 1. vo(DTO : Data Transfer Object) : 데이터구조
 * 2. DAO(Data access Object)		: DataBase에 CRUD
 * 3. Utility						: 도움을 주는 객체
 * ---------------------------------------------------
 * Java 제공 API
 * - String, Integer, Date~
 * - ArrayList, HashMa~
 * ---------------------------------------------------
 * 다른 기업에서 제공해주는 API : http://mvnrepository.com
 * Gson(JSON)
 * POI(Excel)
 * PdfWrite(PDF)
 * Jericho(HTEML Parsing)
*/