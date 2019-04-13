package votingsystem.domain;

public class Vote {
	private String username,votes;
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	int VedantCount,SmitCount,PratikCount;

	public int getVedantCount() {
		return VedantCount;
	}

	public void setVedantCount(int VedantCount) {
		this.VedantCount = VedantCount;
	}

	public int getSmitCount() {
		return SmitCount;
	}

	public void setSmitCount(int SmitCount) {
		this.SmitCount = SmitCount;
	}

	public int getPratikCount() {
		return PratikCount;
	}

	public void setPratikCount(int PratikCount) {
		this.PratikCount = PratikCount;
	}

	public Vote() {
		// TODO Auto-generated constructor stub
	}

	public String getVotes() {
		return votes;
	}

	public void setVotes(String votes) {
		this.votes = votes;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
