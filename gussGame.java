package gussGame;

import java.util.Random;
import java.util.Scanner;

public class gussGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int player1=5, player2=5;
		Scanner scanner = new Scanner(System.in);
		boolean  flag=true, sflag=true;
		int count=1, high=1000, low=1, key=500;
		
		startlb:
		while (flag)
		{

			if(sflag) {
				System.out.println("請莊家輸入KEY值  (當輸入: 4:表電腦產生Key值 5:結束)：");
				sflag=false;
				player1 = scanner.nextInt();

				if (player1 == 5)	{
					System.out.println("結束了!! 謝謝你!!!!!");
					break;
				}
	            if (player1 == 4)	{
					sflag =false;
					Random rand=new Random(); 
					key =rand.nextInt(1000)+1;
					System.out.println("random key number = "+ key);
				}
	            else	{
		            key=player1;
					System.out.println("User input number = "+ key);
	            }

			}

			System.out.println("請玩家猜 Key值，Key介於Min與Max之間。"
			    		+ "*** "+ low+" ~ "+high+" **** (當輸入: 5:不玩了!!)：");
			player2 = scanner.nextInt();
				
            	
			if (player2 == 5)	{
				System.out.println("結束了!! 謝謝你!!!!!");
				break;
			}

			if (player2 > key) {
				high = player2;
				count++;
				continue;
			}else if (player2 < key) {
				low =player2;
				count++;
				continue;
			}
			else if (key==player2) {

				System.out.println("恭喜你猜到了!!!! 你猜了 "+ count+"次");
				count=1;
				sflag=true;
	    	 	continue startlb;
			}
		}
		scanner.close();
	}

}
