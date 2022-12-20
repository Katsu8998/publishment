package practice01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean result = true;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		while (result) {
			System.out.println("タイトルを入力してください");
			String title = sc.nextLine();

			if (title.equals("漫画")) {
				// コントラクタとlistを使用したいため、下記のソースコードになっています。
				List<Books> book = new ArrayList<Books>();
				book.add(new Books(title, "内容", 200, ""));

				// 本のタイトル、内容、価格、ISBNをtemp変数に格納
				String temp = book.get(count).getTitle() + " " + "内容:" + book.get(count).getContent() + " " + "価格: "
						+ book.get(count).getPrice() + " " + "ISBN:";

				// book.get(count).code();をtempに格納できなかったため、System.out.print(temp);の下に配置。
				System.out.print(temp);
				book.get(count).Bcode();

			} else if (title.equals("雑誌")) {
				List<Magazine> magazine = new ArrayList<Magazine>();
				magazine.add(new Magazine(title, "内容", 600, ""));

				// 雑誌のタイトル、内容、価格、ISBNをtemp変数に格納
				String temp = magazine.get(count).getTitle() + " " + "内容:" + magazine.get(count).getContent() + " "
						+ "価格: " + magazine.get(count).getPrice() + " " + "ISBN:";

				System.out.print(temp);
				magazine.get(count).Mcode();
			} else {
				System.out.println("入力されたタイトルは存在しません。");
			}

			System.out.println("");
			boolean ans = true;
			while (ans) {
				System.out.println("検索を終了しますか Yes/y NO/n");
				String response = sc.next();
				if (response.equals("y")) {
					System.out.println("検索を終了します");
					result = false;
					ans = false;
				} else if (response.equals("n")) {
					ans = false;
					sc.nextLine();
				} else {

				}
			}
		}
	}
}
