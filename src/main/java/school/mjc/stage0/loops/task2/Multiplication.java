package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int counter=0;
        int multiply=1;
        while (counter<=multiplyByAndToInclusive){
            multiply=multiply*counter;
        }
    }
}
