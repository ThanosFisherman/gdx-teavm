package com.github.xpenatan.gdx.examples.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.github.xpenatan.gdx.examples.tests.GearsDemo;

public class Main {

    public static void main(String[] args) {
        new LwjglApplication(new GearsDemo());
    }
}
