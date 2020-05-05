public class LazyPrimeFactorization implements Runnable {
    private int size;

    public LazyPrimeFactorization(int size) {
        this.size = size;
    }

    static void checkPrime(int n){
        int i,m=0,flag=0;
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(i=2;i<n;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(n+" is prime number"); }
        }
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < this.size; i++) {
            checkPrime(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Lazy algorithm finish in " + (endTime - startTime) * 1000 + "ns");
    }
}
