package AssigmentWeek1;

public class RandomWord {
    public static void main(String[] args){

        shuffle(args);
        // Generate random integers in range 0 to 999
        System.out.println(args[0]);

    }
    public static void shuffle(Object[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            // choose index uniformly in [0, i]
            int r = (int) (Math.random() * (i + 1));
            Object swap = a[r];
            a[r] = a[i];
            a[i] = swap;
        }
    }
}
