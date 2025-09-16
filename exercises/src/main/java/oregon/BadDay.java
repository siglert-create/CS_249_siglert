package oregon;

import oregon.disaster.*;

public class BadDay {
    public static void checkDisaster(disaster d){
        int totalFood=100;
        switch(d){
            case CHOLERA, DYSENTERY ->System.out.println("Cough.");
            case LOST_FOOD->{
                totalFood-=10;
                System.out.println("Total food down to" + totalFood);
            }
            case WAGON_AXLE_BROKEN, WAGON_WHEEL_BROKEN ->
                System.out.println("Wagon Stopped");
            default -> System.out.println("ALL GOOD");
        }

    }
}
