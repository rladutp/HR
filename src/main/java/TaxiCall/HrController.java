package TaxiCall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

 @RestController
 public class HrController {
  @Autowired
  HrRepository hrRepository;

  @RequestMapping(method=RequestMethod.POST, path="/hrs/inputData")
   public void inputDr(@RequestBody Hr data) {
     Hr hr = new Hr();
      System.out.println("data id : "+data.getDriverId());
      System.out.println("data status : "+data.getDriverStatus());
     hr.setDriverId(data.getDriverId());
     hr.setDriverStatus(data.getDriverStatus());
     hrRepository.save(hr);

   }

 }
