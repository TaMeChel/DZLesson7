package p1;

public class SamsungPhone extends Phone{
    public SamsungPhone(String number, String model, int weight) {
        super(number, model, weight);
    }

    public void info() {
        System.out.printf("Number: %s\t Model: %s Weight: %d\n", this.getNumber(), this.getModel(), this.getWeight());
    }
}


