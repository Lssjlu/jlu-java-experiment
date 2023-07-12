package ExtendedExperiment;

public class Car extends Vehicle {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Car() {
        super();
    }

    public Car(String brand, String carid, String rent, String type) {
        super(brand, carid, rent);
        this.type = type;
    }

    @Override
    public double callrent(int days) {
        double price = 0;
        if (days > 7 && days <=30) {
            price= Double.parseDouble(this.getRent()) * 0.9 * days;
        } else if (days > 30 && days <= 150) {
            price= Double.parseDouble(this.getRent()) * 0.8 * days;
        } else if (days > 150) {
            price = Double.parseDouble(this.getRent()) * 0.7 * days;
        }
        return price;
    }
}
