package Array;

public class MultiplicationTable {

    public static void main(String[] args){
        MultiplicationTable(5);
        MultiplicationTable(19);
        MultiplicationTable(33);
    }

    public static void MultiplicationTable(int value){

        for(int i = 1; i <= 10; i++){
            System.out.println(value + " x " + i + " = " + value*i);
        }

        System.out.println();
    }
}
