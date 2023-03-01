package com.wakanda.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wakanda.util.ServoControl;

@RestController
public class ScoreController {
	@GetMapping("/healthCheck")
	public Response index() {
		return new Response("UP");
	}
	@PostMapping("/updateAll")
	public String updateAll(@RequestBody ScoreBean bean) {
		try {
			ServoControl.showScore(bean.getScore());
			ServoControl.showOver(bean.getOver());
			ServoControl.showWicket(bean.getWicket());
		} catch (InterruptedException e) {
			e.printStackTrace();
			return "Something went wrong";
			
		}
		return "Updated";
	}
	
	@PostMapping("/updateScore")
	public String updateScore(@RequestBody ScoreBean bean) {
		try {
			ServoControl.showScore(bean.getScore());
			//ServoControl.showOver(bean.getOver());
			//ServoControl.showWicket(bean.getWicket());
		} catch (InterruptedException e) {
			e.printStackTrace();
			return "Something went wrong";
			
		}
		return "Updated";
	}
	
	@PostMapping("/updateOver")
	public String updateOver(@RequestBody ScoreBean bean) {
		try {
			//ServoControl.showScore(bean.getScore());
			ServoControl.showOver(bean.getOver());
			//ServoControl.showWicket(bean.getWicket());
		} catch (InterruptedException e) {
			e.printStackTrace();
			return "Something went wrong";
			
		}
		return "Updated";
	}
	
	@PostMapping("/updateWicket")
	public String updateWicket(@RequestBody ScoreBean bean) {
		//ServoControl.showScore(bean.getScore());
		//ServoControl.showOver(bean.getOver());
		ServoControl.showWicket(bean.getWicket());
		return "Updated";
	}
}
