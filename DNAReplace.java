
import java.util.Scanner;

/**
 * Created by vaidehi on 26/7/17.
 */
public class DNAReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char strArray[] = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if(strArray[i] == 'A')
                strArray[i] = 'T';
            else if (strArray[i] == 'T')
                strArray[i] = 'A';
            else if (strArray[i] == 'C')
                strArray[i] = 'G';
            else
                strArray[i] = 'C';

            System.out.print(strArray[i]);

        }
    }
}
