package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		
		KatoTaro_Chapter18 a = new KatoTaro_Chapter18("加藤","太郎","東京都中野区");
		KatoIchiro_Chapter18 b = new KatoIchiro_Chapter18("加藤","一郎","東京都中野区");
		KatoHanako_Chapter18 c = new KatoHanako_Chapter18("加藤","花子","東京都中野区");
		
		a.setGivenName();
		a.execlntroduce();
		b.setGivenName();
		b.execlntroduce();
		c.setGivenName();
		c.execlntroduce();
		

	}

}
