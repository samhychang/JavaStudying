package exchange;

import java.util.Scanner;

public class exchange {
	//private static Scanner scanner;

	//private static Scanner scanner;

	public static void main(String[] args) {

		int price= 100000;
		float jap_num,usa_num, china_num;
		double mbr, usd, jpy;
		
	    Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入金額(Enter 結束)：");
		price = scanner.nextInt();
		scanner.close();
		
		//System.out.println("請輸入美金匯率(Enter 結束)：");
		//usa_num = scanner.nextFloat();
		//scanner.close();
		
		usa_num = (float)30.572;
	    china_num = (float) 4.706;
	    jap_num = 0.2802F;
		
	    usd = (float) price/usa_num;
		mbr = (float) price /china_num;	
		jpy = (float) price/jap_num;
	
		System.out.println("美金："+ usd);
		System.out.println("人民幣：" +mbr);
		System.out.println("日幣："+ jpy);
	}

}
