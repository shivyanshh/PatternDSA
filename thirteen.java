public class thirteen {
    public static void main (String[] args){
        // String str = "";
        // int previous = 0;
        // int count =0 ;
        // for(int i = 1; i<16;i++){
            
        // }
        int count =1;
        String str ="";
        for(int i =0;i<5;i++){
            
            for(int j = 0;j<i+1;j++){
                str += count;
                str+=" ";
                count ++;
            }
            str+="\n";
        }
        System.out.println(str);
    }
}
