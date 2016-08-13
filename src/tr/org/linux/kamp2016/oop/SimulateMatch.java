package tr.org.linux.kamp2016.oop;

public class SimulateMatch extends football {
	
	String homeTeamName,guestTeamName;
	int scoresOfHomeTeam,scoresOfGuestTeam;
	
	private Object o1;
	private Object o2;
	
	public void setAsHomeTeam(Object o1){
		this.o1=o1;
		System.out.println(o1+" ev takımı.");
	}
	public void setAsGuestTeam(Object o2){
		this.o2=o2;
		System.out.println(o2+" misafir takım.");
	}
	public int homeTeamScoresAGoal(){
		System.out.println(o1+"  gol attıı ");
		scoresOfHomeTeam++;
		return scoresOfHomeTeam;
	}
	public int guestTeamScoresAGoal(){
		System.out.println(o2+"  gol attıı ");
		scoresOfGuestTeam++;
		return scoresOfGuestTeam;
	}
	public void endOffFirstHalf(){
		System.out.println("****ilk yarı sonucu****");
		System.out.println( scoresOfHomeTeam+"-"+scoresOfGuestTeam);
	}
	public void endOffGame(){
		System.out.println("****maç sonucu****");
		System.out.println(scoresOfHomeTeam+"-"+scoresOfGuestTeam );
	}
	public void announceWinner(){
		System.out.println("*****veee kazanan***** ");
		if(scoresOfHomeTeam > scoresOfGuestTeam){System.out.print(o1);}
		if(scoresOfHomeTeam < scoresOfGuestTeam){System.out.print(o2);}
		if(scoresOfHomeTeam == scoresOfGuestTeam){System.out.print(o1+"berabere"+o2);}
			
	}
	
	@Override
	public void rollTheBall() {}
	@Override
	public void anOpponentScores() {}
	@Override
	public void hasOperant(){}
	@Override
	public void haveWinner() {}
	@Override
	public void hasHoliganism() {}
}
