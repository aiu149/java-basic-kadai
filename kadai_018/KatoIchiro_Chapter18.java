package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
	
	public KatoIchiro_Chapter18(String familyName,String address) {
		super(familyName,address);
	}
	
    public void setGivenName(String givenName ) {
	
	    this.givenName = givenName;
	    System.out.println();
	
 }
public void eachlntroduce() {
	System.out.println("私の名前は加藤" + givenName + "です");
	System.out.println("好きな食べ物はリンゴです");
	
}

}
