public class demo {
    public static void main(String[] args) {
        String container[] = new String[5];
        container[0] = "A";
        container[1] = "B";
        container[2] = "C";
        container[3] = "D";
        container[4] = "E";

        
        for(int i=0;i<5;i++){
            String str ="";
            for(int j=0;j<i+1;j++){
                str += container[j];
                str += " ";
            }
            System.out.println(str);
        }













































        // for(int i = 0; i<5;i++){
        //     String str ="hello";
        //     str += "\n";
        //     str += "ji";
        //     System.out.println(str);
        //     String message = "Hello\nWorld!";
        //     System.out.println(message);


        // }
    }
}
