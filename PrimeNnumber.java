
public class PrimeNnumber {

	public static void main(String[] args) {
		// TODO 列印出100-200之間的所有質數

		for (int i=100; i<201; i++ )
		{
			boolean pflag=true;

			for (int j=2; j<i-1; j++)
			{
				int z=i%j;
				if (z==0) //不是質數繼續迴圈
				{
					pflag=false;
					break;
				}

			}
			if (pflag)
			{
	    	 	System.out.println("質數:"+i);
			}
		}
		
	}

}
