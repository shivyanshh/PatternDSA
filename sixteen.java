public class sixteen {
    public static void main(String[] args){
        String Container[] = new String[5];
        Container[0]="A";
        Container[1]="B"; 
        Container[2]="C";
        Container[3]="D";
        Container[4]="E";

        int check = 0;
        for(int i =0;i<5;i++){
            String str ="";
            
            for(int j = 0; j<(i+1);j++){
                str += Container[check];
                str +=" ";
            }
            System.out.println(str);
            check ++;
        }
    }
}
