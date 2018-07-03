
public class Mutiplication {

	public static void main(String[] args) {
		// 
		//int a=3,b=5, c;
		//c=a+++b;
		//System.out.println("c="+c+"b= "+b+"a = "+a);
		for (int i=2; i<10; i++)
		{
			for (int j =1; j<10; j++)
			{
				// 一行的列印格式
				//System.out.println(i+" x "+j+" = "+i*j);     
			    for ( int k = 0 ; k < 4 ; k++ ) // 格式化列印
				{
					System.out.printf ( "%d x %d = %d \t" , i + k , j , j * ( i + k ) );
				}
				System.out.println();
			}
			System.out.println();
			i= i+3;
		}
	}
}

