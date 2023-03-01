package com.wakanda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wakanda.util.TunnelMaker;

@SpringBootApplication
public class MainApp {
public static void main(String[] args) {
	TunnelMaker.makeTunnel();
	SpringApplication.run(MainApp.class, args);
	
}
}
