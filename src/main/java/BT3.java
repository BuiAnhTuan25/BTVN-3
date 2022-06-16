public class BT3 {
    public static void main(String[] args) {
        System.out.println("Tong cac so nguyen to tu 1 den 10000 (for) la: " + For(10000));
        System.out.println("Tong cac so nguyen to tu 1 den 10000 (do while) la: " + DoWhile(10000));
        System.out.println("Tong cac so nguyen to tu 1 den 10000 (while) la: " + While(10000));
    }

    public static int For(int n) {
        int sum = 0;
        for (int i = 1; i < n + 1; i++) {
            if (isPrimeNumber(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static int DoWhile(int n) {
        int sum = 0;
        int i = 1;
        do {
            if (isPrimeNumber(i)) {
                sum += i;
            }
            i++;
        } while (i < n + 1);
        return sum;
    }

    public static int While(int n) {
        int sum = 0;
        int i = 1;
        while (i < n + 1) {
            if (isPrimeNumber(i)) {
                sum += i;
            }
            i++;
        }

        return sum;
    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
