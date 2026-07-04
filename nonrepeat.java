public class nonrepeat{
    public static void main(String args[]){

            String a="aabbdd";
            int count;
            boolean found=false;

            for(int i=0;i<a.length();i++){
                count=0;
                for(int j=0;j<a.length();j++){
                    if(a.charAt(i)==a.charAt(j)){
                        count++;
                    }
                }
                    if(count==1){
                        
                        

            System.out.print(a.charAt(i));
            found=true;
            break;
                    }
                }
                if(!found){
                        System.out.print("-1");
                    }
                    
                

                    }
                 
                
    }
