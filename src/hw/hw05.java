package hw;
/*
 * Topic:寫一遞迴函數，讓使用者輸入一個長整數，透過遞迴函數運算後得到反向的數字字串並印出。
 * 例如:輸入 1234回傳 4321
 * Date: 2016/11/14
 * Author: 103021043 何宙運
 */
import java.util.*;
public class hw05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String str=scn.next();
		char[]data=str.toCharArray();
		for(int i=data.length-1;i>=0;i--){
			System.out.print(data[i]);
		}
			}

		}
