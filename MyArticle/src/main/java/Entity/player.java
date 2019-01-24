package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
//@Table(name = "player")
public class player {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "player_Sequence")
	@SequenceGenerator(name = "player_Sequence", sequenceName = "PLAYER_SEQ")
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="position")
	private String position;
	
	@Column(name="num")
	private int num;

	/**
	 * 
	 */
	public player() {
		
	}

	/**
	 * @param id
	 * @param name
	 * @param position
	 * @param num
	 */
	public player(long id, String name, String position, int num) {
		this.id = id;
		this.name = name;
		this.position = position;
		this.num = num;
	}
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	//ManyToOne
	@JoinColumn(name = "team_id", nullable = false)
	private Team team;
	
}
