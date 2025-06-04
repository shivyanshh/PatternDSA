public class nineteen {
    public static void main(String[] args){
        for(int i = 0;i<5;i++){
            String upper ="";
            //upper half
            for(int j =0;j<(5-i);j++){
                upper+="*";
            }
            for(int k=0;k<(i*2);k++){
                upper+=" ";
            }
            for(int j =0;j<(5-i);j++){
                upper+="*";
            }
            System.out.println(upper);
        }
        for(int i =0;i<5;i++){
            //lower half
            String lower="";
            for(int j= 0; j<(i+1);j++){
                lower += "*";
            }
            for(int k =0;k<(8-(i*2));k++){
                lower += " ";
            }
            for(int j= 0; j<(i+1);j++){
                lower += "*";
            }

            System.out.println(lower);
        }
    }
}
