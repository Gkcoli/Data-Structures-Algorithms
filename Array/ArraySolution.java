public class ArraySolution {
    public static void main(String[] args) throws Exception {
    //    int[] a1= new int[6];
    //     int count =1;

    //    for(int i=0;i<a1.length;i++){
    //     a1[i]=count;
    //     count++;

    //    }
    //    for (int j=0;j<a1.length;j++){
    //     System.out.println(a1[j]+" ");
    //    }

    //creation and implementation of 2D array 

    int[][] a1= new int[3][4];
    int count=1;

    for(int i=0;i<a1.length;i++){
         for(int j=0;j<a1[i].length;j++){
            a1[i][j]=count;
            count++;

         }
        
      }
      for(int i=0;i<a1.length;i++){
        for(int j=0;j<a1.length;j++){
            System.out.println(a1[i][j]+" ");
        }
        System.out.println();
      }

    }
}
