public class Car extends Transport<DriverB> implements Competing {
    private BodyType bodyType;
    public Car(String brand, String model, double engineVolume, int driver, BodyType bodyType) {
        super(brand, model, engineVolume, driver);
        this.setBodyType(bodyType);
    }




    @Override
    public void startMove() {
        System.out.println("Автомобиль марки" + getBrand() + "начал движение");

    }
    @Override
    public void finishMove() {
        System.out.println("Автомобиль марки" + getBrand() + "закончил движение");

    }

    @Override
    public void pitStop() {
        System.out.println("PIT-STOP у Автомобиля");

    }

    @Override
    public void circleTime() {
        int minFound = 150;
        int maxFound = 230;
        int theBestTimeInMin = (int) (minFound + (maxFound - minFound) * Math.random());
        System.out.println("Лучшее время круга в минутах для автомобиля" + theBestTimeInMin);


    }

    @Override
    public void maxSpeed() {
        System.out.println();
        int minFound = 90;
        int maxFound = 270;
        int maxSpeed = (int) (minFound + (maxFound - minFound) * Math.random());
        System.out.println("Максимальная скорость автомобиля" + maxSpeed);
    }

    @Override
    public Type getType() {
        return Type.CAR;
    }

    @Override
    public boolean passDiagnostic() throws TransportTypeException {
        throw new TransportTypeException("Автомобили могут проходить диагностику");
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
}