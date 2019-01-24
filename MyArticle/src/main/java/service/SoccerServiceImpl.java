package service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import Entity.Team;
import Entity.player;
import repository.PlayerRepository;
import repository.TeamRepository;

public class SoccerServiceImpl implements SoccerService {

	
	@Autowired
	private PlayerRepository playerRepository;
	
	@Autowired
	private TeamRepository teamRepository;
		
	@Override
	public List<String> getAllTeamPlayers(long teamId) {
		System.out.println("Inside getAllPlayers method");
		 List<String> result = new ArrayList<String>();
	        List<player> players = playerRepository.findByTeamId(teamId);
	        for (player player : players) {
	            result.add(player.getName());
	        }
	        return result;
	}

	@Override
	public void addBarcelonaPlayer(String name, String position, int number) {
		Team barcelona = teamRepository.findByPlayers(1l);
        player newPlayer = new player();
        newPlayer.setName(name);
        newPlayer.setPosition(position);
        newPlayer.setNum(number);
        newPlayer.setTeam(barcelona);
        playerRepository.save(newPlayer);

	}
	
}
