import java.text.DecimalFormat;
import java.util.Scanner;
public class temperature {

	public static void main(String[] args) {
		int temp = 31;
		double c_temp , f_temp;		
		//float c_temp , f_temp;		
		
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("請輸入攝氏溫度 (enter 結束)：");
        temp = scanner.nextInt();
		scanner.close();

		f_temp = temp * (float) 9/5 + 32;
		c_temp = (f_temp - 32) * (float) 5/9;

		System.out.println("攝氏 to 華氏 (None Format): " + f_temp);
		//DecimalFormat df=new DecimalFormat("#.##");
		DecimalFormat df=new DecimalFormat("##0.00");
		String s=df.format(f_temp);
		System.out.println("攝氏 to 華氏 (DecimalFormat): " + s);
		System.out.println("攝氏 to 華氏 (Math): " + Math.rint((f_temp*100)/100));
		
		System.out.println("華氏 to 攝氏: " + c_temp);
		
	}

}
