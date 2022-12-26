package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter=1;
        boolean state;
        while (counter<=printToInclusive){
            state=false;
            int i=2;
            while (i<counter){
                if(counter%i==0){
                    state=true;
                    break;
                }
                i++;
            }
            if(!state && counter>1) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
