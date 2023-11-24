package com.learning.springUdemyProject.ConfigRun;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import game.GameConsole;
import game.PacmanGame;


@Configuration
@ComponentScan("game")
public class ConfigRun {
	
	
	
	
	
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigRun.class)){
			Object game = context.getBean("PacmanGame");
			if(game instanceof GameConsole) {
				GameConsole realGame = (GameConsole)game;
				realGame.up();
				realGame.down();
				realGame.right();
				realGame.left();
			}
		}
	}
}
	