public class twenty {
    public static void main(String[] args){
        int check = 0;
        if(check<5){
            for(int i=0;i<5;i++){
                String upper ="";
                for(int j=0;j<i+1;j++){
                    upper += "*";
                }
                for(int k =0;k<(8-i*2);k++){
                    upper += " ";
                }
                for(int j=0;j<i+1;j++){
                    upper += "*";
                }
                System.out.println(upper);
                check ++;
            }
            
        }
        for(int i =0;i<4;i++){
            String lower ="";
            for(int j =0;j<(4-i);j++){
                lower += "*";
            }
            for(int k = 0;k<(2*(i+1));k++){
                lower += " ";
            }
            for(int j =0;j<(4-i);j++){
                lower += "*";
            }
            System.out.println(lower);
        }
    }
}
