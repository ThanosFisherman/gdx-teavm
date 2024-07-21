package com.github.xpenatan.gdx.backends.teavm.webaudio.tone;

import org.teavm.jso.JSClass;
import org.teavm.jso.JSMethod;
import org.teavm.jso.JSObject;

@JSClass
public class Synth implements JSObject {

    @JSMethod("toDestination")
    public native Synth toDestination();


    //    note: Frequency,
//    duration: Time,
//    time?: Time,
//    velocity?: NormalRange
    @JSMethod("triggerAttackRelease")
    public native void playSynth(String note, String duration);
}
