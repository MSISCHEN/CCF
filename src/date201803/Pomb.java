package date201803;
import java.util.Scanner;
/**
 * 数轴上有一条长度为L（L为偶数)的线段，左端点在原点，右端点在坐标L处。有n个不计体积的小球在线段上，开始时所有的小球都处在偶数坐标上，速度方向向右，速度大小为1单位长度每秒。
　　当小球到达线段的端点（左端点或右端点）的时候，会立即向相反的方向移动，速度大小仍然为原来大小。
　　当两个小球撞到一起的时候，两个小球会分别向与自己原来移动的方向相反的方向，以原来的速度大小继续移动。
　　现在，告诉你线段的长度L，小球数量n，以及n个小球的初始位置，请你计算t秒之后，各个小球的位置。
提示
　　因为所有小球的初始位置都为偶数，而且线段的长度为偶数，可以证明，不会有三个小球同时相撞，小球到达线段端点以及小球之间的碰撞时刻均为整数。
　　同时也可以证明两个小球发生碰撞的位置一定是整数（但不一定是偶数）。
 * @author amini
 *
 */
public class Pomb {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();					//有几个球
		int l=sc.nextInt();					//数轴长度
		int t=sc.nextInt();					//经过多少秒
		int [][] status = new int[2][n+1];
		for(int i=1;i<n+1;i++) {
			status[0][i]=sc.nextInt();		//表示球现在所在的坐标
			status[1][i]=1;					//1表示球是向右的
		}
		for(int time=1;time<=t;time++) {
			for(int i=1;i<n+1;i++) {
				if(status[1][i]==1) {
					if(status[0][i]<l) {
						status[0][i]+=1;
					}else {
						status[0][i]-=1;
						status[1][i]=0;
					}
				}else {
					if(status[0][i]>0) {
						status[0][i]-=1;
					}else {
						status[0][i]+=1;
						status[1][i]=1;
					}
					
				}
				
			}
			status=check(status);
			
		}
		for(int i=0;i<n;i++) {
			System.out.print(status[0][i+1]+"  ");
		}
		
	}

	static int[][] check(int [][]status) {
		for(int i=1;i<status[1].length;i++) {
			for(int j=i+1;j<status[1].length;j++) {
				if(status[0][i]==status[0][j]) {
					int t=status[1][j];
					status[1][j]=status[1][i];
					status[1][i]=t;
					
					break;
				}
			}
		}
		return status;
	}
}
