public class Loops {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println("This is line No." + i);
            ++i;
        }

        System.out.println();

        for (int n = 1; n <= 10; ++n) {
            System.out.println("This is line No." + n);
        }

        System.out.println();

        int a = 1;
        do {
            System.out.println("This is line No." + a);
            ++a;
        } while (a <= 10);

        System.out.println();

        do {
            System.out.println("This line demonstrates the feature of do-while.");
        } while (a == 1);
    }
}
