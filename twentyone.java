public class twentyone {
    public static void main(String[] args){
        for(int i =0; i<4;i++){
            String str="";
            if(i==0){
                for(int j= 0;j<4;j++){
                   str += "*"; 
                }
                System.out.println(str);
            }

            else if(i==3){
                for(int j=0;j<4;j++){
                    str+= "*";
                }
                System.out.println(str);
            }
            else{
                str += "*";
                for(int j=0;j<2;j++){
                    str+= " ";
                }
                str+= "*";
                System.out.println(str);
            }

        }
    }    
}
