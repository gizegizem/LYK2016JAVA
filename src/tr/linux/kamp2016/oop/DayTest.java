package tr.linux.kamp2016.oop;

public class DayTest {

	Day day;
	public DayTest(Day day){
		this.day=day;
	}
	
	public void tellItLikeItIs(){
		switch(day){
		case MONDAY:
			System.out.println("pazartesi iğrenç :/");
			break;
		case FRIDAY:
			System.out.println("eheheheheh:)))");
			break;
		case SATURDAY: case SUNDAY:
			System.out.println("haftasonları <3 biz");
			break;
		default:
			System.out.println("haftasonularını bekliyoruz :(");
			break;
		}
	}
	public static void main(String[] args) {
			DayTest firstDay=new DayTest(Day.MONDAY);
			firstDay.tellItLikeItIs();
			DayTest thirdDay=new DayTest(Day.WEDNESDAY);
			thirdDay.tellItLikeItIs();
			DayTest fifthDay=new DayTest(Day.FRIDAY);
			fifthDay.tellItLikeItIs();
			DayTest seventhDay=new DayTest(Day.SUNDAY);
			seventhDay.tellItLikeItIs();
		

	}

}
