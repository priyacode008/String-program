public class longestsubstring{
    public static void main(String args []){

        String s="abcaabcdba";

        int max=0;

        for(int i=0;i<s.length();i++){
            String temp="";
            for(int j=i;j<s.length();j++){
                if(temp.contains(s.charAt(j)+"")){
                    break;
                }
                temp=temp+s.charAt(j);
                if(temp.length()>max){
                    max=temp.length();
                }
            }        
        }
        System.out.print(max);
    }
}