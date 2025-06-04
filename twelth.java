public class twelth {
    public static void main(String[] args){
        for(int i =1;i < 5;i++){
            String str = "";
            int count =0; 
            for(int j = 1;j<i+1;j++){
                str += j;
                count ++;
            }
            for(int k =8-(count*2);k>0;k--){
                str += " ";
            }
            for(int j = count; j>=1;j--){
                str += j;
            }
            System.out.println(str);

        }
    }
}
