package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	// HashMapを使って辞書を作成
	private HashMap<String, String> dictionary;

	// コンストラクタで辞書を初期化
	public Dictionary_Chapter21() {
		dictionary = new HashMap<>();

		// 辞書に英単語と意味を追加
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
	}

	// 単語の意味を調べるメソッド
	public String search(String word) {
		// 辞書に単語が存在するか確認
		if (dictionary.containsKey(word)) {
			return dictionary.get(word);// 単語の意味を返す
		} else {
			return "辞書に存在しません"; // 存在しない場合
		}
	}
}