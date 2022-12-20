package practice01;

import java.util.ArrayList;
import java.util.List;

/**
 * 出版物クラス このクラスには、本のタイトル、内容、金額を表しています。
 * 
 */
public class Publishment {
	/** タイトル */
	String title;
	/** 内容 */
	private String content = "内容";
	/** 金額 */
	private int price;

	public Publishment(String title, String conent, int price) {
		this.title = title;
		this.content = content;
		this.price = price;
	}

	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (o == null)
			return false;
		if (!(o instanceof Publishment))
			return false;
		Publishment publish = (Publishment) o;
		if (!this.title.equals(publish.title)) {
			return false;
		}
		return true;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public int getPrice() {
		return price;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
