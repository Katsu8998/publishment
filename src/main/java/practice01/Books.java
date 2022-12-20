package practice01;

/**
 * 書籍クラス このクラスでは、書籍のISBNを表しています。
 * 
 */
public class Books extends Publishment {
	private String isbn;;

	public Books(String title, String content, int price, String isbn) {
		super(title, content, price);
		this.isbn = isbn;
	}

//ISBNを作成
	public void Bcode() {
		int r = 0;
		for (int i = 0; i < 2; i++) {
			r = new java.util.Random().nextInt(150);
			this.isbn += r + "-";
		}
		r = new java.util.Random().nextInt(150);
		this.isbn += r;
		System.out.print(this.isbn);
	}

	public String toString() {
		return this.isbn;
	}

	public String getIsbn() {
		return isbn;
	}

}
