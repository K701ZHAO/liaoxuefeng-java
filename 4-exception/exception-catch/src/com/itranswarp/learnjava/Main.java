package com.itranswarp.learnjava;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		String a = "12";
		String b = "x9";
		try {
			// TODO: 捕获异常并处理
			int c = stringToInt(a);
			int d = stringToInt(b);
			System.out.println(c * d);
		} catch(NumberFormatException e) {
			System.out.println("Bad input");
		}
	}

	static int stringToInt(String s) {
		return Integer.parseInt(s);

	}
}
