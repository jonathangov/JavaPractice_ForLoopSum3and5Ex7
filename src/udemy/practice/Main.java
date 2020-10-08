package udemy.practice;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for(int i=0; count < 6; i++) {
            if((i % 3 == 0) && (i % 5 == 0) && i!=0) {
                sum += i;
                count++;
                System.out.println("Current Number: " + i);
                System.out.println("Running Sum: " + sum);
            }
        }
    }

}
