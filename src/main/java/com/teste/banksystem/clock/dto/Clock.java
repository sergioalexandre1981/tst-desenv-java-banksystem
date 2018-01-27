package com.teste.banksystem.clock.dto;

/**
 * 
 * @author Sergio Alexandre
 * @since 26 jan 2018 11:28
 * 
 * Clock bean
 *
 */
@Deprecated
public class Clock {

	private int hour;
	
	private int minute;

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}
	
}
