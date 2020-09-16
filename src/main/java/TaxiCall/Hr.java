package TaxiCall;

import javax.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.List;

@Entity
@Table(name="Hr_table")
public class Hr {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long driverId;
    private String driverStatus;
    @PostPersist
    public void onPostPersist(){
        System.out.println("##### driverId #####"+this.getDriverId());
        System.out.println("##### status #####"+this.getDriverStatus());
    }

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




}
