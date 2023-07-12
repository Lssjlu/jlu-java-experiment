package ExtendedExperiment;

public class bus extends Vehicle {

    private int seatNum;

    public int getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(int seatNum) {
        this.seatNum = seatNum;
    }

    public bus() {
        super();
    }

    public bus(String brand, String carid, String rent, int seatNum) {
        super(brand, carid, rent);
        this.seatNum = seatNum;
    }

    @Override
    public double callrent(int days) {
        double price = 0;
        if (days >= 3 && days < 7) {
            price = Double.parseDouble(this.getRent()) * 0.9 * days;
        } else if (days >= 7 && days < 30) {
            price = Double.parseDouble(this.getRent()) * 0.8 * days;
        } else if (days >= 30 && days < 150) {
            price = Double.parseDouble(this.getRent()) * 0.7 * days;
        } else if (days >= 150) {
            price = Double.parseDouble(this.getRent()) * 0.6 * days;
        }
        return price;
    }
}