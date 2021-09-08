import java.util.*;
import java.io.*;

public class NumberGuesser{
    public static void main(String[]args) throws Exception{
        int guess=-50;
        int count=0;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int ran=(int)(Math.random() * 100) + 1;
        while (count<5){
            System.out.println("Guess the number");
            guess=Integer.parseInt(br.readLine());
            if (Math.abs(ran-guess)<10){
                System.out.println(ran);
                System.exit(0);
            }
            else{
                System.out.println("Try again");
                count++;
                    if (count==5){
            System.out.println("Sorry");
            System.exit(0);
        }
            }
        }
    
    }
}