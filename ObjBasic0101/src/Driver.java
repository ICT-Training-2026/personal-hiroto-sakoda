
public class Driver {

	public static void main(String[] args) {
			
		// 山田さんのインスタンス化・メンバアクセス
		SalesEmployee yamada = new SalesEmployee();
		yamada.name = "山田太郎";
		yamada.salesAmt = 1000;
		System.out.println();
		yamada.displayInfo();
		
		//田中さんのインスタンス化・メンバアクセス
		SalesEmployee tanaka = new SalesEmployee();
		tanaka.name = "田中花子";
		tanaka.salesAmt = 500;
		System.out.println();
		tanaka.displayInfo();
		
		//山田さん 200円返品・田中さん 200円売り上げ
		yamada.refund(200);
		tanaka.sell(200);
		
		System.out.println("\n-----返品・売上処理後-----\n");
		yamada.displayInfo();
		System.out.println();
		tanaka.displayInfo();
		
		//合計表示
		System.out.println("\n2人の合計売上合計："
							+ (yamada.salesAmt + tanaka.salesAmt)
							+ "円");
	}
}
