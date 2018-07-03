package encryption;

import java.util.Scanner;

public class encryption {

	public static void main(String[] args) {
		// 
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
