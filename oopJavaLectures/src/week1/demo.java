package week1;

public class demo {
    public static void main(String[] args) {
        bicycle bike1=new bicycle();
        bicycle bike2=new bicycle();

        bike1.changeCadence(50);
        bike1.changeGear(3);
        bike1.printStates();

        bike2.changeCadence(75);
        bike2.changeGear(4);
        bike2.speedUp(45);
        bike2.applyBrakes(20);
        bike2.printStates();


    }
}
