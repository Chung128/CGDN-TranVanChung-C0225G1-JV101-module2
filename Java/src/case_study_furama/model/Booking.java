package case_study_furama.model;

public class Booking {
    private int idBooking;
    private String dateBooking;
    private String checkInDate;
    private String checkOutDate;
    private int idCustomer;
    private String idService;

    public Booking(int idBooking, String dateBooking, String checkInDate, String checkOutDate, int idCustomer, String idService) {
        this.idBooking = idBooking;
        this.dateBooking = dateBooking;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.idCustomer = idCustomer;
        this.idService = idService;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getDateBooking() {
        return dateBooking;
    }

    public void setDateBooking(String dateBooking) {
        this.dateBooking = dateBooking;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "  idBooking= " + idBooking +
                "  dateBooking= " + dateBooking +
                "  checkInDate= " + checkInDate +
                "  checkOutDate= " + checkOutDate +
                "  idCustomer= " + idCustomer +
                "  idService= " + idService +
                '}';
    }
}
