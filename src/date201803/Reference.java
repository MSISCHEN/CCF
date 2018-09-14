package date201803;

import java.util.ArrayList;
import java.util.List;
/**
 * URL 映射是诸如 Django、Ruby on Rails 等网页框架 (web frameworks) 的一个重要组件。对于从浏览器发来的 HTTP 请求，URL 映射模块会解析请求中的 URL 地址，并将其分派给相应的处理代码。现在，请你来实现一个简单的 URL 映射功能。
　　本题中 URL 映射功能的配置由若干条 URL 映射规则组成。当一个请求到达时，URL 映射功能会将请求中的 URL 地址按照配置的先后顺序逐一与这些规则进行匹配。当遇到第一条完全匹配的规则时，匹配成功，得到匹配的规则以及匹配的参数。若不能匹配任何一条规则，则匹配失败。
　　本题输入的 URL 地址是以斜杠 / 作为分隔符的路径，保证以斜杠开头。其他合法字符还包括大小写英文字母、阿拉伯数字、减号 -、下划线 _ 和小数点 .。例如，/person/123/ 是一个合法的 URL 地址，而 /person/123? 则不合法（存在不合法的字符问号 ?）。另外，英文字母区分大小写，因此 /case/ 和 /CAse/ 是不同的 URL 地址。
　　对于 URL 映射规则，同样是以斜杠开始。除了可以是正常的 URL 地址外，还可以包含参数，有以下 3 种：
　　字符串 <str>：用于匹配一段字符串，注意字符串里不能包含斜杠。例如，abcde0123。
　　整数 <int>：用于匹配一个不带符号的整数，全部由阿拉伯数字组成。例如，01234。
　　路径 <path>：用于匹配一段字符串，字符串可以包含斜杠。例如，abcd/0123/。
　　以上 3 种参数都必须匹配非空的字符串。简便起见，题目规定规则中 <str> 和 <int> 前面一定是斜杠，后面要么是斜杠，要么是规则的结束（也就是该参数是规则的最后一部分）。而 <path> 的前面一定是斜杠，后面一定是规则的结束。无论是 URL 地址还是规则，都不会出现连续的斜杠。
 * @author amini
 *
 */
import java.util.Scanner;
public class Reference {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		List<String> url=new ArrayList<>();
		List<String> urls=new ArrayList<>();
		for(int i=0;i<n;i++) {
			url.add(sc.next());
		}
		for(int i=0;i<m;i++) {
			urls.add(sc.next());
		}
		
		for(int i=0;i<m;i++) {
			String str=urls.get(i);
			String [] s1=str.split("/");
			for(int j=0;j<n;j++) {
				String str2=url.get(j);
				String[] s2=str2.split("/");
				
			}
		}
		
		sc.close();
	}
	void regex(String[] s1,String[] s2) {
		if(s2.length<=s1.length)
			return;
		for(int i=0;i<s2.length;i++) {
			if(s2[i].contains("<")) {
				
			}
		}
	}
}
