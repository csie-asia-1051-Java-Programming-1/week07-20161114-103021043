package hw;
/*
 * Topic:�H���j�]�p��ơA��J�@�ӥ���ƭ�(���t 0)�A�Ǧ^�ӼƭȬO�X���(# ofdigits)�C
 * Date: 2016/11/14
 * Author: 103021043 ��z�B
 */
import java.util.*;
public class hw02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		for(;;){
		System.out.println("��J�@�ӥ���ƭ�(���t 0)");
		int c =scn.nextInt();
		if(c<=0){
			System.out.println("�X������");
				}
		else {
		String a =c+"";
		int b=a.length();
		System.out.println("�O"+b+"���");
		break;	
		   }	
		}
	}
}