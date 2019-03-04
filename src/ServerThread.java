import java.net.Socket;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.UnknownHostException;

public class ServerThread extends Thread{
	

	private InputStreamReader isr; 
    //final PrintWriter printwr;
    BufferedReader bf = null;
    private PrintWriter printwr = null;
    private Socket soct = null; 

	public ServerThread(Socket soct,InputStreamReader isr,PrintWriter printwr){
		this.soct = soct;
		this.printwr = printwr;
		this.isr = isr;


	}


	@Override
	public void run(){

		String received;
		String response;	


		while(true){

			// receive the answer from client 
                //hello user
		    try{
			 	isr  = new InputStreamReader(soct.getInputStream()); 
      		 	bf = new BufferedReader(isr); 
                received = bf.readLine(); 

                if(received.equals("Done"))
                {  
                    System.out.println("Client " + this.soct + " sends exit..."); 
                    System.out.println("Closing this connection."); 
                    this.soct.close(); 
                    System.out.println("Connection closed"); 
                    break; 
                } 

                System.out.println("Server >> " + received);
             	System.out.println("Done");

             	//reply to server
      			printwr  = new PrintWriter(soct.getOutputStream()); 
      			printwr.println("I am good");
      			printwr.flush();
      		}catch(IOException e){
      			System.out.println(e);
      			System.exit(0);
      		}

		}

	}
}