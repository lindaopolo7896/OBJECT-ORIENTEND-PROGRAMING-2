package ARRAY_CHALLENGE;

import java.util.Random;

public class OrderIDGenerator {

    public static void main(String[]args){
        Random random=new Random();

        String[] orderIDS=new String[6];

        for (int i=0;i<orderIDS.length;i++){
            char prefix=(char)('A'+random.nextInt(6));

            int number=random.nextInt(999)+1;
            String suffix=String.format("%03d",number);
            orderIDS[i]=prefix+suffix;

        }
        for(String orderID:orderIDS){
            System.out.println(orderID);
        }
    }
}
