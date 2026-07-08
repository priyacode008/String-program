import java.util.*;
public class Anagram{
    public static void main(String args []){
        String n="java";
        String n1="jovo";

        if(n.length()!=n1.length()){
            System.out.print("not anagram");
        
        return;
        }
            char a[]=n.toCharArray();
                char b[]=n1.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            System.out.print("anagram");
        }
        else{
            System.out.print("not anagram");
        }
    }
}