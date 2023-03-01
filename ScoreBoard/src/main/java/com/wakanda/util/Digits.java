package com.wakanda.util;

public class Digits {

	int A0=0;
	int A1=1;
	int A2=2;
	int A3=3;
	int A4=4;
	int A5=5;
	int A6=6;
	int A7=7;
	int A8=8;
	int A9=9;
	int A10=10;
	int A11=11;
	int A12=12;
	int A13=13;
	int A14=14;
	int A15=15;
	
	int digit1[]=new int[] {A0,A1,A2,A3,A4,A5,A6};
	Wings[] score_wing1=new Wings[] {Wings.WING_40_0,Wings.WING_40_1,Wings.WING_40_2,Wings.WING_40_3,Wings.WING_40_4,Wings.WING_40_5,Wings.WING_40_6};
	Wings[] score_wing2=new Wings[] {Wings.WING_40_7,Wings.WING_40_8,Wings.WING_40_9,Wings.WING_40_10,Wings.WING_40_11,Wings.WING_40_12,Wings.WING_40_13};
	Wings[] score_wing3=new Wings[] {Wings.WING_40_14,Wings.WING_40_15,Wings.WING_41_0,Wings.WING_41_1,Wings.WING_41_2,Wings.WING_41_3,Wings.WING_41_4};
	Wings[] over_wing1=new Wings[] {Wings.WING_41_5,Wings.WING_41_6,Wings.WING_41_7,Wings.WING_41_8,Wings.WING_41_9,Wings.WING_41_10,Wings.WING_41_11};
	Wings[] over_wing2=new Wings[] {Wings.WING_41_12,Wings.WING_41_13,Wings.WING_41_14,Wings.WING_41_15,Wings.WING_42_0,Wings.WING_42_1,Wings.WING_42_2};
	Wings[] wicket_wing=new Wings[] {Wings.WING_42_3,Wings.WING_42_4,Wings.WING_42_5,Wings.WING_42_6,Wings.WING_42_7,Wings.WING_42_8,Wings.WING_42_9};

	public Wings[] getScoreDigit1() {
		return score_wing1;
	}
	
	public Wings[] getScoreDigit2() {
		return score_wing2;
	}
	public Wings[] getScoreDigit3() {
		return score_wing3;
	}
	public Wings[] getOverDigit1() {
		return over_wing1;
	}
	public Wings[] getOverDigit2() {
		return over_wing2;
	}
	public Wings[] getWicketDigit() {
		return wicket_wing;
	}
}
