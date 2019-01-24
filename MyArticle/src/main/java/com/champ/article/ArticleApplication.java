package com.champ.article;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import service.SoccerService;

@EnableAutoConfiguration
@ComponentScan(basePackages= {"controller"})
@SpringBootApplication
public class ArticleApplication {

	@Autowired
	static
	SoccerService soccerService ;
	
	public static void main(String[] args)  {
		SpringApplication.run(ArticleApplication.class, args);
	}
	/*
	@Override
	public void run(String[] arg0) throws Exception {
		soccerService.addBarcelonaPlayer("Havi", "Lead", 6);
		
		List<String> players = soccerService.getAllTeamPlayers(1);
		for(String player : players)
        {
            System.out.println("Introducing Barca player => " + player);
        }
	} */
}

