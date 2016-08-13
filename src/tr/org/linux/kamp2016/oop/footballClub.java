package tr.org.linux.kamp2016.oop;

public class footballClub extends football{
	String clubName,colors,stadiumName;
	int clubValue;
	int stadiumCapacity;
	public footballClub(String clubName, String colors, String stadiumName,
			int clubValue, int stadiumCapacity) {
		this.clubName = clubName;
		this.colors = colors;
		this.stadiumName = stadiumName;
		this.clubValue = clubValue;
		this.stadiumCapacity = stadiumCapacity;
	}
	
	@Override
	public String toString() {
		return "footballClub [clubName=" + clubName + ", colors=" + colors
				+ "\nstadiumName=" + stadiumName + ", clubValue=" + clubValue
				+ ", stadiumCapacity=" + stadiumCapacity + "]";
	}


	public String getClubName() {
		return clubName;
	}
	public void setClubName(String clubName) {
		this.clubName = clubName;
	}
	public String getColors() {
		return colors;
	}
	public void setColors(String colors) {
		this.colors = colors;
	}
	public String getStadiumName() {
		return stadiumName;
	}
	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}
	public int getClubValue() {
		return clubValue;
	}
	public void setClubValue(int clubValue) {
		this.clubValue = clubValue;
	}
	public int getStadiumCapacity() {
		return stadiumCapacity;
	}
	public void setStadiumCapacity(int stadiumCapacity) {
		this.stadiumCapacity = stadiumCapacity;
	}

	@Override
	public void rollTheBall() {}

	@Override
	public void anOpponentScores() {}

	@Override
	public void hasOperant() {}

	@Override
	public void haveWinner() {}

	@Override
	public void hasHoliganism() {}
	
}
