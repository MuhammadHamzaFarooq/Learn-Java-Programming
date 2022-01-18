import javax.swing.plaf.synth.SynthColorChooserUI;

class Pattern {
    public static void main(String[] args) {

        // Q1 : Solid Ractangle
        /*
          *****
          *****
          *****
          *****
        */
        // for (int i = 0; i < 4; i++) {
        //     for (int j = 0; j < 4; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println("*");
        // }

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
    //    for(int i = 1 ; i<=n ; i++){
    //       //inner loop 
    //       for(int j = 1; j<=m ; j++){
    //           if(i==1 || j == 1 || i == n || j == m){
    //             System.out.print("*");
    //           }
    //           else{
    //               System.out.print(" ");
    //           }
    //         }
    //         System.out.println();
    //    }

       //Q3 : Half Payramid 

       /*
         *
         * *
         * * *
         * * * *
       */
    //   int row = 4 ;
    //   for(int i = 1 ; i <=row ; i++){
    //       //inner loop 
    //       for(int j = 1 ; j <=i ; j++){
    //         System.out.print("*");
    //       }
    //          System.out.println();
    //   }
    
    // Q4 :
    /*
       * * * *
       * * *
       * * 
       * 
    */
      for(int i = 4 ; i >=1 ; i--){
          //inner loop 
          for(int j = 1 ; j <=i ; j++){
            System.out.print("*");
          }
          System.out.println();
      }

    }
}