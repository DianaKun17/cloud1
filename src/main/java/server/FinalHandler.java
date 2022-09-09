package server;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.io.FileWriter;

public class FinalHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void exceptionCaught (ChannelHandlerContext ctx, Throwable cause) throws Exception {
        System.out.println(cause.toString());
    }

    @Override
    public void channelRead (ChannelHandlerContext ctx, Object msg) throws Exception {
        byte[] arr = (byte[]) msg;
        FileWriter out = new FileWriter("one.txt");
        for (int i = 0; i < 3; i++) {
            out.write(" " + arr[i]);
        }
        out.close();
        System.out.println("Записано");

        ctx.write("Java\n");
        ctx.flush();
    }
}
