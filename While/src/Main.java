
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 6;
		while(count!=6){
			System.out.println("Count value is "+ count);
			count++;
		}
		
//		count =1;
//		while(count!=6){
//			if(count == 6){
//				break;
//			}
//			System.out.println("Count value is "+ count);
//			count++;
//		}
//		count =6;
//		do{
//			System.out.println("Count value was "+ count);
//			count++;
//			if(count> 100){
//				break;
//			}
//		}while(count!=6);
		
		int number = 5;
		int finishNumber = 20;
		int counter = 0;
		while(number<=finishNumber){
			if(!isEvenNumber(number)){
				number++;
				continue;
			}
			System.out.println("Even number "+ number);
			number++;
			counter++;
			if(counter==5){
				break;
			}
		}
	}
	
	private static boolean isEvenNumber(int number){
		if(number%2==0){
			return true;
		}else{
			return false;
		}
	}

}
