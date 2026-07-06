public class vowels{
    public static void main(String args []){

        String s="PROgraming";
        String n=s.toLowerCase();
            int v=0,c=0;

        for(int i=0;i<n.length();i++){
            char b=n.charAt(i);

            if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u'){
                        v++;
            }
            else{
                c++;
            }
        }
        System.out.println("vowel count ="+v);
        System.out.println("consonant count ="+c);
}
}