package TaxiCall;

public class Retired extends AbstractEvent {

    private Long driverId;
    private String driverStatus;
    private String driverNm;

    public Long getDriverId() {
        return driverId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }
    public String getDriverStatus() {
        return driverStatus;
    }

    public void setDriverStatus(String driverStatus) {
        this.driverStatus = driverStatus;
    }
    public String getDriverNm() {
        return driverNm;
    }

    public void setDriverNm(String driverNm) {
        this.driverNm = driverNm;
    }
}