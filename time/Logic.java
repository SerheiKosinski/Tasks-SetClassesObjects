package time;

public class Logic {

	
	public void numb(Time tt,int hh,int mm, int ss) {
		tt.setHours(tt.getHours() + hh);
		tt.setMinute(tt.getMinute() + mm);
		tt.setSecond(tt.getSecond() + ss);
		
		while(tt.getSecond() > 59) {
			tt.setMinute(tt.getMinute()+1);
			tt.setSecond(tt.getSecond()-60);
		}
		
		while(tt.getMinute() > 59) {
			tt.setMinute(tt.getMinute() - 60);
			tt.setHours(tt.getHours() + 1);
			
		}
		while(tt.getHours() > 23) {
			tt.setHours(tt.getHours() -24);
			
		}
	}
	}
