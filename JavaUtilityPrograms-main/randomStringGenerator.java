import java.util.*;
public class passwordGen{
    public static void main(String args[]){
        String list = "`1234567890-=qwertyuiop[]asdfghjkl;zxcvbnm,./~!@#$%^&*()_+QWERTYUIOP{}|ASDFGHJKL:ZXCVBNM<>?";
        ArrayList<String> pass = new ArrayList<String>(Arrays.asList(list.split("")));
        for(int i = 0; i<16; i++){
            System.out.print(pass.get((int)(Math.random()*pass.size())));
        }
    }
}