class Pattern {
    public static void main(String[] args) {

        // Q1 : Solid Ractangle
        /*
          *****
          *****
          *****
          *****
        */
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }

        // Q2 : Hollow Rectangle 
        /*
         *****
         *   *
         *   *
         *****
         */

        // row
        int n = 4; 
        // Column
        int m = 5;

        // outer Loop 
        for(int i =1 ; i<=n ; i++){
            for(int j = 1 ; j<=m; j++){
                if(i == 1 || j == 1 || i == n || j == m){
                 System.out.print('*');
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}