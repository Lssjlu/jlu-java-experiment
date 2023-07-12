package ExtendedExperiment;

public abstract class Vehicle {
    private String brand;
    private String carid;
    private String rent;

    public Vehicle() {
    }

    public Vehicle(String brand, String carid, String rent) {
        this.brand = brand;
        this.carid = carid;
        this.rent = rent;
    }

    /**
     * 获取
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取
     * @return carid
     */
    public String getCarid() {
        return carid;
    }

    /**
     * 设置
     * @param carid
     */
    public void setCarid(String carid) {
        this.carid = carid;
    }

    /**
     * 获取
     * @return rent
     */
    public String getRent() {
        return rent;
    }

    /**
     * 设置
     * @param rent
     */
    public void setRent(String rent) {
        this.rent = rent;
    }

    public String toString() {
        return "Car{brand = " + brand + ", carid = " + carid + ", rent = " + rent + "}";
    }

    public abstract double callrent(int days);
}
