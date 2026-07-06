public class Alphabetcount{
    public static void main(String args []){
        String s="jAva123@#";
            int count=0;

        for(int i=0;i<s.length();i++){
            char n=s.toUpperCase().charAt(i);
            if(n>='A'&&n<='Z'){
                count++;
                
            }
        }
        System.out.print(count);
    }
}