package com.event.eventManagement.repository;

import com.event.eventManagement.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  Eventrepo extends JpaRepository<Event, Integer> {

}
