public class Taxi extends Transportation {
    int fare = 3000;
    int perKm = 1000;
    int km = 1;
    int earned = 0;
    int kmTodestination;
    String status = "일반";
    String destination ;


    public Taxi(int plateNum) {
        super(plateNum, 4);
    }
    public void ride(int n){
        if (maxPassenger < currentPassenger+n) System.out.println("최대 승객수 초과");
        else currentPassenger += n; status ="운행 중";
    }

    public void getPlateNum(){
            System.out.println("택시 번호: " + plateNum);
    }
    public void pay(){
        earned += (fare+(perKm*kmTodestination));
        status ="일반";
        currentPassenger = 0;

    }
    public void getEarned(){
        System.out.println("누적 요금: " + earned);
    }

    public void getFuelInfo(){
        System.out.println("주유량: "+ fuel);
        if(fuel < 10){status = "운행 불가";
        }
    }
    public void getStatustaxi(){
        System.out.println("상태 : " + status);
    }

    public void speakToTaxi(String destination, int kmTodestination){
        this.destination = destination;
        this.kmTodestination = kmTodestination;
    }

    public void getInfoTaxi(){
        System.out.println("탑승 승객: " + currentPassenger);
        System.out.println("잔여 승객: " + (maxPassenger-currentPassenger));
        System.out.println("기본 요금확인: "+ fare);
        System.out.println("목적지: "+ destination);
        System.out.println("목적지까지 거리: " + kmTodestination+"km");
        System.out.println("지불할 요금확인: "+ (fare+(perKm*kmTodestination)));
    }

}
