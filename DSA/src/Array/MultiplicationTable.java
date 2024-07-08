package Array;

public class MultiplicationTable {

    public static void main(String[] args){
        MultiplicationOutput(5);
        MultiplicationOutput(19);
        MultiplicationOutput(33);
    }

    public static void MultiplicationOutput(int value){

        for(int i = 1; i <= 10; i++){
            System.out.println(value + " x " + i + " = " + value*i);
        }

        System.out.println();
    }
}
