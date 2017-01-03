package slotmachine;

import java.io.BufferedReader;
import java.io.FileReader;


public class SlotsGame {

static int[] payoutTable = new int[1000];
    
    static void payoutTable(){
        
        String[] temp;

         try{
            //csv file with the data
            String strFile = "payout.csv";

            //creates the BufferedReader that reads csv file
            BufferedReader br = new BufferedReader( new FileReader(strFile));
            String strLine = "";

            int lineNumber = 0;//, tokenNumber = 0;

            while( (strLine = br.readLine()) != null)
            {
                   //temp = strLine.split(",");
                   payoutTable[lineNumber] = Integer.parseInt(strLine);
                   lineNumber++;
            }
         }
        catch(Exception e){
            System.out.println("Exception while reading csv file: " + e);                  
        }
    }

    
    public static void exitApp()
    {
        System.exit(0);
    }
    




	}


