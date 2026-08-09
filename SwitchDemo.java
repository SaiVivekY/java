interface Switchable {
    void turnOn();
}

class Light implements Switchable {

    public void turnOn() {
        System.out.println("Light is ON.");
    }
}

class Fan implements Switchable {

    public void turnOn() {
        System.out.println("Fan is ON.");
    }
}

public class SwitchDemo {
    public static void main(String[] args) {

        Switchable s1 = new Light();
        Switchable s2 = new Fan();

        s1.turnOn();
        s2.turnOn();
    }
}