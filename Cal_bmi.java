
public class Cal_bmi {

	public static void main(String[] args) {
		// 使用 args 帶入資料
		String x = args[0];
		String name=args[1];
		int    y = Integer.parseInt(args[2]);
		float h;
		//Float y = Float.parseFloat(args[2]);
		int    z = Integer.parseInt(args[3]);
		float fbmi;
		
		String weight = "體重";
		String hight ="身高";
		String cm="公分";
		String m="米";
		String kg="公斤";
		
		System.out.println(x);
		System.out.println("Name:"+ name);
			
		 h = (float) y/100;	
		System.out.println(hight+y+cm);
		System.out.println(hight+h+m);
		System.out.println(weight+z+kg);
		
		//fbmi= (float) (z / (y^2));
		fbmi= (float) (z / (double) (h*h));
		System.out.println(name + "的身材比例係數(BMI)為"+fbmi);		
		//String s1="";
		
		String str = (fbmi >27)?("肥胖"):(fbmi <18.5? ("體重過輕"):(fbmi >24)?("過重"):("適中"));
		System.out.println(name +"體重"+z +"公斤"+str+"參考BMI為"+fbmi);		

		if (fbmi > 27)
		{
			System.out.println(name+"太重了" +"他的身材比例係數為"+fbmi);
		}
		else if(fbmi<18)
		{
			System.out.println(name+"太輕了" +"他的身材比例係數為"+fbmi);
		}
		else
			System.out.println(name+"標準體重" +"他的身材比例係數為"+fbmi);
		
	}

}
