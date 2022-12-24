package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public static void main(String[] args) {
        printPrimeNumbers(33);
    }
    public static void printPrimeNumbers(int printToInclusive) {
        int first=0;
        int second=1;
        while (second<=printToInclusive){
            first=first+second;
            second=first+second;
            System.out.println(first);
            System.out.println(second);
        }
    }
}
