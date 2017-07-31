/**
 * Created by vaidehi on 31/7/17.
 */
public class SpiralPattern {

    public void print(int R, int C, int[][] a) {
        int k = 0;  //starting index of row
        int m = R-1;  //ending index of row
        int l = 0;  //starting index of column
        int n = C-1;  //ending index of column

        while (k <= m && l <= n) {
                //print first row
            for (int i = l; i <= n ; i++)
                System.out.print(a[k][i] + " ");
            k++;

            //print last column
            for (int i = k; i <= m ; i++)
                System.out.print(a[i][n] + " ");
            n--;

            if(k < m) {
                //print last row
                for (int i = n; i >=l ; i--)
                    System.out.print(a[m][i] + " ");
                m--;
            }

            if (l < n) {
                //print 1st column
                for(int i = m; i >= k; i--)
                    System.out.print(a[i][l] + " ");
                l++;
            }

        }

    }

    public static void main(String[] args) {
        SpiralPattern sp = new SpiralPattern();
        int R = 4;
        int C = 5;
        int a[][] = { {1,  2,  3,  4,  5},
                {6, 7,  8,  9,  10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };
        System.out.println("Spiral print matrix :");
        sp.print(R,C,a);
    }
}
