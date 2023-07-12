package ExtendedExperiment;

public class Operation {
    Vehicle[] vehicles = new Vehicle[8];
    public void init(){
        vehicles[0] = new Car("宝马","京NY28588","800","X6");
        vehicles[1] = new Car("宝马","京CNY3284","600","500i");
        vehicles[2] = new Car("别克","京NT37465","300","林荫大道");
        vehicles[3] = new Car("别克","京ANT96968","600","GL8");
        vehicles[4] = new bus("金龙","京8696997","800",16);
        vehicles[5] = new bus("金龙","京8696998","1500",34);
        vehicles[6] = new bus("金杯","京6566754","800",16);
        vehicles[7] = new bus("金杯","京9696996","1500",34);
    }

    public Vehicle match(String brand,String type,String seatNum){
        Vehicle res = null;
        for(int i = 0;i < vehicles.length;i++){
            if(vehicles[i] instanceof Car){
                Car car = (Car) vehicles[i];
                if(vehicles[i].getBrand().equalsIgnoreCase(brand) && ((Car) vehicles[i]).getType().equalsIgnoreCase(type)){
                    res = car;
                    break;
                }
            }else if(vehicles[i] instanceof bus){
                bus bus0 = (bus) vehicles[i];
                if(vehicles[i].getBrand().equalsIgnoreCase(brand) && ((bus) vehicles[i]).getSeatNum() == Integer.parseInt(seatNum)){
                    res = bus0;
                    break;
                }
            }
        }
        return res;
    }
}
