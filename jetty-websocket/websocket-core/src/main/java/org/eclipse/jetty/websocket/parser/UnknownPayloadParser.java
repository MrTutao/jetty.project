package org.eclipse.jetty.websocket.parser;

import java.nio.ByteBuffer;

import org.eclipse.jetty.websocket.frames.BaseFrame;

public class UnknownPayloadParser extends FrameParser<BaseFrame>
{
    private BaseFrame frame;

    public UnknownPayloadParser()
    {
        super();
        frame = new BaseFrame();
    }

    @Override
    public BaseFrame getFrame()
    {
        return frame;
    }

    @Override
    public boolean parsePayload(ByteBuffer buffer)
    {
        return false;
    }

    @Override
    public void reset()
    {
        super.reset();
    }

}
