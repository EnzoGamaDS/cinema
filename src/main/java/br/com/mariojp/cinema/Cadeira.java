package br.com.mariojp.cinema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Cadeira {

	private Map cadeiras;

	public Cadeira(int cadeiras) {
		this.cadeiras = gerarCadeiras(cadeiras);
	}

	private static Map gerarCadeiras(int c) {
		Map<Integer, String> sala = new HashMap<Integer, String>();
		for (int i = 0; i < c; i++) {
			sala.put(i, "S");
		}
		return sala;
	}
	
	public Map getCadeiras() {
		return this.cadeiras;
	}



}