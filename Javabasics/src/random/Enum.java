package random;

enum Day{
	SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}



public class Enum {
	public static void main(String[]args) {
		Day ref = Day.SUNDAY;
		
		switch(ref) {
		
		case SUNDAY:
			System.out.println("HOLIDAY");
			break;
		
		case MONDAY:
			System.out.println("WORKING DAY");
			break;
			
		case TUESDAY:
			System.out.println("WORKING DAY");
			break;
			
		case WEDNESDAY:
			System.out.println("WORKING DAY");
			break;
			
		case THURSDAY:
			System.out.println("WORKING DAY");
			break;
			
		case FRIDAY:
			System.out.println("WORKING DAY");
			break;
		
		case SATURDAY:
			System.out.println("WORKING DAY");
			break;
			
		
	}

}}
