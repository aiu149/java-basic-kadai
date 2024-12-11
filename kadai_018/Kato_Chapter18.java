package kadai_018;

abstract public class Kato_Chapter18 {

	public String familyName = "加藤";//姓を表す
	public String givenName;//名を表す
	public String address = "東京都中野区〇×";//住所を表す

	public void commonlntroduce() {

		System.out.println("私の名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}

	abstract public void eachlntroduce();

	public void execlntroduce() {
		commonlntroduce();
		eachlntroduce();
		System.out.println();
	}

}
