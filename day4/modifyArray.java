import java.util.Scanner;
public class modifyArray {

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
    public static  int[][] ModifyArray(int[][] arr,int row,int col,int newValue){
        if(row>=0&& row<arr.length && col>=0 && col<arr[0].length){
            arr[row][col]=newValue;
        }
        else{
            System.out.println("Invalid Index");
        }
        return arr;
       
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row");
        int row=sc.nextInt();
        System.out.println("Enter the col");
        int col=sc.nextInt();
        int [][]arr=initialize(row,col);
        printArray(arr);
        //modify the array....
       
        System.out.println("enter the modified row ");
        int modrow=sc.nextInt();
        System.out.println("enter the modified col ");
        int modcol=sc.nextInt();
        System.out.println("enter the modified value ");
        int modVal=sc.nextInt();
        int [][]mArray=ModifyArray(arr,modrow,modcol,modVal);
        printArray(mArray);



    }

}


