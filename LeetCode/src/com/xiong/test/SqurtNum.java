package com.xiong.test;

public class SqurtNum {
	
	/***
	 * 判断一个数字是否是2的幂次方
	 * 最原始的办法，但是时间复杂度太高
	 * @param n
	 * @return
	 */
	
	public static boolean isPowerOfTwo(int n) {
		int num = 1;
		if (n == 1) return true;
		while (num < n && n %2 == 0) {
			num = num << 1;
			if (num == n) return true;
		}
		return false;
	}
	
	/***
	 * 判断一个数字是否是3的幂次方
	 * 最原始的办法，但是时间复杂度太高
	 * @param n
	 * @return
	 */
	
	public static boolean isPowerOfThree(int n) {
		if (n == 0) return false;
		if (n == 1) return true;
		while (n % 3 == 0) {
			n = n / 3;
			if (1 == n) return true;
		}
		return false;
	}
	
	/***
	 * 判断一个数字是否是3的幂次方
	 * 最快的办法
	 * @param n
	 * @return
	 */
	
	public static boolean isPowerOfThree2(int n) {
		if (n <= 0) return false;
		double res = Math.log10(n)/Math.log10(3);
		if (res % 1 == 0) {
			return true;
		}
		return false;
	}
	
	/***
	 * 最简单的办法
	 * @param n
	 * @return 
	 */
	public static boolean isPowerOfTwo2(int n) {
		
		return n > 0 ? (n & (n-1)) == 0 : false;
	}
	
	/**
	 * @param num
	 * 算出一个数字的平方根
	 */
	public static int getSqrt(int num) {
		int low=1,high=num;
		while(low <= high) {
			int x = (low + high)/2;
			if (x*x == num) {
				return x;
			} else if (x*x > num){ 
				high = x-1;
			} else {
				low = x+1;
			}
		}
		return high;
	}
	
	public static void main(String[] args) {
		//System.out.println(getSqrt(99));
		//System.out.println(isPowerOfTwo(128));
		System.out.println(isPowerOfThree2(80));
	}

}
