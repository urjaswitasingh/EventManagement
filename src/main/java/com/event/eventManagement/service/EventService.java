package com.event.eventManagement.service;

import com.event.eventManagement.model.Event;
import com.event.eventManagement.repository.Eventrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {
  @Autowired
   private  Eventrepo eventrepo;//field injection

//     @Autowired
//     public  EventService(Eventrepo eventrepo){
//         this.eventrepo = eventrepo;
//     }
//if our dependency class is final then we have to use constructor injection
    //if we want my dependency must be present in dependennt class at the time of intilaization


    public String createEvent( Event event){
        eventrepo.save(event);
        return " Event create successfully";
    }


    public List<Event> getEvent(){
        return eventrepo.findAll();
    }

    public Optional<Event> getEventById(int id){
        return eventrepo.findById(id);
    }
    private static final String TOPIC = "notification";
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    public String sendMessage(String message) {
        StringBuilder str1 = new StringBuilder();
        str1.append("urja");
      //  String str = String.valueOf(kafkaTemplate.send(TOPIC,message));
        str1.append("hates vijay");
        return str1.toString();
    }

    public String updateEvent( int id,String location) {

        Optional<Event> eventOptional = eventrepo.findById(id);
        if (eventOptional.isPresent()) {
            Event event = eventOptional.get(); // Extract the Event object
            event.setLocation(location);       // Call the setter method
            eventrepo.save(event);
            return "Event updated successfully";
        } else {
            return "Event not found";
        }
    }
    @KafkaListener(topics = "notification", groupId = "my-group")
    public String listen(String message) {
        System.out.println("Received Message: " + message);
        return message;
    }

    public String delete( int id ){
       eventrepo.deleteById(id);
       return "event deleted";
    }
}
