package com.wakanda.controller;

import org.springframework.stereotype.Component;

@Component
public class ScoreBean {

	private int score;
	private int over;
	private int wicket;
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getOver() {
		return over;
	}
	public void setOver(int over) {
		this.over = over;
	}
	public int getWicket() {
		return wicket;
	}
	public void setWicket(int wicket) {
		this.wicket = wicket;
	}
	
}
