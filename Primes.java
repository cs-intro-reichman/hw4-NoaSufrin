public class Primes {
    public static void main(String[] args) {
        // Replace this statement with your code
        int n = Integer.parseInt(args[0]); 
        boolean[] arr = new boolean[n + 1];
        int p = 3;

        for (int i = 0; i < n + 1; i++) {
            if (i > 1) {
                arr[i] = true;
            } else {
                arr [i] = false;
            }
            if (i % 2 == 0 && i != 2) {
                arr[i] = false;
            }
        }

        while (p < Math.sqrt(n) && arr[p] == true) {
            for (int i = p * p; i < n + 1; i += p) {
                arr[i] = false;
            }
            p += 2;
        }
       
        System.out.println("Prime numbers up to " + n + ":");
        int stepsConter = 0;

        for (int i = 0; i < n +1; i++) {
            if (arr[i] == true) {
                System.out.println(i);
                stepsConter++;
            }
        }
        int primePersentage = (stepsConter * 100) / n;
        System.out.println("There are " + stepsConter + " primes between 2 and " +
                             n + " (" + primePersentage + "% are primes)");
    }
}