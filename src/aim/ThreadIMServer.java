package aim;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ThreadIMServer extends BasicServer implements Runnable
{
    public ThreadIMServer()
    {
        super( 4225, 0 );
    }
    
    protected void serviceConnection( Socket connection ) throws IOException
    {
        ServerConnectionThread connectThread = new ServerConnectionThread( this, 
                connection );
        connectThread.start();
    }
    
    public void run()
    {
        ServerConnectionThread thisThread = ( ServerConnectionThread )
                Thread.currentThread();
        Socket thisSocket = thisThread.getSocket();
        BufferedReader in;
        PrintWriter out;
        String user = null;

        /**********************
        a bunch of code deleted; this is where
        you handle the handshake with the client, and then
        put your readline busy wait
        **************************/
    }
    
    public static void main( String[] args )
    {
        ThreadIMServer myServer = new ThreadIMServer();

        // spins on ServerSocket
        myServer.start();
    }
}
