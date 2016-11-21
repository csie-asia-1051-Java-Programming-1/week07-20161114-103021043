package ex;
/*
 * Topic:讓使用者輸入一個正整數 n，接著使用遞迴呼叫印出 n!的結果。
 * Date: 2016/11/14
 * Author: 103021043 何宙運
 */
import java.util.*;
public class ex04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		System.out.println(fun(n));
	}
	private static int fun(int x){
		if(x==1){
			return x;
		}else{
			return x*fun(x-1);
		}
	}
}
