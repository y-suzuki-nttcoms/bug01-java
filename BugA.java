
public class BugA {

	public static void main(String[] args) {
	    int n = 0;
	
	    switch (n) {
	        case 0:
	            System.out.println("ケース0。");
	            // break文を記述していない。
	        case 1:
	            System.out.println("ケース1。");
	            // break文を記述していない。
	        case 2:
	            System.out.println("ケース2。");
	            break;
	        default:
	            System.out.println("デフォルト。");
	    }
	}
}

