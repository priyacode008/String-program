public class longestword{
    public static void main(String args []){
        String s="java is a programming language";
         String longest="";
        String a[]=s.split(" ");

        for(int i=0;i<a.length;i++){
            if(a[i].length()>longest.length()){
                longest=a[i];
            
            }
        }
        System.out.print(longest);
    }
}