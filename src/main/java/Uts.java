public class Uts {

    public Uts(int[] n) {}

    public int[] changeArray(int[] n, int m) {

        int len = n.length;
        int middle = len >> 1;
        int left = 0;
        int right = len - 1;
        int point = Math.min(m, middle);

        if (m > len || m < 1) return new int[0];

        for (int i = 0; i < point; i++) {
            swap(n, point - i - 1, len - point + i);
        }

        converse(n, len - m, len - 1);
        converse(n, m, right - m);
        converse(n, left, right - m);

        return n;
    }

    static void swap(int[] n, int a, int b) {
        n[a] = n[a] + n[b];
        n[b] = n[a] - n[b];
        n[a] = n[a] - n[b];
    }

    static void converse(int[] n, int a, int b) {
        while (a < b) swap(n, a++, b--);
    }

}
