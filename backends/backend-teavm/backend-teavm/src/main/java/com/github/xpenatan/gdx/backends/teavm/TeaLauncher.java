package com.github.xpenatan.gdx.backends.teavm;

import com.badlogic.gdx.ApplicationListener;
import com.github.xpenatan.gdx.backends.web.WebApplication;
import com.github.xpenatan.gdx.backends.web.WebApplicationConfiguration;

public class TeaLauncher {

    public static void main(String[] args) {
        try {
            WebApplicationConfiguration config = new TeaApplicationConfiguration("canvas");
            Object appListener = getApplicationListener();
            if(appListener != null) {
                ApplicationListener listener = (ApplicationListener)appListener;
                new WebApplication(listener, config);
            }
        }
        catch(Throwable t) {
            t.printStackTrace();
            throw t;
        }
    }

    private static native Object getApplicationListener();
}