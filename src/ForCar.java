public class ForCar {
    public static void main(String[] args)
    {
        Car chevrolet = new Car("Chevrole", "Corvet", "red", 3000, "E186HC 196");
        Car nissan = new Car("Nissan", "Silvia", "brown", 5000, "A785MK 196");

        Car.printCount();

        chevrolet.getInfo();
        nissan.getInfo();

        chevrolet.run(550);
        chevrolet.getInfo();
    }
}
