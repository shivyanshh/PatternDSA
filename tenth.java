public class tenth {
    public static void main(String[] args){
        for(int i = 0;i <4;i++){
            String str ="";
            for(int j = 0 ; j < i + 1;j++){
                str+= "*";
            }
            System.out.println(str);
        }

        for(int k= 0;k<6;k++){
            String str2 ="";
            for(int q = 0;q<(5-k);q++){
                str2 += "*";
            }
            System.out.println(str2);
        }
    }
}
