package org.teavm.classlib.java.nio;

import com.github.xpenatan.gdx.backends.teavm.dom.typedarray.ArrayBufferViewWrapper;
import com.github.xpenatan.gdx.backends.teavm.gen.Emulate;
import emu.java.nio.HasArrayBufferView;

@Emulate(valueStr = "java.nio.ShortBufferOverByteBuffer", updateCode = true)
public abstract class ShortBufferOverByteBufferEmu extends TShortBufferOverByteBuffer implements HasArrayBufferView {

    public ShortBufferOverByteBufferEmu(int start, int capacity, TByteBufferImpl byteBuffer, int position, int limit, boolean readOnly) {
        super(start, capacity, byteBuffer, position, limit, readOnly);
    }

    @Override
    @Emulate
    public ArrayBufferViewWrapper getTypedArray() {
        HasArrayBufferView buff = (HasArrayBufferView)byteByffer;
        return buff.getTypedArray();
    }
}