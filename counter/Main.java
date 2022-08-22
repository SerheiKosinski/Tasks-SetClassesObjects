package counter;

public class Main {
	public static void main(String[] args) {
		
		Counter count1 = new Counter();
		Counter count2 = new Counter(0, 15, 85);
		
		
		View print = new View();
		
		
		for (int i = 0; i < 100; i++) {
			count1.counterIncr();
			count2.counterIncr();
		}
		View.Incr();
		print.Result(count1.returnCurrent());
		print.Result(count2.returnCurrent());
		
		for (int i = 0; i < 100; i++) {
			count1.counterDecr();
		    count2.counterDecr();
		}
		print.Decr();
		print.Result(count1.returnCurrent());
		print.Result(count2.returnCurrent());

	}	
}

