public class charactercount{
    public static void main(String args []){
                String s="aaabbccccd";

                int count=1;

                for(int i=0;i<s.length();i++){
                    if(i==s.length()-1||s.charAt(i)!=s.charAt(i+1)){
                        System.out.print(s.charAt(i));
                                System.out.print(count);
                        count=1;

                    }
                    else{
                        count++;
                    }
                }
    }
}