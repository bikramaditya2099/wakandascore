package com.wakanda.util;

import java.util.HashMap;
import java.util.Map;

public class NumberConfiguration {

Map<Integer, Integer[]> config=new HashMap<Integer, Integer[]>();
Map<Integer, Wings[]> wingConfig=new HashMap<Integer, Wings[]>();

public Map<Integer, Integer[]> getConfigD1() {
	if(config==null)
		config=new HashMap<Integer, Integer[]>();
		
	Integer[] zero=new Integer[]{0,1,2,3,4,5};
	Integer[] one=new Integer[] {1,2};
	Integer[] two=new Integer[] {0,1,3,4,6};
	Integer[] three=new Integer[] {0,1,2,3,6};
	Integer[] four=new Integer[] {1,2,5,6};
	Integer[] five=new Integer[] {0,2,3,5,6};
	Integer[] six=new Integer[] {0,2,3,4,5,6};
	Integer[] seven=new Integer[] {0,1,2};
	Integer[] eight=new Integer[] {0,1,2,3,4,5,6};
	Integer[] nine=new Integer[] {0,1,2,3,5,6};
	config.put(0, zero);
	config.put(1, one);
	config.put(2, two);
	config.put(3, three);
	config.put(4, four);
	config.put(5, five);
	config.put(6, six);
	config.put(7, seven);
	config.put(8, eight);
	config.put(9, nine);
	return config;
}

public Map<Integer, Wings[]> getConfig(Wings... wing) {
	if(wingConfig==null)
		wingConfig=new HashMap<Integer, Wings[]>();
		
	Wings[] zero=new Wings[]{wing[0],wing[1],wing[2],wing[3],wing[4],wing[5]};
	Wings[] one=new Wings[] {wing[1],wing[2]};
	Wings[] two=new Wings[] {wing[0],wing[1],wing[3],wing[4],wing[6]};
	Wings[] three=new Wings[] {wing[0],wing[1],wing[2],wing[3],wing[6]};
	Wings[] four=new Wings[] {wing[1],wing[2],wing[5],wing[6]};
	Wings[] five=new Wings[] {wing[0],wing[2],wing[3],wing[5],wing[6]};
	Wings[] six=new Wings[] {wing[0],wing[2],wing[3],wing[4],wing[5],wing[6]};
	Wings[] seven=new Wings[] {wing[0],wing[1],wing[2]};
	Wings[] eight=new Wings[] {wing[0],wing[1],wing[2],wing[3],wing[4],wing[5],wing[6]};
	Wings[] nine=new Wings[] {wing[0],wing[1],wing[2],wing[3],wing[5],wing[6]};
	wingConfig.put(0, zero);
	wingConfig.put(1, one);
	wingConfig.put(2, two);
	wingConfig.put(3, three);
	wingConfig.put(4, four);
	wingConfig.put(5, five);
	wingConfig.put(6, six);
	wingConfig.put(7, seven);
	wingConfig.put(8, eight);
	wingConfig.put(9, nine);
	return wingConfig;
}
}
