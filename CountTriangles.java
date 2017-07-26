import java.util.Scanner;

/**
 * Created by vaidehi on 26/7/17.
 */
public class CountTriangles {
    public static void main(String[] args) {
        CountTriangles ct = new CountTriangles();
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        char arr[][] = new char[row][col];
        String s[] = new String[row];
        for (int i = 0; i < row; i++) {
           s[i] = sc.next();;
        }
        int k = 0;
        //input in matrix
        while(k != row) {
            for (int i = 0; i < col; i++) {
                arr[k][i] = s[k].charAt(i);
            }
            k++;
        }
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                if(arr[j][i] == 'b') {

                }
            }
        }

        int result = ct.calculate(row, col, arr);
        System.out.println(result);
    }

    int calculate(int row, int col, char arr[][]) {
        int sum = 0;

        int count[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int right = 0, left = 0, bottom = 0, up = 0;
                if(arr[i][j] == 'b') {
                    //right
                    for (int k = j+1; k <col ; k++)
                        if(arr[i][k] == 'b')
                            right += 1;

                    //left
                    for (int k = j-1; k >= 0; k--) {
                        if(arr[i][k] == 'b')
                            left += 1;
                    }
                    //bottom
                    for (int k =i+1; k <row; k++) {
                        if(arr[k][i] == 'b')
                            bottom += 1;
                    }

                    //up
                    for (int k = i-1; k >= 0; k--) {
                        if(arr[k][i] == 'b')
                            up += 1;
                    }
                    count[i][j] = (bottom*left) + (bottom*right) + (up*left) + (up*right);
                    sum += count[i][j];
                }
                else
                    count[i][j] = 0;
            }
        }
        return sum;
    }
}
