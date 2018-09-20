import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
        int digits = 15;
        long count = 0l;
        long input = 0l;
        long maxNum = (long) Math.pow(10, digits);

        BufferedReader in = new BufferedReader(new FileReader("src/num.txt"));
        int i;
        while ((i = in.read()) != -1) {
            i = Character.getNumericValue(i);
            if (i == -1)
                continue;
            if (input < maxNum) {
                input *= 10l;
                input += (long) i;
            }
            if (input >= maxNum) {
                count += input;
                while (count >= maxNum * 10) {
                    count /= 10;
                }
                in.readLine();
            }
        }

        System.out.println(count);
    }
}
