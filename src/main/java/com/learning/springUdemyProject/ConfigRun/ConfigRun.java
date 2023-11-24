package com.learning.springUdemyProject.ConfigRun;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import game.GameConsole;
import game.GameRunner;
import game.PacmanGame;


@Configuration
@ComponentScan("game")
public class ConfigRun {
	
	
	
	
	
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigRun.class)){
			context.getBean(GameRunner.class).run();
		}
	}
}
	