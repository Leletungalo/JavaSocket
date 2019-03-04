import java.net.Socket;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.UnknownHostException;

//import java.io.
//import java.io.DataOutputStream;


public class Client{
   
    // initialize socket and input output streams 
    private Socket soct            = null; 
    private InputStreamReader  input   = null; 
    private PrintWriter output = null;
    private BufferedReader  bf  = null;
    //private DataOutputStream out     = null; 

   
   
   public Client(String IP,int portNum)throws IOException{
   
   
  // try{
      
      //establish connection
      soct = new Socket(IP,portNum);
      
      // takes input from terminal 


      //receives from server
      input  = new InputStreamReader(soct.getInputStream()); 
      bf = new BufferedReader(input);
      System.out.println("Server >> " + bf.readLine());
      System.out.println("Done");

      //reply to server
      output  = new PrintWriter(soct.getOutputStream()); 
      //bf = new BufferedReader(output);
      output.println("I am good");
      output.flush();


      // sends output to the socket 
      

      //out    = new DataOutputStream(soct.getOutputStream()); 
      
      
      
      
   /*}catch(UnknownHostException UHerror){
    
      System.out.println(UHerror); 
   } 
   catch(IOException ioerror){
    
      System.out.println(ioerror); 
   }
   
        // String to read message from input 
        String messageLine = ""; 
  
         //keep reading until "Over" is input 
        while (!messageLine.equals("Over")){ 
         try{ 
                messageLine = input.readLine(); 
                out.writeUTF(messageLine); 
            } 
            catch(IOException ioerror) 
            { 
                System.out.println(ioerror); 
            } 
       } 
         
        // close the connection 
        try
        { 
            input.close(); 
            //out.close(); 
            soct.close(); 
        } 
        catch(IOException ioerror) 
        { 
            System.out.println(ioerror); 
        }*/
   
   }
   
   public static void main(String[] args)throws IOException{
   
    Client cl = new Client("137.158.58.83",12050);
   
   }

}