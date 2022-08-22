package time;

public class Main {
	
	public static void main(String[] args) {
		
			
           Time time = new Time ();
		
        View view11 = new View();
		view11.print(time);
		
		   int hours = 2;
		   int minute = 65;
		   int secunda = 101;
		
		   Logic lastTime = new Logic();
		   lastTime.numb(time, hours, minute, secunda);
		
		View view22 = new View();
		view22.print(time);	
	}

}
