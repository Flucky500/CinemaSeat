package pl.pasko;

public class CinemaSeat {

    private int cinemaSeatNumber;
    private int cinemaRowNumber;
    private boolean seatAvailable;

    public CinemaSeat(int cinemaSeatNumber, int cinemaRowNumber, boolean seatAvailable) {
        this.cinemaSeatNumber = cinemaSeatNumber;
        this.cinemaRowNumber = cinemaRowNumber;
        this.seatAvailable = seatAvailable;
    }

    public boolean cinemaSeatChecker (int cinemaSeatNumber, int cinemaRowNumber, boolean seatAvailable) {
        if ((cinemaSeatNumber <= 0 || cinemaSeatNumber > 30) || (cinemaRowNumber <=0 || cinemaRowNumber > 20)) {
            System.out.println("Invalid seat number");
            return false;

        } else if (!seatAvailable){
            System.out.println("Seat " + cinemaSeatNumber + " in row " + cinemaRowNumber + " has already been booked");
            return false;

        } else {
            System.out.println("Seat " + cinemaSeatNumber + " in row " + cinemaRowNumber + " is available for purchase");
            return true;
        }

    }

    public int getCinemaSeatNumber() {
        return cinemaSeatNumber;
    }

    public void setCinemaSeatNumber(int cinemaSeatNumber) {
        this.cinemaSeatNumber = cinemaSeatNumber;
    }

    public int getCinemaRowNumber() {
        return cinemaRowNumber;
    }

    public void setCinemaRowChar(int cinemaRowNumber) {
        this.cinemaRowNumber = cinemaRowNumber;
    }

    public boolean isAvailable() {
        return seatAvailable;
    }

    public void setAvailable(boolean available) {
        seatAvailable = available;
    }
}
