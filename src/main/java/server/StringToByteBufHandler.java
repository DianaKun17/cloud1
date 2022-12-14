package server;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.PooledByteBufAllocator;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;

public class StringToByteBufHandler extends ChannelOutboundHandlerAdapter {
    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) {
        String str = (String) msg;
        byte[] arr = str.getBytes();
        ByteBufAllocator allocator = new PooledByteBufAllocator();
        ByteBuf buf = allocator.buffer(arr.length);
        buf.writeBytes(buf);
        ctx.writeAndFlush(buf);
    }
}
