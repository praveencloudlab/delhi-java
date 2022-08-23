class RoadKiller implements Runnable{

    int availableSeats=2;
    int wantedSeats;

    public RoadKiller(int wantedSeats) {
        this.wantedSeats = wantedSeats;
    }

    @Override
    public void run() {
    bookTicket();
    }

    public  void bookTicket(){
        String name=Thread.currentThread().getName();
        System.out.println("Trying to book "+wantedSeats+" seats foro "+name);
        synchronized (this) {
            if (wantedSeats <= availableSeats) {
               // System.out.println("Booking " + wantedSeats + " seats for " + name);
                availableSeats = availableSeats - wantedSeats;
                System.out.println(wantedSeats + " booked for " + name);
                System.out.println("Available Seats: " + availableSeats);

            } else {
                System.out.println("No Seats available for "+name);
            }
        }


    }
}

public class Operator {

    public static void main(String[] args) {

        RoadKiller busOperator=new RoadKiller(1);

        Thread p1=new Thread(busOperator);
        Thread p2=new Thread(busOperator);

        p1.setName("Passenger-1");
        p2.setName("Passenger-2");

       // p1.setDaemon(true);
        p1.start();
        p2.start();


    }
}
