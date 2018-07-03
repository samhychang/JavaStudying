package minMax;

import java.util.Scanner;

public class minMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iMax, iMin, iNum1, iNum2, iNum3, iMed;
		
	    Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入三個數字(空白隔開，Enter 結束)：");
		iNum1 = scanner.nextInt();
		iNum2 = scanner.nextInt();
		iNum3 = scanner.nextInt();
		scanner.close();

		System.out.println("iNum1 = " + iNum1+ " iNum2 = "+iNum2 + " iNum3 = "+ iNum3);
		
		//num1 與Num2 比較後，大的數字是 Num1 接著跟num3 比較大小
		//iMax = (iNum1 >iNum2)?((iNum1>iNum3)?iNum1:iNum3):(iNum2);
	    iMax = (iNum1 >iNum2)? ((iNum1>iNum3)?iNum1:iNum3):((iNum2>iNum3)?iNum2:iNum3);
	    
	    iMin = (iNum1 <iNum2)? ((iNum1<iNum3)?iNum1:iNum3):((iNum2<iNum3)?iNum2:iNum3);
	    
	    iMed= (iNum1 >iNum2)? ((iNum1>iNum3)?iNum3:iNum1):((iNum2>iNum3)?iNum3:iNum2);
	    
		System.out.println("Max Number = " + iMax+ " Min Number = "+iMin+" Med. Number= "+iMed);
	
	}

}
