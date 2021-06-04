package main;

public class swimmingPool {

    public int swimming(int day ,int age ,boolean isTeam,boolean isPT,int time){


        int price = 200;
        if((age>3 && age < 75) && (time>=5 && time <= 22)) {

            if(isPT == true) {
                //1
                price = (int) (price * 0.5);
                if(day == 6) {
                    price = (int) (250 * 0.5);
                    return price;
                }
                return price;

            }else {

                if(isTeam == true) {
                    price = (int)(price * 0.7);
                    return price;
                }else if(time <= 7) {
                    price = (int)(price * 0.8);
                    return price;
                }else if(age <= 12 || age >= 60){
                    price = (int)(price * 0.8);
                    return price;
                }else {
                }
            }
        }else {
            return -1;
        }

        return price;
    }
}
