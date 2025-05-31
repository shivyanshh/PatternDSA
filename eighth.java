public class eighth{
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            String str="";
            for(int j =1; j<(i+1);j++){
                str +=" ";
            }
            for(int k =0; k<(9-(i*2));k++){
                str += "*";
            }
            System.out.println(str);
        }
    }
}