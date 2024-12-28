package dev.xdpxi.fiberapi;

import dev.xdpxi.fiberapi.util.Log;
import net.fabricmc.api.ClientModInitializer;

public class Client implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		Log.info("[FiberAPI/Client] - Initializing...");

		Log.info("[FiberAPI/Client] - Initialized!");
	}
}