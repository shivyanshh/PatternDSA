public class ninth {
    public static void main(String[] args){
        int rows = 8;
        for(int i = 0;i <= rows;i++){
            String str ="";
            for(int j = 0; j <= rows -1;j++){
                str += " ";
            }
            for(int k =1; k <= ((i*2)+1);k++){
                str += "*";
            }
            System.out.println(str);
            rows -= 1;
        }
        for(int q=0;q<5;q++){
            String str1="";
            for(int j =1; j<(q+1);j++){
                str1 +=" ";
            }
            for(int k =0; k<(9-(q*2));k++){
                str1 += "*";
            }
            System.out.println(str1);
        }
    }
}
