package ex;
/*
 * Topic:���ϥΪ̿�J�@�ӥ���� n�A���ۨϥλ��j�I�s�L�X n!�����G�C
 * Date: 2016/11/14
 * Author: 103021043 ��z�B
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
