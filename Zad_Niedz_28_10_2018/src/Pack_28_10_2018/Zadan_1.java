package Pack_28_10_2018;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Zadan_1 {
    public static void main(String[] args) {

        List<Float> rendomFlot=new LinkedList<>();
        Random random=new Random();

        while(Math.random()> 0.01){
            Float value=random.nextFloat()*100.0f;
            rendomFlot.add(value);
        }
        rendomFlot.forEach(value ->
                System.out.println("Result: " + Math.PI * value));

    }
}
