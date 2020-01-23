
import java.util.*;

public class test2 {
	public static void main(String[] args) {

		Random rd = new Random();
		Scanner scan = new Scanner(System.in);
		int less = rd.nextInt(9);
		int sel = rd.nextInt(9);
		int i = 0;
		// 0.01의 확률
			while (less != sel) {
				i += 1;
				System.out.println("꽝");
				int less1 = rd.nextInt(9);
				int sel1 = rd.nextInt(9);
				less = less1;
				sel = sel1;
			    try {
					Thread.sleep(100);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}

			    
			    
				if (less == sel) {
					i += 1;
					System.out.println("당첨");
					System.out.println("총 시도한 횟수:" + i);
                    }
		}

		scan.close();
		return;
	}

}
