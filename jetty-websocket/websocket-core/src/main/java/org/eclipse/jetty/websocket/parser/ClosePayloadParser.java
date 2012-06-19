package org.eclipse.jetty.websocket.parser;

import java.nio.ByteBuffer;

import org.eclipse.jetty.websocket.frames.CloseFrame;

/**
 * Parsing for the {@link CloseFrame}.
 */
public class ClosePayloadParser extends FrameParser<CloseFrame>
{
    private CloseFrame frame;

    public ClosePayloadParser()
    {
        super();
        frame = new CloseFrame();
    }

    @Override
    public CloseFrame getFrame()
    {
        return frame;
    }

    @Override
    public boolean parsePayload(ByteBuffer buffer)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void reset()
    {
        super.reset();

    }
}
