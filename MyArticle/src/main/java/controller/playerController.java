package controller;

import java.util.List;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import service.SoccerService;

@RestController
public class playerController implements ErrorController {

	private SoccerService soccerService;
	
	private static final String PATH = "/";
	
	 @RequestMapping(value = PATH)
	    public String error() {
	        return "Error handling";
	    }

	    @Override
	    public String getErrorPath() {
	        return PATH;
	    }
	@RequestMapping(value = "/hello")
	private String listPlayers() {
		System.out.println("!!!!!!!!!!!!HELLOOOOO");
	
		List<String> players = soccerService.getAllTeamPlayers(1);
	    for(String player : players)
	    {
	        System.out.println("Introducing Barca player => " + player);
	    }
	    return "hello";
	}
	
}
