package TaxiCall;

import TaxiCall.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class PolicyHandler{
    @StreamListener(KafkaProcessor.INPUT)
    public void onStringEventListener(@Payload String eventString){

    }
    @Autowired
    HrRepository hrRepository;
    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverRetired_DeleteDr(@Payload Retired retired){

        if(retired.isMe()){
            System.out.println("##### listener RequestCancelOrder : " + retired.toJson());

            hrRepository.findById(Long.valueOf(retired.getDriverId())).ifPresent((HR)->{
                HR.setDriverStatus("leave");
                hrRepository.save(HR);
            });

        }
    }

}
