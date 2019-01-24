package Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "team")
public class Team {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "player_Sequence")
	@SequenceGenerator(name = "team_Sequence", sequenceName = "TEAM_SEQ")
	private int id;
	
	@Column(name="name")
	private String name;
	/*
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy = "team")
	private List<player> players;
*/
	/**
	 * 
	 */
	public Team() {
		
	}

	/**
	 * @param id
	 * @param name
	 * @param players
	 */
	public Team(int id, String name, List<player> players) {
		super();
		this.id = id;
		this.name = name;
//		this.players = players;
	}
	
	
	
}
