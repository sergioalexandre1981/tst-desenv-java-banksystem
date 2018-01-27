package com.teste.banksystem.clock.controllers;

import com.teste.banksystem.clock.util.Utilities;

/**
 * 
 * @author Sergio Alexandre
 * @since 26 jan 2018 11:28
 * 
 * Classe controladora responsável pela conversão e cálculo das horas para graus. 
 *
 */
public class AngleController {
	
	private static final int ANGLE = 360;
	private static final int SESSION_ANGLE = 30;
	private static int HOUR = 60;
	
	/**
	 * @author Sergio Alexandre
	 * @since 26 jan 2018 11:28
	 * 
	 * Calcula o menor ângulo entre os ponteiros de horas e minutos. 
	 *
	 */
	public int calculateLowerAngle(int hour, int minute) throws Exception {
		int angle = 0;
		if(validaHora(hour, minute)) {
			int hourAngle = convertHourToAngle(Utilities.hourConvert(hour), minute);
			int minuteAngle = convertMinuteToAngle(minute);
			angle = minuteAngle - hourAngle;
			angle = getLowerAngle(angle);	
			if(angle < 0) {
				angle = angle * - 1;
			}
			return angle;
		} else {
			throw new Exception("Hora ou minuto inválido.");
		}
	} 
	
	/**
	 * @author Sergio Alexandre
	 * @since 26 jan 2018 11:28
	 * 
	 * Converte de minuto para ângulo.
	 *
	 */
	private int convertMinuteToAngle(int minute) {
		int minuteAngle = (360 * minute) / HOUR;
		return minuteAngle;
	}
	
	/**
	 * @author Sergio Alexandre
	 * @since 26 jan 2018 11:28
	 * 
	 * Converte de hora para ângulo.
	 *
	 */
	private int convertHourToAngle(int hour, int minute) {
		int hourhand = (SESSION_ANGLE * minute) / HOUR;
		int sumAngles = (SESSION_ANGLE * hour) + hourhand;
		return sumAngles;
	}
	
	/**
	 * @author Sergio Alexandre
	 * @since 26 jan 2018 11:28
	 * 
	 * obtém o menor ângulo em relação ao total de 360 graus.
	 *
	 */
	private int getLowerAngle(int angle) {
		int lowerAngle = ANGLE - angle;
		if(lowerAngle < angle) {
			return lowerAngle;
		} else {
			return angle;
		}
	}
	
	/**
	 * @author Sergio Alexandre
	 * @since 26 jan 2018 11:28
	 * 
	 * Valida se os valores hora e minuto são válidos.
	 *
	 */
	private boolean validaHora(int hour, int minute) {
		if(hour < 0 || hour > 24 || minute < 0 || minute > 60) {
			return false;
		} else {
			return true;
		}
	}
	
}
