import java.util.Scanner;
public class WaveTraversing {
    public static int[][] initialize(int row,int col){
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[row][col];
        System.out.println("Enter the array:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        return arr;


    }
     public static void printArray(int[][] array){
        System.out.println("The Array is :");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                System.out.print(" "+array[i][j]);
            }
            System.out.println();
            
        }
        
    }
   
    
    public static void waveArray(int row,int col,int [][]arr){
        System.out.println("The waveTraversing of the array is:");
        
            for(int j=0;j<col;j++){
                if(j%2==0){
                    for(int i=0;i<row;i++) {
                    System.out.print(" "+arr[i][j]);
                    }
                    System.out.println();
                }
                else{
                    for(int i=row-1;i>=0;i--){
                        System.out.print(" "+arr[i][j]);
                    }
                    System.out.println();

                }
                
            }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row size:");
        int row=sc.nextInt();
        System.out.println("Enter the col size:");
        int col=sc.nextInt();
        int [][]arr=initialize(row,col);
        printArray(arr);
        waveArray(row,col,arr);


        
    }
        
    }


