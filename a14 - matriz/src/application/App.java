package application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // [][] - matriz BIdimensional
        int[][] mat = new int[n][n];

        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat.length; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("main diagonal: ");
        for(int i=0; i<mat.length; i++)
        {
            System.out.print(mat[i][i]);
        }
        System.out.println();


        int count = 0;
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat.length; j++)
            {
                if(mat[i][j] < 0)
                {
                    count++;
                }
            }
        }
        System.out.println("main diagonal: " + count);

        sc.close();

    }
}
