import java.util.Scanner;

public class Q2 {
    public static String findVal(String a1, String b1, String c1, String x1) {
        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);
        int x = Integer.parseInt(x1);
        return String.valueOf(a * x + b * x + c);
    }

    public static int Sticks(int ch) {
        switch (ch) {
            case 0:
                return 6;
            case 1:
                return 2;
            case 2:
            case 3:
                return 5;
            case 4:
            case 5:
            case 6:
                return ch;
            case 7:
                return 3;
            case 8:
                return 7;
            case 9:
                return 6;
        }
        return 0;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            sc.nextLine();
            while (n > 0) {
                int total = 0;
                String line = sc.nextLine();
                String num[] = line.split(" ");
                String val = findVal(num[0], num[1], num[2], num[3]);
                while (val.length() != 0) {
                    total += Sticks(Integer.parseInt(String.valueOf(val.charAt(0))));
                    val = val.substring(1);
                }
                n--;
                System.out.println(total);
            }
        }
    }
}