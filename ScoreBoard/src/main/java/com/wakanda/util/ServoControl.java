package com.wakanda.util;

import java.io.IOException;

public class ServoControl {
public static void main(String[] args) throws IOException {
	
	String[] cmd = {
		      "python",
		      "/home/pi/addr_40.py",
		      	args[0],args[1]
		    };
		    Runtime.getRuntime().exec(cmd);
}




}
