import java.util.Arrays;
import java.util.Scanner;

public class grade {

	public static void main(String[] args) {
		
		//(1)共要輸入三位學生的成績(自已的．和左右邊的同學)
		//(2)請輸入學生姓名-->先暫時用英文名字
		//(3)請輸入5項成績 --> 國、英、數、自然、社會(請用陣列來存放其分數)
		//(4)計算其平均值，並列表出來
		//(5)並排序出來誰的成績最差及最高
	    
		String sName[] = new String [3];
	    String sTitle[]= {"姓名","國文","英文","數學","自然","社會","平均"};
	    // Student grade [3][]Name index, [][6]1國, 2 英, 3數, 4自然, 5社會 6平均值
	    Float aScore[][] = new Float[3][7];
	    int sort[]= {0,0};  //sort [0]:Min sort[1]:Max
	    
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<sName.length;i++)
		{
			Float davg=0.0f;
			System.out.println("請輸入學生的"+sTitle[0]+ " (Enter 結束)：");
			sName[i] = scanner.next();
            aScore[i][0] = (float) i;
			for (int j=1; j<aScore[i].length-1; j++) {
				System.out.print("請輸入學生  "+sName[i]+"  "+sTitle[j]+ "成績 (Enter 結束)：");				
				
				aScore[i][j] = scanner.nextFloat();
				davg=davg+aScore[i][j];
				//System.out.println("學生  "+sName[i]+" 成績加總"+ davg);				
				aScore[i][6]=(Float)davg/(aScore[i].length-2);
				//System.out.println("學生  "+sName[i]+" 平均成績"+ aScore[i][6]);	
			}
		}
		scanner.close();
		
		// 比較大小 
		Float scoreMax, scoreMin;
		scoreMax=aScore[0][6];
		scoreMin=aScore[0][6];		
		for (int i=0; i<sName.length;i++) {
            
			if (scoreMax < aScore[i][6]) {
				sort[1]=i;
				scoreMax=aScore[i][6];
			}
			if (scoreMin >= aScore[i][6]) {
				sort[0]=i;
				scoreMin=aScore[i][6];
			}
			//System.out.println("Min index: "+sort[0]+"Max index:"+ sort[1]);	
		}
		//列印平均數最低與最高的學生
		System.out.println("成績最低的學生######################################");	
		for(int k=0; k<sTitle.length;k++) {
			System.out.print(sTitle[k]+ "\t");
		}
		System.out.println();	
		System.out.print(sName[sort[0]]+ "\t");
		for (int j=1; j<aScore[0].length; j++) {
			System.out.print(aScore[sort[0]][j]+ "\t");
		}
		System.out.println();	
		System.out.println("成績最高的學生---------------------------------------");	
		for(int k=0; k<sTitle.length;k++) {
			System.out.print(sTitle[k]+ "\t");
		}
		System.out.println();	

		System.out.print(sName[sort[1]]+ "\t");
		for (int j=1; j<aScore[0].length; j++) {
			System.out.print(aScore[sort[1]][j]+ "\t");
		}
		System.out.println();	

		//System.out.println(aScore[0].length);
		//列印所有的學生成績
		System.out.println("全部學生的成績****************************************");	
		for(int k=0; k<sTitle.length;k++) {
			System.out.print(sTitle[k]+ "\t");
		}
		System.out.println();	
		for (int i=0; i<sName.length;i++)	{
			
			System.out.print(sName[i]+ "\t");
			
			for (int j=1; j<aScore[i].length; j++) {
				System.out.print(aScore[i][j]+ "\t");
			}
			System.out.println();	
		}
		
		
		
		
		//Arrays.sort(aScore[]);
		
		// Case 2: 用Array存成績
	    /*
	    int iSGrade[]= new int [5];
		Scanner scanner = new Scanner(System.in);
		int iSGradeLen= iSGrade.length;
		//System.out.println("Array lenght："+ iSGradeLen);
		System.out.println("請輸入學生的成績 (Enter 結束)：");
		
		for (int i=0; i<iSGradeLen; i++)
		{
			iSGrade[i] = scanner.nextInt();
			System.out.println("第 "+(i)+" 位學生的成績為："+iSGrade[i]);
		}
		scanner.close();
		int i=0;	
		for (int igrade : iSGrade)
		{
			++i;
			System.out.println("學生的成績為：");
	    	if (igrade >= 90)
		    	System.out.println("第"+i+"位學生的成績為：A");
	    	else if (igrade <=89 && igrade>=60)
	    		System.out.println("第"+i+"位學生的成績為：B");
	    	else
	    		System.out.println("第"+i+"位學生的成績為：C");
		}
		*/
		// case 1 : input 成績 if else 判斷
	    /*
	    int igrade;
		Scanner scanner = new Scanner(System.in);

	    for (int i =1; i<11;i++)
		{
	    	System.out.println("請輸入第"+i+"位學生的成績(Enter 結束)：");
			igrade = scanner.nextInt();
	    	System.out.println("請輸入第"+i+"位學生的成績為："+igrade);
	    	if (igrade >= 90)
		    	System.out.println("請輸入第"+i+"位學生的成績為：A");
	    	else if (igrade <=89 && igrade>=60)
	    		System.out.println("請輸入第"+i+"位學生的成績為：B");
	    	else
	    		System.out.println("請輸入第"+i+"位學生的成績為：C");
		}
		scanner.close();
		*/
	}

}
