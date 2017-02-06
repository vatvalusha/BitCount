package valera.ua;

/**
 * Created by User on 06.02.2017.
 */




public class BitCoutn {
    static private long getBit(int position, long number){
       return (number >> position) & 1;
    }
   static public long bitCounter(int number) {
        int intLenght = 63;
        while (intLenght>0){
            if(getBit(intLenght,number) == 1){
                return intLenght + 1;
            }
            intLenght--;
        }
       return intLenght;
    }




}
