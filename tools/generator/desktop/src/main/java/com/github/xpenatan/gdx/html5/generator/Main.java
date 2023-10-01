package com.github.xpenatan.gdx.html5.generator;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
    public static void main(String[] args) {
        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.width = 640;
        config.height = 174;
        config.resizable = false;
        config.title = "Gdx-Html5-Generator";
        new LwjglApplication(new ImGuiGame(), config);
    }
}