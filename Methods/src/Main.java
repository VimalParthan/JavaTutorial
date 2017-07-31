
public class Main {

	public static void main(String[] args) {
	
		int highScore = calculateScore(true, 800, 5, 100);
		System.out.println("Your final score was "+ highScore);
		
		
		
		highScore = calculateScore(true, 10000, 8, 200);
		System.out.println("Your final score was "+ highScore);
		
		
		highScore = 1500;
		int position = calculateHighScorePostion(highScore);
		displayHighScorePosition("Vimal", position);
		
		highScore = 900;
		position = calculateHighScorePostion(highScore);
		displayHighScorePosition("Shamal", position);
		
		highScore = 400;
		position = calculateHighScorePostion(highScore);
		displayHighScorePosition("Aromal", position);
		
		highScore = 50;
		position = calculateHighScorePostion(highScore);
		displayHighScorePosition("Sahle", position);
		
	}

	public static int calculateScore(boolean gameOver, int score, int levelCompleted,int bonus){
		
		if(gameOver){
			int finalScore = score+  (levelCompleted * bonus);
			finalScore += 2000;
			return finalScore;
		}
		return -1;
	}
	
	public static void displayHighScorePosition(String playerName,int position){
		System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
	}
	
	public static int calculateHighScorePostion(int score){
		if(score>=1000){
			return 1;
		}else if(score>=500&&score<1000){
			return 2;
		}else if(score>=100&&score<500){
			return 3; 
		}
		
		return 4;
	}
}
