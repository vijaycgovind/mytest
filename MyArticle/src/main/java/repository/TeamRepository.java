package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {

	Team findByPlayers(long playerId);
	Team findOne(long playerId);
}
