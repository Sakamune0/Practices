package practices;

/**
 * 入力された文字の中に "ge" という文字列が含まれているか判定する関数 ge を作成しなさい
 * <p>
 * 引数：文字列
 * 返却：true/false
 */

public class Practice015 {
    public static void main(String[] args) {
        // ここはご自由にお使いください
        System.out.println(ge("genki"));
    }

    // "ge" という文字列が含まれているならtrue
    public static boolean ge(String str) {
        return str.contains("ge") ;
    }
}

/* metchsはboolean型で返せない、indexOf("ge") > 0 ;*/