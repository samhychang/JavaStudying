package bouns;

import java.util.Scanner;

public class bouns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    double dbouns=0, dprofit;
	    
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入當月利潤 (Enter 結束)：");
		dprofit = scanner.nextInt();
    	//System.out.println("當月利潤為：" + dprofit);
		scanner.close();
        
		// 大於 100萬的部分計算利潤 
		if (dprofit > 1000000)
		{
			dbouns =  (dprofit-=1000000) * 0.01;
			dbouns = dbouns + 400000 * 0.015;
			dbouns = dbouns + 200000 * 0.03;
			dbouns = dbouns + 200000 * 0.05;
			dbouns = dbouns + 100000 * 0.075;
			dbouns = dbouns + 100000 * 0.1;  
			} 
		else if (dprofit <= 1000000 && dprofit > 600000)  // 計算利潤介於 100萬~60 萬的部分
		{
			dbouns = dbouns + (dprofit-=600000) * 0.015;
			dbouns = dbouns + 200000 * 0.03;
			dbouns = dbouns + 200000 * 0.05;
			dbouns = dbouns + 100000 * 0.075;
			dbouns = dbouns + 100000 * 0.1;
			} 
		else if (dprofit <= 600000 && dprofit > 400000) // 計算利潤介於 40萬~60 萬的部分 
		{
			dbouns = dbouns + (dprofit-=400000) * 0.03;
			dbouns = dbouns + 200000 * 0.05;
			dbouns = dbouns + 100000 * 0.075;
			dbouns = dbouns + 100000 * 0.1;
			}
		else  if (dprofit <= 400000 && dprofit > 200000) // 計算利潤介於 20萬~40 萬的部分
		{
			dbouns = dbouns + (dprofit-=200000) * 0.05;
			dbouns = dbouns + 100000 * 0.075;
			dbouns = dbouns + 100000 * 0.1;
			}
		else if (dprofit <= 200000 && dprofit > 100000) // 計算利潤介於 10萬~20 萬的部分
		{
			dbouns = dbouns + (dprofit-=100000) * 0.075;
			dbouns = dbouns + 100000 * 0.1;
			}
		else if (dprofit <= 100000 ) // 計算利潤介於 10萬以下的部分
			dbouns = dbouns + dprofit * 0.1;

		System.out.println("當月獎金為：" + dbouns);

	}

}
