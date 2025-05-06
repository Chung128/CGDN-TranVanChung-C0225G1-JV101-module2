package case_study_furama.model;

public class Contract {
    private String contractNumber;
    private int idBooking;
    private double deposit;
    private double paymentAmount;

    public Contract(String contractNumber, int idBooking, double deposit, double paymentAmount) {
        this.contractNumber = contractNumber;
        this.idBooking = idBooking;
        this.deposit = deposit;
        this.paymentAmount = paymentAmount;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public String toString() {
        return "Contract{" +
                " contractNumber= " + contractNumber +
                " idBooking= " + idBooking +
                " deposit= " + deposit +
                " paymentAmount= " + paymentAmount +
                '}';
    }
}
