package date201803;
import java.util.Scanner;
public class drump {

	/**
	 * 近来，跳一跳这款小游戏风靡全国，受到不少玩家的喜爱。
　　简化后的跳一跳规则如下：玩家每次从当前方块跳到下一个方块，如果没有跳到下一个方块上则游戏结束。
　　如果跳到了方块上，但没有跳到方块的中心则获得1分；跳到方块中心时，若上一次的得分为1分或这是本局游戏的第一次跳跃则此次得分为2分，否则此次得分比上一次得分多两分（即连续跳到方块中心时，总得分将+2，+4，+6，+8...）。
　　现在给出一个人跳一跳的全过程，请你求出他本局游戏的得分（按照题目描述的规则）。

	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int score=0;
		int outNum=0;
		int current=sc.nextInt();
		while(current!=0) {
			if(current==1) {
				score+=1;
				outNum=0;
			}else if(current==2) {
				outNum+=1;
				int s=2*outNum;
				score+=s;
			}
			current=sc.nextInt();
			
		}
		System.out.println(score);
		sc.close();
	}
	

}
