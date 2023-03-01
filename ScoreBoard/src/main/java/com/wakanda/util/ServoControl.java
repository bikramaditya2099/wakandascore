package com.wakanda.util;

import java.io.IOException;
import java.util.List;

public class ServoControl {
	final static int threadSleep=500;
public static void main(String[] args) throws IOException, InterruptedException {
	
	/*
	 * String[] cmd = { "python", "/home/pi/addr_40.py", args[0],args[1] };
	 * Runtime.getRuntime().exec(cmd);
	 */
	int num=Integer.valueOf(args[0]);
	//int threadSleep=1800;
	//int num=9;
	int i=0;
	//while(i<=5) {
	//for(int num=0;num<=9;num++) {
	//showScore(num, threadSleep);
	//showOver(num, threadSleep);
	showWicket(num);
	/*
	 * Wings[] arr=digits.getScoreDigit3(); showNumber(num, arr);
	 * Thread.sleep(1000);
	 */
	
//	 } i++; }
	 
}

public static void showWicket(int num) {
	WicketFirstDigit firstDigit=new WicketFirstDigit();
	if(num<10)
	{
		firstDigit.setNum(num);
		firstDigit.run();
		
		
	}
}

public static void showOver(int num) throws InterruptedException {
	OverFirstDigit firstDigit=new OverFirstDigit();
	OverSecondDigit secondDigit=new OverSecondDigit();
	if(num<10)
	{
		firstDigit.setNum(0);
		secondDigit.setNum(num);
		firstDigit.run();
		Thread.sleep(threadSleep);
		secondDigit.run();
		
	}
	
	if(num>=10 && num<=99) {
		
		String number=Integer.toString(num);
		firstDigit.setNum(Integer.parseInt(String.valueOf(number.charAt(0))));
		secondDigit.setNum(Integer.parseInt(String.valueOf(number.charAt(1))));
		firstDigit.run();
		Thread.sleep(threadSleep);
		secondDigit.run();
		
		
	}
}

public static void showScore(int num) throws InterruptedException {
	ScoreFirstDigit firstDigit=new ScoreFirstDigit();
	ScoreSecondDigit secondDigit=new ScoreSecondDigit();
	ScoreThirdDigit thirdDigit=new ScoreThirdDigit();
	if(num<10)
	{
		firstDigit.setNum(0);
		secondDigit.setNum(0);
		thirdDigit.setNum(num);
		firstDigit.run();
		Thread.sleep(threadSleep);
		secondDigit.run();
		Thread.sleep(threadSleep);
		thirdDigit.run();
		/*
		 * Wings[] arr1=digits.getScoreDigit1(); showNumber(0, arr1); Wings[]
		 * arr2=digits.getScoreDigit2(); showNumber(0, arr2); Wings[]
		 * arr3=digits.getScoreDigit3(); showNumber(num, arr3);
		 */
	}
	
	if(num>=10 && num<=99) {
		
		String number=Integer.toString(num);
		
		firstDigit.setNum(0);
		secondDigit.setNum(Integer.parseInt(String.valueOf(number.charAt(0))));
		thirdDigit.setNum(Integer.parseInt(String.valueOf(number.charAt(1))));
		firstDigit.run();
		Thread.sleep(threadSleep);
		secondDigit.run();
		Thread.sleep(threadSleep);
		thirdDigit.run();
		
	}
	
	if(num>=100 && num<=999) {
		
		String number=Integer.toString(num);
		firstDigit.setNum(Integer.parseInt(String.valueOf(number.charAt(0))));
		secondDigit.setNum(Integer.parseInt(String.valueOf(number.charAt(1))));
		thirdDigit.setNum(Integer.parseInt(String.valueOf(number.charAt(2))));
		firstDigit.run();
		Thread.sleep(threadSleep);
		secondDigit.run();
		Thread.sleep(threadSleep);
		thirdDigit.run();
	
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

public String[] getCommand(String addr,int channel,int flag) {
	
	String path="/home/pi/addr_"+addr+".py";
	String chn=String.valueOf(channel);
	String fl=String.valueOf(flag);
	String[] cmd={
		      "python",
		      path,
		      	chn,fl
		    };
	return cmd;
}





}
