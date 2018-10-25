import java.io.IOException;
import java.util.Scanner;

public class UseThresholdApp
 {
    public static void main(String[] args) throws IOException
    {
       
        Scanner key = new Scanner(System.in);
        
        System.out.println("Enter a filename");
        String pFile = key.nextLine();
        
        System.out.println("Enter a Threshold");
        double pThre = key.nextDouble();
        
        UseThreshold hek = new UseThreshold(pFile, pThre);
        hek.getCount();
        hek.getSum();
        hek.getMax();
        

    }
 }


