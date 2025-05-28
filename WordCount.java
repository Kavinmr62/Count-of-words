import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = new char[15];
        System.out.print("Enter str:");
        String input = sc.nextLine();
        int len = Math.min(input.length(), 15);
        for (int j = 0; j < len; j++) {
            str[j] = input.charAt(j);
        }

        int c = 0;
        for (int i = 0; i < len - 1; i++) {
            if (str[i] == ' ' && str[i + 1] != ' ') {
                c++;
            }
        }
        System.out.println(c + 1);
        sc.close();
    }
}
