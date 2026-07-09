public class ferquentchar{
    public static void main(String args[]){
        String s="pineapple";

        int count=0,max=0;
        char maxchar=0;

        for(int i=0;i<s.length();i++){
            count=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count>max){
                max=count;
                maxchar=s.charAt(i);
            }
        }
        System.out.print(maxchar);
    }
}