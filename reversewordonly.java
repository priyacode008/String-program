public class reversewordonly{
    public static void main(String args []){
        String s="a1b3c$d";
        char a[]=s.toCharArray();

        int left=0;
        int right=a.length-1;

        while(left<right){
            while(left<right&&!Character.isLetter(a[left])){
                left++;
            }
            while(left<right&&!Character.isLetter(a[right])){
                right--;
            }
            char temp=a[left];
            a[left]=a[right];
            a[right]=temp;
            left++;
            right--;
        }

        System.out.print(a);
    }
}