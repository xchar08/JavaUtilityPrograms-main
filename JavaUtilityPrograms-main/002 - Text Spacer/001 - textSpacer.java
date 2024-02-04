import java.util.*;
public class discordScanner{
   public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      String x = in.nextLine();
      String z = "**";
      in.close();
      int y = x.length();
      for(int i = 0; i < y; i++){
         if(x.substring(i,i+1)==" "){
            z+=(x.substring(i,i+1)+"  ");
         }else{
            z+=(x.substring(i,i+1)+" ");
         }            
      }
      System.out.println(z.toUpperCase()+"**");
   }
}