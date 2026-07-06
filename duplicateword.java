public class duplicateword{
    public static void main(String args []){

                String s="i love love java program java";

                String a[]=s.split(" ");
                    for(int i=0;i<a.length;i++){
                        boolean found=false;
                    for(int j=0;j<i;j++){
                        if(a[i].equals(a[j])){
                            found=true;
                        }
                    }
                    if(!found){
                        System.out.print(a[i]);
                    }
                    System.out.print(" ");
                    }
    }
}