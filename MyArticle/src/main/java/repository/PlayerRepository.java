package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import Entity.player;

public interface PlayerRepository extends CrudRepository<player, Long> {
	List<player> findByTeamId(long teamId);
}
