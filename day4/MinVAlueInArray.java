import java.util.Scanner;
public class MinVAlueInArray {
    

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
        System.out.println("The traversing the array is ");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(" "+array[i][j]);
            }
            System.out.println();
        }
    }
    public static int minElementInArray(int[][]arr){
        int min=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
            
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row");
        int row=sc.nextInt();
        System.out.println("Enter the col");
        int col=sc.nextInt();
        int [][]arr=initialize(row,col);
        printArray(arr);
        int max=minElementInArray(arr);
        System.out.println("The minimum element in the array is "+max);


    }

}


