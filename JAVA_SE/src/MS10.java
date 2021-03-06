import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class MS10 {

	public static void main(String[] args) {
		
		// OpenAPI : 다른회사가 가지고 있는 데이터에 접근하기위해서 제공하는 API
		// 접근 URL(www.naver.com)
		
		// 네이버 지도 API 예제 - 주소좌표변환
		String clientId = "33rVNyswsnY1HNxdO43g";//애플리케이션 클라이언트 아이디값";
	    String clientSecret = "ji1ak2kQrJ";//애플리케이션 클라이언트 시크릿값";
	    try {
	    		BufferedReader inaddr = new BufferedReader(new InputStreamReader(System.in));
	    		
	    		System.out.print("주소입력 : ");
	    		String line = inaddr.readLine();
	        String addr = URLEncoder.encode(line, "UTF-8");
	        String apiURL = "https://openapi.naver.com/v1/map/geocode?query=" + addr; //json
	        
	        //String apiURL = "https://openapi.naver.com/v1/map/geocode.xml?query=" + addr; // xml
	        URL url = new URL(apiURL);
	        HttpURLConnection con = (HttpURLConnection)url.openConnection();
	        con.setRequestMethod("GET");
	        con.setRequestProperty("X-Naver-Client-Id", clientId);
	        con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
	        int responseCode = con.getResponseCode();
	        BufferedReader br;
	        
	        if(responseCode==200) { // 정상 호출
	            br = new BufferedReader(new InputStreamReader(con.getInputStream(),"utf-8"));
	        } else {  // 에러 발생
	            br = new BufferedReader(new InputStreamReader(con.getErrorStream(),"utf-8"));
	        }
	        
	        String inputLine;
	        StringBuffer response = new StringBuffer();
	        while ((inputLine = br.readLine()) != null) {
	            response.append(inputLine);
	        }
	        
	        br.close();
	        String data = response.toString();
	        data = data.substring(data.indexOf("x\":")-1);
//	        System.out.println(data);
	        String x = data.substring(data.indexOf(":")+2, data.indexOf(","));
	        	String y = data.substring(data.lastIndexOf(":")+2, data.indexOf("}"));
	        	
	        	System.out.println("x : "+x);
	        	System.out.println("y : "+y.trim());
	    } catch (Exception e) {
	        System.out.println(e);
	    }
		
	}

}
