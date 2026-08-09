class Vehicle {
    class Details {
        void display() {
            System.out.println("Vehicle: Car");
            System.out.println("Model: Toyota");
            System.out.println("Color: Black");
        }
    }

    interface Action {
        void perform();
    }

    public static void main(String[] args) {

        Vehicle v = new Vehicle();


        Vehicle.Details d = v.new Details();

        System.out.println("Vehicle Details:");
        d.display();
        Action a = new Action() {
            public void perform() {
                System.out.println("Vehicle is starting...");
            }
        };

        a.perform();
    }
}