package com.github.xpenatan.gdx.backends.teavm.webaudio.tone;

import org.teavm.jso.JSClass;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSObject;

@JSClass
public class PolySynth implements JSObject {

    @JSMethod("toDestination")
    public native PolySynth toDestination();

    @JSMethod("triggerAttackRelease")
    public native void playSynth(String note, String duration);
}
