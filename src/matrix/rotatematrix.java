package matrix;
import javafx.beans.binding.Bindings;

import java.util.*;

class rotatematrix_anticlockwise{

    public static void main(String args[]) {


        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        for(int i = 0; i<a.length; i++)
        {
            for(int j=0;j<a.length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i = 0; i<a.length; i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        rotatematrix_anticlockwise ob=new rotatematrix_anticlockwise();
        ob.rotate(a);

        for(int i = 0; i<a.length; i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }



    void rotate(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= i; j++) {


                    int temp=a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=temp;


            }
        }

        for (int i = 0; i < (a.length / 2); i++) {
            for (int j = 0; j < a.length; j++) {
                int temp=a[i][j];
                a[i][j]=a[a.length-1-i][j];
                a[a.length-1-i][j]=temp;

            }
        }


    }







}
