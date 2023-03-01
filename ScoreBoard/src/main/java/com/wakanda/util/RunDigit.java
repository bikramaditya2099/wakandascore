package com.wakanda.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RunDigit {

	NumberConfiguration configs=new NumberConfiguration();
	public List<String[]> showDigit(int digit,Wings[] wings) {
		Map<Integer,Wings[]> config =configs.getConfig(wings);
		Wings[] onWings=config.get(digit);
		
	
		
		List<Wings> onWingsList=Arrays.asList(onWings);
		List<Wings> offWings=new ArrayList<Wings>();
		for(Wings w:wings)
			offWings.add(w);
		
		offWings.removeAll(onWingsList);
		
		
		
	displayWings(onWings, offWings);
	return generateCommands(onWingsList, offWings);
	}
	
	public void displayWings(Wings[] onWings,List<Wings> offWings) {
		
		for(int i=0;i<onWings.length;i++)
			System.out.print(onWings[i]);
		System.out.println();
		for(int j=0;j<offWings.size();j++)
			System.out.print(offWings.get(j));
		
	}
	
	public List<String[]> generateCommands(List<Wings> onWings,List<Wings> offWings){
		 
		List<String[]> commands=new ArrayList<String[]>();
		for(Wings off:offWings)
			commands.add(getCommand(String.valueOf(off.addr), off.wingNum, 0));
		for(Wings on:onWings)
			commands.add(getCommand(String.valueOf(on.addr), on.wingNum, 1));
		return commands;
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
