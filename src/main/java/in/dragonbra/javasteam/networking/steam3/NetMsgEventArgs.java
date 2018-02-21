package in.dragonbra.javasteam.networking.steam3;

import in.dragonbra.javasteam.util.event.EventArgs;

import java.net.InetSocketAddress;

/**
 * @author lngtr
 * @since 2018-02-20
 */
public class NetMsgEventArgs extends EventArgs {

    private byte[] data;

    private InetSocketAddress endPoint;

    public NetMsgEventArgs(byte[] data, InetSocketAddress endPoint) {
        this.data = data;
        this.endPoint = endPoint;
    }

    public NetMsgEventArgs withData(byte[] data) {
        return new NetMsgEventArgs(data, this.endPoint);
    }

    public byte[] getData() {
        return data;
    }

    public InetSocketAddress getEndPoint() {
        return endPoint;
    }
}
