import java.io.*;
import java.text.*;

public class Main
{
    public static void main(String[] args)
    {
        int size;

        System.out.println("Enter the pyramid size e.g 10");

        try{
            InputStreamReader isr = new InputStreamReader(System.in);

            BufferedReader b = new BufferedReader(isr);

            String sizeStr = b.readLine();

            DecimalFormat df  = new DecimalFormat();

            Number x = df.parse(sizeStr);
            
            size = x.intValue();
            
        }catch(IOException | ParseException e){
            size = 10;
        }
        
        Make(size);


    }
    
    static void Make(int x){
        
        for(int i = 0; i<=x;i++)
        {   
            String pyramid;

            if(i<1){
                pyramid = " ".repeat(10-i-i)+"X";
            }
            else{

                pyramid = " ".repeat(10-i)+ "X".repeat(i)+"X".repeat(i);
            }

            
            System.out.println(pyramid);
        }

    }
}
