public class eleventh {
    public static void main(String[] args){
        for(int i=0;i <5;i++){
            String str ="";
            if(i%2==0){
                for(int j = 0; j<i+1;j++){
                    if(j%2==0){
                        str += "1 ";
                    }
                    else{
                        str+="0 ";
                    }
                }
            }
            else{
                for(int j =0 ;j<i+1;j++){
                    if(j%2==0){
                        str += "0 ";
                    }
                    else{
                        str+= "1 ";
                    }
                }
            }
            System.out.println(str);
        }
    }
}
