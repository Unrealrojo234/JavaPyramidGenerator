public class Main
{
    public static void main(String[] args)
    {
        Make();

    }
    
    static void Make(){
        for(int i = 0; i<=10;i++)
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
