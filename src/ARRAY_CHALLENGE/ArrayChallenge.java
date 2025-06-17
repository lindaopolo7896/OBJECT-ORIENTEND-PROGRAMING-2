package ARRAY_CHALLENGE;

public class ArrayChallenge {
    public static void main(String[]args){
        String[] orderIds={"B123","C234","A345","C15","B177","D123","B324"};

        for (String order : orderIds){
            if(order.startsWith("B")){
                System.out.println(order);
            }
        }


    }
}
