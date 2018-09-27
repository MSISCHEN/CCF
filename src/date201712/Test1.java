package date201712;
/**
 * 问题描述
　　给定n个数，请找出其中相差（差的绝对值）最小的两个数，输出它们的差值的绝对值。
输入格式
　　输入第一行包含一个整数n。
　　第二行包含n个正整数，相邻整数之间使用一个空格分隔。
输出格式
　　输出一个整数，表示答案。
样例输入
5
1 5 4 8 20
样例输出
1
 */ 
import java.util.Scanner;
public class Test1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] num=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		int sub=Math.abs(num[0]-num[1]);
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				int t=Math.abs(num[i]-num[j]);
				if(sub>t) {
					sub=t;
				}
			}
		}
		System.out.println(sub);
		sc.close();
	}
}
