package tr.org.linux.kamp2016.oop;

public class FootBallTest {

	
	public static void main(String[] args) {
		footballClub takim1=new footballClub("Galatasaray", "sarı-kırmızı", "Türk Telekom Arena", 5, 1500);
		footballClub takim2=new footballClub("FenerBahçe","Sarı-Lacivert","Şükrü Saraçoğlu",4,1200);		
		
		SimulateMatch mac=new SimulateMatch();
		mac.setAsHomeTeam(takim1.getClubName());
		mac.setAsGuestTeam(takim2.getClubName());
		//System.out.println(takim1.toString());
		//System.out.println(takim2.toString());
		mac.homeTeamScoresAGoal();
		mac.homeTeamScoresAGoal();
		mac.homeTeamScoresAGoal();
		mac.guestTeamScoresAGoal();
		mac.endOffFirstHalf();
		mac.homeTeamScoresAGoal();
		mac.guestTeamScoresAGoal();
		mac.endOffGame();
		mac.announceWinner();
		

	}

}
