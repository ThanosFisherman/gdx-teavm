package com.github.xpenatan.gdx.backends.teavm.webaudio.tone;

import org.teavm.jso.JSBody;
import org.teavm.jso.core.JSPromise;


public class Tone {


    @JSBody(script = "return new Tone.getContext().state;")
    public static native String state();

    @JSBody(script = "return new Tone.start();")
    public static native JSPromise<Void> start();

    @JSBody(script = "return new Tone.Synth();")
    public static native Synth createSynth();

    @JSBody(script = "" +
            "return new Tone.PolySynth(Tone.MonoSynth, {\n" +
            "\t\t\t\tvolume: -8,\n" +
            "\t\t\t\toscillator: {\n" +
            "\t\t\t\t\ttype: \"square8\",\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\tenvelope: {\n" +
            "\t\t\t\t\tattack: 0.05,\n" +
            "\t\t\t\t\tdecay: 0.3,\n" +
            "\t\t\t\t\tsustain: 0.4,\n" +
            "\t\t\t\t\trelease: 0.8,\n" +
            "\t\t\t\t},\n" +
            "\t\t\t\tfilterEnvelope: {\n" +
            "\t\t\t\t\tattack: 0.001,\n" +
            "\t\t\t\t\tdecay: 0.7,\n" +
            "\t\t\t\t\tsustain: 0.1,\n" +
            "\t\t\t\t\trelease: 0.8,\n" +
            "\t\t\t\t\tbaseFrequency: 300,\n" +
            "\t\t\t\t\toctaves: 4,\n" +
            "\t\t\t\t},\n" +
            "\t\t\t});")
    public static native PolySynth createPolySynth();

    @JSBody(params = "synth", script = "synth.triggerAttackRelease('C4', '8n');")
    public static native void playSynth(Object synth);

//    @JSMethod("state")
//    public native String getState();
}
