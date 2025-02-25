package me.brandonli;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SMPPulse implements ModInitializer {

	public static final String MOD_ID = "smp-pulse";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing SMP Earth!");
	}
}