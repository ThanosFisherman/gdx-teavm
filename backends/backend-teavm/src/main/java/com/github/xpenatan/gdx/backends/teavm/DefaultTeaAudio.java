package com.github.xpenatan.gdx.backends.teavm;

import com.badlogic.gdx.audio.AudioDevice;
import com.badlogic.gdx.audio.AudioRecorder;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.github.xpenatan.gdx.backends.teavm.webaudio.howler.HowlerAudioManager;
import com.github.xpenatan.gdx.backends.teavm.webaudio.tone.Tone;

/**
 * @author xpenatan
 * Port from GWT gdx 1.12.0
 */
public class DefaultTeaAudio implements TeaAudio {
    private HowlerAudioManager webAudioAPIManager = null;

    public DefaultTeaAudio() {
        webAudioAPIManager = new HowlerAudioManager();
    }

    @Override
    public AudioDevice newAudioDevice(int samplingRate, boolean isMono) {
        throw new GdxRuntimeException("AudioDevice not supported by teaVM backend");
    }

    @Override
    public AudioRecorder newAudioRecorder(int samplingRate, boolean isMono) {
        throw new GdxRuntimeException("AudioRecorder not supported by teaVM backend");
    }

    @Override
    public Sound newSound(FileHandle fileHandle) {
        return webAudioAPIManager.createSound(fileHandle);
    }

    @Override
    public Music newMusic(FileHandle file) {
        return webAudioAPIManager.createMusic(file);
    }

    @Override
    public boolean switchOutputDevice(String deviceIdentifier) {
        return true;
    }

    @Override
    public String[] getAvailableOutputDevices() {
        // Just using this method temporarily for my experiments
        // will delete later
        Tone.start();
        var synth = Tone.createSynth().toDestination();
        var polySynth = Tone.createPolySynth().toDestination();
        synth.playSynth("G4", "8n");
        polySynth.playSynth("C4", "8n");
        TeaApplication.print("TONE JS STATE: " + Tone.state());
        return new String[0];
    }
}