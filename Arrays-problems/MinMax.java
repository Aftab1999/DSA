package minmax;

// public class MinMax {
//     public static void main(String[] args) {
//         int a[] ={10,324,45,90,9808};
//         int min =a[0];
//         int max =a[0]; 
//         for(int i= 0; i<a.length; i++){
//             if (a[i]> max)
//             max = a[i];
//             if(a[i]<min)
//             min = a[i];
            
//         }
//         System.out.println("Max Value" + max);
//         System.out.println("Min Value" + min);
//     }
    
// }



public class MinMax {
        public static void main(String[] args) {
            int a[] ={22,55,66,333,567,334,66,34,7};
            int min = a[0];
            int max = a[0];

            for (int i = 0; i<a.length; i++){
                if(a[i]> max)
               max = a[i];
              

                if(a[i] < min)
                 min = a[i];
              
            }

            System.out.print("Min value is" + min);
            System.out.print("Max value is" + max);
        }
}