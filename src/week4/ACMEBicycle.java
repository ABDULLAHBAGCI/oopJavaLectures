package week4;

public class ACMEBicycle implements IBicycle{

    int cadence = 0;
    int speed = 0;
    int gear = 1;

    public void changeCadence(int newValue) {
        cadence = newValue;
    }


    public void changeGear(int newValue) {
        gear=newValue;
    }


    public void speedUp(int increment) {
        speed=increment;
    }


    public void applyBrakes(int decrement) {
        speed=speed-decrement;
    }

    void printStates() {
        System.out.println("cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear);
    }

}
