

class Patterns5 {
    
    public static void printPattern(int totRow, int totCol) {
      
        for (int i = 1; i <= totRow; i++) {
         
            for (int j = 1; j <= totCol; j++) {
                if (i == 1 || i == totRow || j == 1 || j == totCol) {
                 
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        printPattern(6, 5); 
    }
}




// class Patterns5 {
    
//     public static void printPattern(int totRow, int totCol) {
 
        
//         for(int i = 1; i <= totRow; 1++){
       
            
//             for ( j=1; j<= totCol;j++){
//                 if(i==1 || i==totrow || j==1 || J==totCol){
                
                    
//                     System.out.print("*");
//                 } else{
//                     System.out.print("");
//                 }
//                 }
                
//                 System.out.println();
//             }
//         }
  

    
//     public static void main(String[] args) {
//         printPattern(6,5);
//     }

//   }
