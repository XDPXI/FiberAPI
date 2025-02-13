package dev.xdpxi.fiberapi.api.v3;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.resource.language.LanguageManager;

import java.util.Objects;

public class LangUtil {
    public static String getLang() {
        MinecraftClient client = MinecraftClient.getInstance();
        return client.getLanguageManager().getLanguage();
    }

    public static void setLang(String lang) {
        MinecraftClient client = MinecraftClient.getInstance();
        LanguageManager languageManager = client.getLanguageManager();
        if (!Objects.equals(getLang(), lang)) {
            languageManager.setLanguage(lang);
            client.reloadResources();
        }
    }
}