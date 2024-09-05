import java.util.Scanner;
public class TwoDArrayTraversing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row size:");

        int row=sc.nextInt();
        System.out.println("Enter the column size:");
        int col=sc.nextInt();
        
        int [][]arr=new int[row][col];
        System.out.println("Please enter the array:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
            
        }
        System.out.println("Traversing array is ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
            
        }


    }

}
