import java.util.*;


public class spiral_matrix {
    //a program to see a spiral matrix

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows and columns");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        System.out.println("enter the elements");

        for(int i=0;i<n;i++)
        {
            for (int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        int col_end=m-1;
        int row_end=n-1;
        int row_start=0;
        int col_start=0;

        while(row_start<=row_end && col_start<=col_end) {

            for (int j = col_start; j <= col_end; j++) {
                System.out.print(arr[row_start][j]+" ");
            }
            row_start++;


            for (int i = row_start; i <= row_end; i++) {
                System.out.print(arr[i][col_end]+" ");
            }
            col_end--;


            for (int j = col_end; j >= col_start; j--) {
                System.out.print(arr[row_end][j]+" ");
            }
            row_end--;


            for (int i = row_end; i >= row_start; i--) {
                System.out.print(arr[i][col_start]+" ");
            }
            col_start++;

            System.out.println();
        }


        }
    }

