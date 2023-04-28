package kr.co.exam05.ex03;

public class Clock {
	private int hour;
	private int minute;
	private int second;
	

	public Clock(int hour, int minute, int second) {
		this.setHour(hour);
		this.setMinute(minute);
		this.setSecond(second);
	}

	public String getTimeString() {
		return this.hour + ":" + this.minute + ":" + this.second;
	}
	
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	
	private void setHour(int hour) {
		this.hour = hour % 24;
	}
	private void setMinute(int minute) {
		this.minute = minute % 60;
	}
	private void setSecond(int second) {
		this.second = second % 60;
	}
}
