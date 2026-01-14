public class Car {
    String vendor;
    String model;
    String color;
    int millage;
    String regNumber;

    private static int counter = 0;
    public static void printCount()
    {
        System.out.println("Вы произвели " + Car.counter + " автомобилей.");
    }

    public Car(String vendor, String model, String color)
    {
        new Car(vendor, model, color, 0);
    }

    public Car(String vendor, String model, String color, int millage)
    {
        new Car(vendor, model, color, millage, null);
    }

    public Car(String vendor, String model, String color, int millage, String regNumber)
    {
        this.vendor = vendor;
        this.model = model;
        this.color = color;
        this.millage = millage;
        this.regNumber = regNumber;

        Car.counter++;
    }

    public void run(int distance)
    {
        this.millage += distance;
        System.out.printf("%s %s Проехал %dкм.\n", this.color, this.model, distance);
    }

    public void getInfo()
    {
        System.out.println("----------ТехПаспорт----------");
        System.out.println(this.vendor + " " + this.model);
        System.out.println("Регномер " + this.regNumber);
        System.out.println("Цвет кузова: " + this.color);
        System.out.println("Пробег: " + this.millage);
        System.out.println("------------------------------");;
    }

    public String getVendor()
    {
        return this.vendor;
    }
    public String getModel()
    {
        return this.model;
    }
    public void setColor()
    {
        this.color = color;
    }
    public String getColor()
    {
        return this.color;
    }
}
