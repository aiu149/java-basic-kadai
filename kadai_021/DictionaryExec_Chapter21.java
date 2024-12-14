package kadai_021;

public class DictionaryExec_Chapter21 {
	public static void main(String[] args) {
		// Dictionary_Chapter21クラスのインスタンスを生成
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

		// 調べる単語を配列に格納
		String[] words = { "apple", "banana", "grape", "orange" };

		// 配列の単語を順番に処理して意味を調べて出力
		for (String word : words) {
			String meaning = dictionary.search(word); // 辞書から意味を取得
			System.out.println(word + "の意味は" + meaning);
		}
	}
}