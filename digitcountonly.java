public class digitcountonly{
    public static void main(String args[]){
        String n="a1b23c4d5f8r9c8";

        int count=0;

        for(int i=0;i<n.length();i++){
            char c=n.charAt(i);
            if(c>='0'&&c<='9' ){
                count++;
            }
        }
        System.out.print(count);
    }
    
}