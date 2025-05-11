package com.event.eventManagement.controller;

import com.event.eventManagement.model.Event;
import com.event.eventManagement.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Stack;

@RestController
@RequestMapping("/event")
public class EventController {
    @Autowired
    EventService eventService;
    @PostMapping("/createEvent")
    public String createEvent(@RequestBody Event event){

        return eventService.createEvent(event);
    }
    @GetMapping("/message")
    public String sendMessage(String message) {
       return eventService.sendMessage(message);
    }

    @GetMapping("/getAllEvent")
    public List<Event> getEvent(){
        return eventService.getEvent();
    }
    @GetMapping("/getEventByID/{id}")
    public Optional<Event> getEventById(@PathVariable int id){
        return eventService.getEventById(id);
    }
    @PutMapping("/updateEvent/{id}")
      public String updateEvent(@PathVariable int id, @RequestParam String location) {
          return eventService.updateEvent(id,location);
    }
    @DeleteMapping("/deleteEvent/{id}")
    public String delete(@PathVariable int id ){
         return eventService.delete(id);
    }

    public static void main(String [] args){
        Stack<String> stack = new Stack<>();
        stack.push("urja");
        stack.push("vijay");
        stack.push("hatt");
        stack.pop();
        System.out.println(stack);


    }
}
