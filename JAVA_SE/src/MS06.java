import java.net.URL;
import java.util.List;

import net.htmlparser.jericho.Element;
import net.htmlparser.jericho.HTMLElementName;
import net.htmlparser.jericho.Source;

public class MS06 {

	public static void main(String[] args) {
		
		// HTML Parsing API(jericho)
		String url = "http://www.su.or.kr/03bible/daily/qtView.do?qtType=QT1";
		try {
			URL u = new URL(url);
			Source src = new Source(u);
//			System.out.println(src);
			
				// Element -> Tag
			List<Element> plist = src.getAllElements(HTMLElementName.P);
//			System.out.println(plist);
			
			for(Element p : plist) {
				String ptag = p.toString();
				if(ptag.indexOf("subject") != -1) {
//					System.out.println(ptag);
					String title = ptag.substring(ptag.indexOf(">")+1, ptag.lastIndexOf("<"));
					System.out.println("제목 : " + title);
					break;
				}
			}
			
			for(Element p : plist) {
				String ptag = p.toString();
				if(ptag.indexOf("book_line\"") != -1) {
					String title = ptag.substring(ptag.indexOf(">")+1, ptag.lastIndexOf("<"));
					String subject = ptag.substring(ptag.indexOf("[")+1, ptag.lastIndexOf("]"));
					String day = ptag.substring(ptag.indexOf(">")+1, ptag.lastIndexOf("&nbsp")-6);
					System.out.println("날자 : " + day.trim() + " " + subject);
					break;
				}
			}
			
			List<Element> trlist = src.getAllElements(HTMLElementName.TR);
//			System.out.println(trlist);
			for(Element tr : trlist) {
				String trg = tr.toString();
				String th = trg.substring(trg.indexOf("<th>")+4, trg.lastIndexOf("</th>"));
				String td = trg.substring(trg.indexOf("<td>")+4, trg.lastIndexOf("</td>"));
				System.out.println(th + ":" + td);
			}
			
			for(Element p : plist) {
				String ptag = p.toString();
				if(ptag.indexOf("book_line2") != -1) {
					String comment = ptag.substring(ptag.indexOf(">")+4, ptag.lastIndexOf("<"));
					System.out.println("해설 : " + comment.trim());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
