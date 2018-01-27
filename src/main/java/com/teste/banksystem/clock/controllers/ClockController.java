package com.teste.banksystem.clock.controllers;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.banksystem.clock.dto.AngleContract;

/**
 * 
 * @author Sergio Alexandre
 * @since 26 jan 2018 11:28
 * 
 * Classe controladora REST.
 *
 */
@RestController
@RequestMapping(ClockController.CONTRACT_BASE_URI)
public class ClockController {

	public static final String CONTRACT_BASE_URI = "v1/rest/clock";
	
	/**
	 * 
	 * @author Sergio Alexandre
	 * @since 26 jan 2018 11:28
	 * 
	 * Obtém o retorno do recurso no formato JSON.
	 *
	 */
	@Cacheable(value = "hour/{hour}/minute/{minute}")
	@RequestMapping(value = "hour/{hour}/minute/{minute}", produces = MediaType.APPLICATION_JSON_VALUE)
	private AngleContract getAngle(@PathVariable final int hour, @PathVariable final int minute) {
		AngleController angleController = new AngleController();
		AngleContract angle = new AngleContract();
		try {
			angle.setAngle(angleController.calculateLowerAngle(hour, minute));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return angle;
	}
	
}
