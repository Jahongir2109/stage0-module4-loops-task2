package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int factorial=1;
        int counter=0;
        while(counter<=printToInclusive){
            System.out.println(factorial*=counter);
            counter++;
        }
    }
}
