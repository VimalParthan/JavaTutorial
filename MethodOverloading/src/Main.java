
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int newScore = calculateScore("Tim ", 500);
		System.out.println("New score is " + newScore);
		calculateScore(75);
		calculateScore(157);
		
		double centimetres = calcFeetAndInchesToCentimeters(157);
		
		if(centimetres<0.0){
			System.out.println("Invalid Parameters");
		}else
		System.out.println(centimetres);
	}
	
	public static int calculateScore(String playerName, int score){
		System.out.println("Player " + playerName + " scored "+ score + " points");
		return score * 1000;
	}
	
	public static int calculateScore( int score){
		System.out.println("Unnamed player scored "+ score + " points");
		return score * 1000;
	}
	
	public static int calculateScore(){
		System.out.println("No player name, no player score.");
		return 0;
	}
	
	public static double calcFeetAndInchesToCentimeters(double feet,double inches){
		
		if(isValidParameters(feet,inches)){
			System.out.println(feet + " feet " + inches + " inches = " + (feet*2.54*12)+(inches*(2.54))+ " centimetres " );
			return (feet*2.54*12)+(inches*(2.54));
		}
		return -1d;
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches){
		
		if(isValidParameters(inches)){
			double feet = inches/12;
			inches = inches % 12;
			return calcFeetAndInchesToCentimeters(feet,inches);
		}
		return -1d;
	}
	
	public static boolean isValidParameters(double feet, double inches){
		if(feet>=0 &&( inches >=0 && inches <=12)){
			return true;
		}else
			return false;
	}
	
	public static boolean isValidParameters( double inches){
		if(inches >=0){
			return true;
		}else
			return false;
	}
	
}
