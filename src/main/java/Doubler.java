import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.ArrayList;
import java.util.List;

public class Doubler{

    public static int doubleResult(int b, final int[] numbers) {
        if(numbers != null){
            Arrays.sort(numbers);

            for(int count = 0; count <numbers.length; count++){
                if(numbers[count] == b)
                    b = b * 2;
            }
        }
        return b;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int b = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrayStr = bufferedReader.readLine().trim().split(",");

        int[] arrayInt = null;

        if(!arrayStr[0].equals("null")){
            arrayInt = new int[arrayStr.length];

            for(int i = 0; i < arrayStr.length; ++i) {
                arrayInt[i] = Integer.parseInt(arrayStr[i]);
            }
        }

        Integer result = Doubler.doubleResult(b, arrayInt);

        System.out.println((result.toString() + "\n"));

        bufferedReader.close();
    }
}
