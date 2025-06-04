public class eighteen {
    public static void main(String[] args){
        String container[] = new String[5];
        container[0] = "A";
        container[1] = "B";
        container[2] = "C";
        container[3] = "D";
        container[4] = "E";


        int count = 3;

        for (int i =0 ; i<5;i++){
            String str ="";
            for(int j = (4-i);j<=4;j++){
                str+= container[j];
                str+=" ";
            }
            System.out.println(str);

        }
    }
}
