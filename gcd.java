import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		int iNum1, iNum2, iFact;

		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入兩個整數(空白隔開，Enter 結束)：");
		iNum1 = scanner.nextInt();
		iNum2 = scanner.nextInt();
	   	System.out.println(" Number1= "+iNum1+" Number2= "+iNum2);
		scanner.close();

	  /*
	   	// Divisor 因數
	    if (iNum1 < 0 || iNum2 < 0) { 
	    	System.out.println("請輸入正整數");
	    	return;
	    }
	    if (iNum1 == 0 || iNum2 == 0) {
	    	System.out.println("0 是因數");
	    	return;
	    }
	    for (int i=1; i<=iNum1; ++i)
	        if (iNum1 % i == 0)
	        	System.out.println(iNum1 + "的因數有" +i);
		
		//private int GCD(int a, int b) {
		//	return a % b == 0 ? b : GCD(b, a % b);
		//}
		//private int LCM(int a, int b) { 
		//	return a * b / GCD(a, b);
		//}
	   	*/
		
		// Use recursive method 
		iFact = _gcd(iNum1, iNum2);       // kicks off the recursive function
	    System.out.println(iNum1+"與"+ iNum2+"的最大公因數為 " + iFact); // prints 21

	    System.out.println(iNum1+"與"+ iNum2+"的最小公倍數為 " + LCD(iNum1, iNum2)); // prints 21

	}

	 public static int _gcd(int n1, int n2)
	  {
	    //System.out.println("Before While n1="+n1+" n2= " + n2); // prints 21
		 while (n2 != 0)
		    {
		        int t = n1 % n2;
		        n1 = n2; n2 = t;
			    //System.out.println("n1="+n1+" n2= " + n2+" t ="+t); // prints 21
		    }
		    return n1;
	  }
	
	 public static int LCD(int n1, int n2)
	  {
	    //System.out.println("Before While n1="+n1+" n2= " + n2); // prints 21
	    return n1 * n2 / _gcd(n1, n2);
	  }
}
