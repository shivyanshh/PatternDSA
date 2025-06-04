public class fifteen {
    public static void main(String[] args) {
        String container[] = new String[5];
        container[0] = "A";
        container[1] = "B";
        container[2] = "C";
        container[3] = "D";
        container[4] = "E";

        
        for(int i=4;i>=0;i--){
            String str ="";
            for(int j=0;j<i+1;j++){
                str += container[j];
                str += " ";
            }
            System.out.println(str);
        }


    }
}
