public class Car {

        String brand;
        String model;
        int year;


        public boolean isOldCar(){
                if (year<2010){
                        return true;
                }
                else {
                        return false;
                }
        }
}
