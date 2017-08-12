import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class DestroyingBalls {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t = scanner.nextInt();
		LinkedList<Integer> balls ;
		int N = 0;

		for (int i = 0; i < t; i++) {
			balls = new LinkedList<Integer>();
			N = scanner.nextInt();
			balls=readInputBlock(balls, N);
			if (destroyAllBalls(balls, N)) {
				System.out.println("Yes");
			} else {
				System.out.println("NO");
			}
		}

		scanner.close();

	}

	private static LinkedList<Integer> readInputBlock(LinkedList<Integer> balls, int N) {

		for (int i = 0; i < N; i++) {
			balls.add(scanner.nextInt());
		}
		return balls;
	}

	private static boolean destroyAllBalls(LinkedList<Integer> balls, int N) {

		boolean canBeDestroyed = true;
		ListIterator<Integer> ballsIterator;

		while (canBeDestroyed) {
			canBeDestroyed = false;
			ballsIterator = balls.listIterator();
			while (ballsIterator.hasNext()) {
				if (ballsIterator.next().intValue()==N) {
					ballsIterator.remove();
					canBeDestroyed = true;
				}

			}
			N=balls.size();
		}

		if (balls.size() == 0) {
			return true;
		}
		return false;
	}

}
