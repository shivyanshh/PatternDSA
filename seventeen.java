public class seventeen {
    public static void main(String[] args) {
        String Container[] = new String[4];
        Container[0]="A";
        Container[1]="B"; 
        Container[2]="C";
        Container[3]="D";


        int space = 3;
        int count = 1;
        int reversal = 0;
        for(int i =0; i<4;i++){
            String str ="";
            for(int j =space;j>0;j--){
                str+=" ";
            }
            for(int k =0;k<count;k++){
                str+=Container[k];
            }

            // for(int k =count;k>=0;k--){
            //     str+=Container[k];
            // }
            for(int k= reversal;k>0;k--){
                str += Container[k-1];
            }

            for(int j =space;j>0;j--){
                str+=" ";
            }
            space --;
            count ++;
            reversal ++;
            System.out.println(str);

        }
    }
}
