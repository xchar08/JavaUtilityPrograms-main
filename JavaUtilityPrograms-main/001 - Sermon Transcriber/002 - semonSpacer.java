import java.io.*;
import java.util.*;
public class semonSpace{
   public static void main(String args[]) throws IOException{
      File mySermon = new File("jrw.dat");
      Scanner in = new Scanner(mySermon);
      while(in.hasNext()){
         System.out.print(in.nextLine()+" ");
      }
   }
}