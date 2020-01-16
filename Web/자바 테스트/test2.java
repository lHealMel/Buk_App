
import java.util.*;

public class test2 {
	public static void main(String[] args) {

		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int less = random.nextInt(9);
		int sel = random.nextInt(9);
		int i = 0;
		// 0.01ÀÇ È®·ü
			while (less != sel) {
				i += 1;
				System.out.println("²Î");
				int less1 = random.nextInt(9);
				int sel1 = random.nextInt(9);
				less = less1;
				sel = sel1;
			    try {
					Thread.sleep(100);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}

			    
			    
				if (less == sel) {
					i += 1;
					System.out.println("´çÃ·");
					System.out.println("ÃÑ ½ÃµµÇÑ È½¼ö:" + i);
                    }
		}

		scan.close();
		return;
	}

}
