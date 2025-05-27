public class seventh {
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
    }
}
