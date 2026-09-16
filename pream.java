import java.util.*;
public class pream{
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. of rows:");
        int rows=sc.nextInt();
        System.out.print("enter the bo. of columns");
        int columns=sc.nextInt();
        int[][] matrix=new int [rows][columns];
        System.out.print("Enter the elements of arrau:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.printf("Elements [%d][%d]:",i, j);
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("\n Your 2D array/Matrix:");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.println(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
     }
    }

