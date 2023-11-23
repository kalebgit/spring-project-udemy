package com.learning.springUdemyProject.ConfigRun;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import game.GameConsole;
import game.PacmanGame;


@Configuration
public class ConfigRun {
	
	@Bean
	public GameConsole game() {
		GameConsole game = new PacmanGame();
		return game;
	}
	
	
	
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigRun.class)){\
			
		}
	}
}
	