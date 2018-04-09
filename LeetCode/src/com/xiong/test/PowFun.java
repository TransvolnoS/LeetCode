package com.xiong.test;
/**
 * @author ����:XiaoXiong
 * @version ����ʱ�䣺2018��4��9�� ����9:09:34
 * ��˵��
 */
public class PowFun {
	
	/**
	 * Implement pow(x, n).
	 *	Example 1:
	 * 	Input: 2.00000, 10
	 *	Output: 1024.00000
	 *	Example 2:
	 *	Input: 2.10000, 3
	 *	Output: 9.26100
	 * 
	 * */
	//�ֽ����е��ݴη���ʹ���ΪһԪ,���޷ֽ���ȥ
	
	public static double powfun(double num,int n) {
		if (n == 0)
			return 1;
		if (n < 0) {
			num = 1/num;
			n = -n;
		} 
		return (n%2 == 0) ? powfun(num*num, n/2) : num*powfun(num*num, n/2);
	}
	
	public static void main(String[] args) {
		
		System.out.println(powfun(3.00, 5));
		System.out.println(powfun(3.00, 0));
		System.out.println(powfun(3.00, -5));
	}

}
