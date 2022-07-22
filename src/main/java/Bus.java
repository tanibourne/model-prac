public class Bus extends Transportation{
    int fare =1000;
    String status = "운행중";
    public Bus(int plateNum) {
        super(plateNum, 30);
    }

    public void getInfo(){
        System.out.println("탑승 승객: " + currentPassenger);
        System.out.println("잔여 승객: " + (maxPassenger-currentPassenger));
        System.out.println("요금확인: "+ fare*currentPassenger);

    }

    public void updateStatus() {// 상태변경

        if (status == "운행중"|| fuel < 10 ){
            status = "차고지행";
            currentPassenger = 0;
        }
        else {
            status = "운행중";
        }
    }
    public void getStatus(){
        System.out.println("상태 : " + status);
    }
//
    }

