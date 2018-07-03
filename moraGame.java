import java.util.Random;
import java.util.Scanner;

public class moraGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int player1, player2;
		Scanner scanner = new Scanner(System.in);
		
		boolean  flag=true, cflag=false;
		int count=0;
		
		startlb:
		while (flag)
		{
		    
		    System.out.println("玩家 1 請輸入 (1 剪刀, 2 石頭, 3 布, 4 跟電腦玩, 5 結束)：");
			player1 = scanner.nextInt();
	    	switch (player1)
	    	{
		    	case 1:
		    	{
		    		System.out.println("玩家 1 出剪刀：贏"+count+"次");
		    		break;
		    	}
		    	case 2:
		    	{
		    	 	System.out.println("玩家 1 出石頭：贏"+count+"次");
		    		break;
		    	}
		    	case 3:
		    	{
		    		System.out.println("玩家 1 出布：贏"+count+"次");
		    		break;
		    	}
		    	case 4:
		    	{
		    	 	System.out.println("玩家 1 要跟電腦玩");
		    	 	count = 0;
		    		break;
		    	}
		    	case 5:
		    	{	
		    	 	System.out.println("再見：玩家 1 贏"+count+"次");
		    		break;
		    	}
		    		default:
			    	{
			    	 	System.out.println("輸入錯誤，請重新輸入");
			    	 	continue startlb;
			    	}	
	    	}
			
			if (player1 == 5)	break;
            
			if (player1 == 4)
			{
				cflag =true;
			    System.out.println("玩家 1 請輸入 (1 剪刀, 2 石頭, 3 布, 5 結束)：");
				player1 = scanner.nextInt();
			}

			if (cflag)
			{
				Random rand=new Random(); 
				player2 =rand.nextInt(3)+1;
				//System.out.println("random player2 = "+ player2);
			}
			else
			{
				System.out.println("玩家 2 請輸入 (1 剪刀, 2 石頭, 3 布, 4 跟電腦玩, 5 結束)：");
				player2 = scanner.nextInt();
			}
	    	switch (player2)
	    	{
		    	case 1:
		    	{
		    		System.out.println("玩家 2 出剪刀：");
		    		break;
		    	}
		    	case 2:
		    	{
		    	 	System.out.println("玩家 2 出石頭：");
		    		break;
		    	}
		    	case 3:
		    	{
		    		System.out.println("玩家 2 出布：");
		    		break;
		    	}
		    	case 5:
		    	{	
		    	 	System.out.println("再見：玩家 2 ");
		    		break;
		    	}
		    		default:
			    	{
			    	 	System.out.println("輸入錯誤，請重新輸入");
			    	 	break;
			    	}	
	    	}
			
			if (player2 == 5)	break;

			//比較輸贏
	    	switch (player1)
	    	{
		    	case 1: //玩家 1 出剪刀
		    	{
		    		if (player2 == 1)
		    		{
			    		System.out.println("此次平手");
		    		}else if (player2 == 2)
		    		{
			    		System.out.println("你輸了");
			    		count = 0;
		    		}else if (player2 == 3)
		    		{ 
			    		System.out.println("你贏了");
			    		count += 1;
		    		}
	    			break;
		    	}
		    	case 2://玩家 1 出石頭
		    	{
		    		if (player2 == 1)
		    		{
			    		System.out.println("你贏了");
			    		count += 1;
		    		}else if (player2 == 2)
		    		{
			    		System.out.println("此次平手");
		    		}else if (player2 == 3)
		    		{ 
			    		System.out.println("你輸了");
			    		count = 0;
		    		}
		    		break;
		    	}
		    	case 3: //玩家 1 出布
		    	{
		    		if (player2 == 1)
		    		{
			    		System.out.println("你輸了");
			    		count = 0;
			    		break;
		    		}else if (player2 == 2)
		    		{
			    		System.out.println("你贏了");
			    		count += 1;
		    		}else if (player2 == 3)
		    		{ 
			    		System.out.println("此次平手");
		    		}
			    		break;
		    	}
		    		default:
			    	{
			    	 	System.out.println("比較輸贏時發現錯誤，重來!!");
			    	 	continue startlb;
			    	}	
	    	}
			
		}
		scanner.close();

	}

}
