public class AsteriskSequence {
    public static void main(String args[]) {
      //part 1
      for (int i=1;i<=10;i++){
          for (int j=1; j<=i;j++) 
            System.out.print("*");
          System.out.println();
      }
      System.out.println();
      //part 2
      for (int i=10;i>=1;i--){
          for(int j=i;j>=1;j--) System.out.print("*");
          System.out.println();
      }
      System.out.println();
      //part 3
       for (int i=1;i<=10;i+=2){
           for (int j=1; j<=i;j++) {
               System.out.print("*");
           }
           System.out.println();
       }
       System.out.println();
       //part 4
       for (int i=9;i>=1;i-=2){
          for(int j=i;j>=1;j--) System.out.print("*");
          System.out.println();
      }
      System.out.println();
    }
}