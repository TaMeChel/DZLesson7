package p1;

public abstract class Phone {
    private String number;
    private String model;
    private int weight;


    public abstract void info();

    public void receiveCall(String name){
        System.out.printf("Звонит: %s\n", name);
    }

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

}
