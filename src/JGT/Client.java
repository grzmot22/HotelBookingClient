package JGT;
import java.io.*;
import java.net.*;

public class Client
{
    public static void main(String[] args) throws IOException
    {
        Socket socket = new Socket("localhost", 8189);
        JGT.GUI.Login login = new JGT.GUI.Login(socket);

    }
}
