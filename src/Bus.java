public class Bus extends Transport<DriverD> {
    private BodyType bodyType;



    public Bus(String brand, String model, String engineVolume, String driver, BodyType bodyType) {
        super(brand, model, engineVolume, driver);
        this.pitStop();
        this.circleTime();
        this.maxSpeed();
        this.getType();
        this.setBodyType(bodyType);

    }
    @Override
    public void startMove() {
        System.out.println("Автобус марки" + getBrand() + "начал движение");

    }

    @Override
    public void finishMove() {
        System.out.println("Автобус марки" + getBrand() + "закончил движение");


    }

    @Override
    public Type getType() {
        return Type.BUS;
    }

    @Override
    public void pitStop() {
        System.out.println("PIT-STOP у Автобуса");

    }

    @Override
    public void circleTime() {
        int minFound = 90;
        int maxFound = 150;
        int theBestTimeInMins = (int)(minFound + (maxFound - minFound) * Math.random());
        System.out.println("Лучшее время круга в минутах для автобуса"+theBestTimeInMins);


    }

    @Override
    public void maxSpeed() {
        System.out.println();
        int minFound = 60;
        int maxFound = 130;
        int maxSpeed = (int)(minFound + (maxFound - minFound) * Math.random());
        System.out.println("Максимальная скорость автобуса"+maxSpeed);

    }

    @Override
    public boolean passDiagnostic() throws TransportTypeException {
        throw new TransportTypeException("Автобусы диагностику проходить не должны");
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }
}
