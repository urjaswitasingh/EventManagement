package com.event.eventManagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Scope;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Scope("prototype")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id;
    @Column
    String title;
    @Column
    LocalDateTime dateTime;
    @Column
    String description;
    @Column
    String location;
}
