public class Compare {
    public static void main(String[] args) {
        LazyPrimeFactorization l = new LazyPrimeFactorization(10000);
        OptimizedPrimeFactorization o = new OptimizedPrimeFactorization(10000);

        Thread t1 = new Thread(l);
        Thread t2 = new Thread(o);

        t1.start();
        t2.start();
    }
}
