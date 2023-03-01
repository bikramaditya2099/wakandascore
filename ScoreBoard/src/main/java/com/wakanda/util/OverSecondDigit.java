package com.wakanda.util;

import java.io.IOException;
import java.util.List;

public class OverSecondDigit{
	Digits digits=new Digits();
	int num;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	
	public void run() {
		try {
			Wings[] arr1=digits.getOverDigit2();
			showNumber(num, arr1);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private static void showNumber(int num, Wings[] arr) throws IOException, InterruptedException {
		RunDigit runDigit=new  RunDigit();
		List<String[]> commands=runDigit.showDigit(num, arr);
		for(String[] s:commands)
		{
			System.out.println(s[0]+" "+s[1]+" "+s[2]+" "+s[3]);
			Runtime.getRuntime().exec(s);
			Thread.sleep(300);
			
		}
	}
}

