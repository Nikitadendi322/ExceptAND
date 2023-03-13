public class TestCar {
    public static void TestCar(String[] args, Object e) throws NoLicenseException {

    }
    public static void testList()throws NoLicenseException{
        DriverB driverB=new DriverB(
                "Driver B",
                true,
                5
        );
        DriverC driverC=new DriverC(
                "Driver C",
                true,
                5
        );
        DriverD driverD=new DriverD(
                "Driver D",
                true,
                5
        );



    }

    private static class NoLicenseException extends Exception {
    }






}