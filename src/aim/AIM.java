package aim;

public class AIM extends BasicServer implements Runnable
{
    public void run()
    {
        System.out.println( "Got here." );
    }
    
    public static void initialize_GUI()
    {
        // Create the GUI and make it visible
        AIM_GUI GUI = new AIM_GUI();
        
        GUI.setVisible( true );
    }
    
    public static void main( String[] args )
    {
        // Create a thread
        Thread thread = new Thread( new AIM() );
        
        thread.start();
        
        // Start up the GUI
        initialize_GUI();
    }    
}