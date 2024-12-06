package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		KatoTaro_Chapter18 a = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 b = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 c = new KatoHanako_Chapter18();
		
		a.setGivenName("太郎");
		a.setFamilyName("加藤");
		a.setAddress("東京都中野区");
		
		a.execlntroduce();
		
		b.setGivenName("一郎");
		b.setFamilyName("加藤");
		b.setAddress("東京都中野区");
			
		b.execlntroduce();
		
		c.setGivenName("太郎");
		c.setFamilyName("加藤");
		c.setAddress("東京都中野区");
		
		
		c.execlntroduce();
		

	}

}
