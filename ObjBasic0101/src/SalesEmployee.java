
public class SalesEmployee {
	
	//フィールド
	String name; //名前
	int salesAmt; //売上合計金額
	
	//メソッド
	//売上(プラス)
	int sell(int amt) {
		return salesAmt += amt; //処理後の売上合計金額
	}
	
	//返品(マイナス)
	int refund(int amt) {
		return salesAmt -= amt; //処理後の売上合計金額
	}
	
	//情報表示
	void displayInfo() {
		System.out.println("名前：" + name);
		System.out.println("売上：" + salesAmt + "円");
	}

}
