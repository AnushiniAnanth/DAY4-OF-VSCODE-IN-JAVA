import java.util.Scanner;
public class MatrixMultiplication {
    
        public static int[][] initialize(int row,int col){
            Scanner sc=new Scanner(System.in);
            int arr[][]=new int[row][col];
            System.out.println("Enter the array");
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            return arr;
        }
        public static void printArray(int [][] array){
           
            for(int i=0;i<array.length;i++){
                for(int j=0;j<array[i].length;j++){
                    System.out.print(" "+array[i][j]);
                }
                System.out.println();
            }
        }
        public static void Multiplication(int [][]array1,int [][]array2){
           
            
            if(array1[0].length==array2.length){
                int[][] array3=new int[array2.length][array2[0].length];
            for(int i=0;i<array1.length;i++){
                for(int j=0;j<array2[i].length;j++){
                    array3[i][j]=0;
                    for(int k=0;k<array1[i].length;k++){
                        array3[i][j]+=array1[i][k]*array2[k][j];
                        

                    }
                    
                }
                
            }
             
        System.out.println("The Multiplication Matrix is:");
        printArray(array3);
        }
        else{
            System.out.println("Invalid Matrix");
        }
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the 1 st row size");
            int row=sc.nextInt();
            System.out.println("Enter the 1 st col size");
            int col=sc.nextInt();
            int [][]arr1=initialize(row,col);
            System.out.println("Enter the 2 nd row size");
            int row1=sc.nextInt();
            System.out.println("Enter the 2 nd col size");
            int col1=sc.nextInt();
            int [][]arr2=initialize(row1,col1);
            System.out.println("The traversing the  first array is ");
            printArray(arr1);
            System.out.println("The traversing the Second array is ");
            printArray(arr2);
            Multiplication(arr1,arr2);
    

}

}
