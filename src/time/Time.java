package time;

public class Time {
	 private int hours;
	 private int minute;
	 private int second;

	 public Time() {
	      hours = 0;
	      minute = 0;
	      second = 0;
	 }
	 public Time(int hours, int minute,int second) {
		 
		if(hours<0 || hours>23) {
				hours = 0;
		}
		
		if(minute < 0 || minute > 59) {
				minute = 0;
		}
		
		if(second < 0 || second > 59) {
				second=0;
		}
	
	 }
	      
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	@Override
	public String toString() {
		return "Time [hours=" + hours + ", minute=" + minute + ", second=" + second + ", getHours()=" + getHours()
				+ ", getMinute()=" + getMinute() + ", getSecond()=" + getSecond() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}     
}
