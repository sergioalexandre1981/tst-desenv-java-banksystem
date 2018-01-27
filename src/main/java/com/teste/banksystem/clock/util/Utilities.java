package com.teste.banksystem.clock.util;

/**
 * 
 * @author Sergio Alexandre
 * @since 26 jan 2018 11:28
 * 
 * Classe utilitária. 
 *
 */
public class Utilities {

	private static final int ZERO_HOUR = 0;
	private static final int ONE_HOUR = 1;
	private static final int TWO_HOUR = 2;
	private static final int THREE_HOUR = 3;
	private static final int FOUR_HOUR = 4;
	private static final int FIVE_HOUR = 5;
	private static final int SIX_HOUR = 6;
	private static final int SEVEN_HOUR = 7;
	private static final int EIGHT_HOUR = 8;
	private static final int NINE_HOUR = 9;
	private static final int TEN_HOUR = 10;
	private static final int ELEVEN_HOUR = 11;
	private static final int TWELVE_HOUR = 12;
	private static final int THIRTEEN_HOUR = 13;
	private static final int FOURTEEN_HOUR = 14;
	private static final int FIFTEEN_HOUR = 15;
	private static final int SIXTEEN_HOUR = 16;
	private static final int SEVENTEEN_HOUR = 17;
	private static final int EIGHTEEN_HOUR = 18;
	private static final int NINETEEN_HOUR = 19;
	private static final int TWENTY_HOUR = 20;
	private static final int TWENTY_ONE_HOUR = 21;
	private static final int TWENTY_TWO_HOUR = 22;
	private static final int TWENTY_THREE_HOUR = 23;
	private static final int TWENTY_FOUR_HOUR = 24;
	
	/**
	 * 
	 * @author Sergio Alexandre
	 * @since 26 jan 2018 11:28
	 * 
	 * Converte os horários para facilitar a contagem dos graus do ponteiro hora. 12 horas representa 360 graus.
	 *
	 */
	public static int hourConvert(int hour)  {
		if(hour == ZERO_HOUR) {
			return TWELVE_HOUR;
		} else if(hour == THIRTEEN_HOUR) {
			return ONE_HOUR;
		} else if(hour == FOURTEEN_HOUR) {
			return TWO_HOUR;
		} else if(hour == FIFTEEN_HOUR) {
			return THREE_HOUR;
		} else if(hour == SIXTEEN_HOUR) {
			return FOUR_HOUR;
		} else if(hour == SEVENTEEN_HOUR) {
			return FIVE_HOUR;
		} else if(hour == EIGHTEEN_HOUR) {
			return SIX_HOUR;
		} else if(hour == NINETEEN_HOUR) {
			return SEVEN_HOUR;
		} else if(hour == TWENTY_HOUR) {
			return EIGHT_HOUR;
		} else if(hour == TWENTY_ONE_HOUR) {
			return NINE_HOUR;
		} else if(hour == TWENTY_TWO_HOUR) {
			return TEN_HOUR;
		} else if(hour == TWENTY_THREE_HOUR) {
			return ELEVEN_HOUR;
		} else if(hour == TWENTY_FOUR_HOUR) {
			return TWELVE_HOUR;
		} else {
			return hour;
		}
	}
	
}
