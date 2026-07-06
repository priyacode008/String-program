public class uniqueword{
    public  static void main(String args[]){
            String s="java is is my future";
                String a[]=s.split(" ");

                for(int i=0;i<a.length;i++){
                    boolean found=false;
                for(int j=0;j<a.length;j++){
                    if(a[i]!=a[j]&&a[i].equals(a[j])){
                                found=true;
                                break;
                    }
                }
                if(!found){
                    System.out.print(a[i]);
                }
                System.out.print(" ");
                }
    }
}