package java_se.stu15;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author bfsz
 * @version 1.0
 * @description: 客户端
 * @date 2021/6/30 14:50
 */
public class ClientTCP {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端 发送数据");
        // 1.创建 Socket ( ip , port ) , 确定连接到哪里.
        Socket client = new Socket("localhost", 6666);
        // 2.通过Scoket,获取输出流对象
        OutputStream os = client.getOutputStream();
        // 3.写出数据.
        os.write("连接成功！客户端数据：0".getBytes());
        // ==============解析回写=========================
        // 4. 通过Scoket,获取 输入流对象
        InputStream in = client.getInputStream();
        // 5. 读取数据数据
        byte[] b = new byte[100];
        int len = in.read(b);
        System.out.println(new String(b, 0, len));
        // 6. 关闭资源 .
        in.close();
        os.close();
        client.close();
    }
}
