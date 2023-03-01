package com.wakanda.util;

public enum Wings {

	WING_40_0 (new ServoWings(40,0)),
	WING_40_1 (new ServoWings(40,1)),
	WING_40_2 (new ServoWings(40,2)),
	WING_40_3 (new ServoWings(40,3)),
	WING_40_4 (new ServoWings(40,4)),
	WING_40_5 (new ServoWings(40,5)),
	WING_40_6 (new ServoWings(40,6)),
	WING_40_7 (new ServoWings(40,7)),
	WING_40_8 (new ServoWings(40,8)),
	WING_40_9 (new ServoWings(40,9)),
	WING_40_10 (new ServoWings(40,10)),
	WING_40_11 (new ServoWings(40,11)),
	WING_40_12 (new ServoWings(40,12)),
	WING_40_13 (new ServoWings(40,13)),
	WING_40_14 (new ServoWings(40,14)),
	WING_40_15 (new ServoWings(40,15)),
	WING_41_0 (new ServoWings(41,0)),
	WING_41_1 (new ServoWings(41,1)),
	WING_41_2 (new ServoWings(41,2)),
	WING_41_3 (new ServoWings(41,3)),
	WING_41_4 (new ServoWings(41,4)),
	WING_41_5 (new ServoWings(41,5)),
	WING_41_6 (new ServoWings(41,6)),
	WING_41_7 (new ServoWings(41,7)),
	WING_41_8 (new ServoWings(41,8)),
	WING_41_9 (new ServoWings(41,9)),
	WING_41_10 (new ServoWings(41,10)),
	WING_41_11 (new ServoWings(41,11)),
	WING_41_12 (new ServoWings(41,12)),
	WING_41_13 (new ServoWings(41,13)),
	WING_41_14 (new ServoWings(41,14)),
	WING_41_15 (new ServoWings(41,15)),
	WING_42_0 (new ServoWings(42,0)),
	WING_42_1 (new ServoWings(42,1)),
	WING_42_2 (new ServoWings(42,2)),
	WING_42_3 (new ServoWings(42,3)),
	WING_42_4 (new ServoWings(42,4)),
	WING_42_5 (new ServoWings(42,5)),
	WING_42_6 (new ServoWings(42,6)),
	WING_42_7 (new ServoWings(42,7)),
	WING_42_8 (new ServoWings(42,8)),
	WING_42_9 (new ServoWings(42,9)),
	WING_42_10 (new ServoWings(42,10)),
	WING_42_11 (new ServoWings(42,11)),
	WING_42_12 (new ServoWings(42,12)),
	WING_42_13 (new ServoWings(42,13)),
	WING_42_14 (new ServoWings(42,14)),
	WING_42_15 (new ServoWings(42,15))
	;
	
	public int getAddr() {
		return addr;
	}

	public void setAddr(int addr) {
		this.addr = addr;
	}

	public int getWingNum() {
		return wingNum;
	}

	public void setWingNum(int wingNum) {
		this.wingNum = wingNum;
	}

	int addr;
	int wingNum;

	Wings(ServoWings servoWings) {
		this.addr=servoWings.getAddress();
		this.wingNum=servoWings.getWingNumber();
	}
}
