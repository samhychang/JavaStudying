package encryption;

import java.util.Scanner;

public class encryption {

	public static void main(String[] args) {
		// 某個公司採用公用電話傳遞數據，數據是四位的整數，在傳遞過程中是加密的，加密規則如下：
		// 每位數字都加上5,然後用(個別位數的和)除以10的餘數代替該數字，再將第一位和第四位交換，第二位和第三位交換。

　　　當使用者輸入一數字時，請輸出其加密結果。
		int iNum1, iNum2, iNum3,iNum4;
		//int[] thisIsAnIntrray = new int[4];
		
		//Case 1:Use integer		
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入四位整數(空白隔開，Enter 結束)：");
		iNum1 = scanner.nextInt();
		iNum2 = scanner.nextInt();
		iNum3 = scanner.nextInt();
		iNum4 = scanner.nextInt();
		scanner.close();
    	System.out.println(" Number1= "+iNum1+" Number2= "+iNum2+" Number3= "+iNum3+" Number4= "+iNum4);

		iNum1+=5;
		iNum2+=5;
		iNum3+=5;
		iNum4+=5;

		iNum1%=10;
		iNum2%=10;
		iNum3%=10;
		iNum4%=10;

    	System.out.println(" Number1= "+iNum4+" Number2= "+iNum3+" Number3= "+iNum2+" Number4= "+iNum1);

    	//Case 1:Use integer array		
		
	}

}
