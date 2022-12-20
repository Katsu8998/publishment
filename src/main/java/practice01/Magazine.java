package practice01;

/**
 * 雑誌クラス このクラスでは雑誌コードを表しています。
 * 
 */

public class Magazine extends Publishment {
	private String magazineCode;

	public Magazine(String title, String content, int price, String magazineCode) {
		super(title, content, price);
		this.magazineCode = magazineCode;
	}

	public void Mcode() {
		int r = 0;
		for (int i = 0; i < 1; i++) {
			r = new java.util.Random().nextInt(150);
			this.magazineCode += r + "-";
		}
		r = new java.util.Random().nextInt(150);
		this.magazineCode += r;
		System.out.print(this.magazineCode);
	}

	public String getMagazineCode() {
		return magazineCode;
	}

	public void setMagazineCode(String magazineCode) {
		this.magazineCode = magazineCode;
	}
}
