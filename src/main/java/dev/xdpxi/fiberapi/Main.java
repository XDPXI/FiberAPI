package dev.xdpxi.fiberapi;

import dev.xdpxi.fiberapi.util.Log;
import dev.xdpxi.fiberapi.util.Test;
import net.fabricmc.api.ModInitializer;

public class Main implements ModInitializer {
    public static final String MOD_ID = "fiber-api";

    @Override
    public void onInitialize() {
        Log.info("[FiberAPI/Main] - Initializing...");

        Test.register();

        Log.info("[FiberAPI/Main] - Initialized!");
    }
}