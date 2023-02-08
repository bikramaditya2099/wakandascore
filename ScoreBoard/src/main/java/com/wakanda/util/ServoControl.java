package com.wakanda.util;

import java.io.IOException;

public class ServoControl {
public static void main(String[] args) throws IOException {
	String[] cmd = {
		      "python",
		      "/home/pi/addr_40.py",
		      	"0","0"
		    };
		    Runtime.getRuntime().exec(cmd);
}




}
