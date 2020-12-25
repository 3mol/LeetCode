public class Main {

    public static void main(String[] args) {
        buy1();
        buy2();
    }

    private static void buy2() {
        for (int x = 0; x <= 100; x++) {
            for (int y = 0; y <= 100; y++) {
                int z = 100 - x - y;
                if ((x + y + z) == 100 && (5 * x + 3 * y + (1 / 3.0) * z == 100)) {
                    System.out.format("%d %d %d\n", x, y, z);
                }
            }
        }
    }

    private static void buy1() {
        for (int x = 0; x <= 100; x++) {
            for (int y = 0; y <= 100; y++) {
                for (int z = 0; z <= 100; z++) {
                    if ((x + y + z) == 100 && (5 * x + 3 * y + (1 / 3.0) * z == 100)) {
                        System.out.format("%d %d %d\n", x, y, z);
                    }
                }
            }
        }
    }
}
