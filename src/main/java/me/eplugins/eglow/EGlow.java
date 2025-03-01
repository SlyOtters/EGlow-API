package me.eplugins.eglow;

import me.eplugins.eglow.api.EGlowAPI;

public class EGlow {
	private static EGlow instance;
	private static EGlowAPI api;

	//Getter
	public static EGlow getInstance() {
		return EGlow.instance;
	}

	public static EGlowAPI getAPI() {
		return api;
	}
}