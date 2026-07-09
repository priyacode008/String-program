public class decode{
    public static void main(String args[]){
        String s="a3b2c4";
        String result="";

        for(int i=0;i<s.length();i=i+2){
            char c=s.charAt(i);
            int count=s.charAt(i+1)-'0';
            for(int j=0;j<count;j++){
                result=result+c;
            }
        }
        System.out.print(result);
    }
}