public class twentytwo {
    public static void main(String[] args){
        int n = 7; //size of the pattern

        //outer loop for rows
        for(int i =0 ; i< n;i++){


            //inner loop for columns
            for(int j =0;j<n;j++){

                //number to be printed depends on the minimum distance from any edge
                //the minimum distance to any of the 4 edge is:
                //from top =i
                //from bottom = n-1- i
                //from left =j
                // from right = n-1-j 
                //so take the minimum of all distances and subtract it from max value(4)

                int min = Math.min(Math.min(i, j), Math.min(n - 1 - i, n - 1 - j));
                System.out.print((4-min)+" ");
            }
            //move to the next line after each row
            System.out.println();
        }
    }
}
