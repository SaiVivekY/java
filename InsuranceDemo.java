class VehicleI{

    String vehicleNumber;
    String ownerName;

    VehicleI(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    void displayVehicle() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Owner Name     : " + ownerName);
    }
}

class CarInsurance extends VehicleI {

    String policyNumber;

    CarInsurance(String vehicleNumber, String ownerName, String policyNumber) {

        super(vehicleNumber, ownerName); // Calls parent constructor
        this.policyNumber = policyNumber;
    }

    void displayInsurance() {

        super.displayVehicle(); // Calls parent method
        System.out.println("Policy Number  : " + policyNumber);
    }
}

public class InsuranceDemo {

    public static void main(String[] args) {

        CarInsurance c = new CarInsurance(
                "MH12AB1234",
                "Sai Vivek",
                "INS1001");

        c.displayInsurance();
    }
}