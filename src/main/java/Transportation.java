public class Transportation {
 int plateNum;
 int fuel;
 int maxPassenger;

 int currentPassenger;

    public Transportation(int plateNum, int maxPassenger) {
        this.plateNum = plateNum;
        this.fuel = 100;
        this.maxPassenger = maxPassenger;
    }

    public void getPlate(){
        System.out.println("차량 번호: "+plateNum);
    }
    public void getFuel( int updateFuel){
        if (fuel+updateFuel < 10){
            System.out.println("주유 필요");
            fuel += updateFuel;
        }
        else fuel += updateFuel;
//        System.out.println("주유량: "+ fuel+updateFuel);
    }
    public void getFuelInfo(){
        System.out.println("주유량: "+ fuel);
    }
    public void ride(int n){
        if (maxPassenger < currentPassenger+n) System.out.println("최대 승객수 초과");
        else currentPassenger += n;
    }
}
