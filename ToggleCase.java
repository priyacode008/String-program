public class ToggleCase{
    public static void main(String args []){
        String s="AbcDeF";
        String result="";

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='A'&&c<='Z'){
                result=result+(char)(c+32);
            }
            else if(c>='a'&&c<='z'){
                result=result+(char)(c-32);
            }
            else{
                result=result+c;
            }
        }
            System.out.print(result);
        
    }
}