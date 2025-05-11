# 🎉 Event Management System

## Project Description
The **Event Management System** is a Spring Boot-based REST application designed to manage and update event data. It supports operations such as creating, retrieving, updating, and deleting events. Additionally, it integrates with **Apache Kafka** for real-time message publishing and listening.

This system can be extended to notify users or external systems whenever an event is created or updated, using Kafka for asynchronous communication.

---

## Key Features

### User Features:
- Create a new event with details like name, location, and date
- Retrieve all available events
- View details of a specific event by ID
- Update the location of an existing event
- Delete an event by ID

### Kafka Integration:
- Send custom notifications/messages to a Kafka topic (`notification`)
- Listen and log messages received from the Kafka topic

---

## System Validation:
- Ensures that update operations are only performed if the event exists.
- Provides graceful fallback when events are not found.
- Uses Kafka to simulate a notification/real-time messaging system.

---

## Technologies Used

This project is built using the following technologies:

- **Java 17**: For programming logic and functionality
- **Spring Boot**: RESTful API framework
- **Spring Data JPA**: For interacting with the database
- **Apache Kafka**: For asynchronous messaging
- **KafkaTemplate & KafkaListener**: To produce and consume Kafka messages
- **H2 / PostgreSQL**: For storing event data
- **Lombok (optional)**: To reduce boilerplate code in model classes

---

## Features

### Event Module:
- **Create Event**  
  Save a new event record to the database.

- **Get All Events**  
  Fetch a list of all existing events.

- **Get Event by ID**  
  Retrieve a single event using its ID.

- **Update Event Location**  
  Update the location of an event if it exists.

- **Delete Event**  
  Remove an event from the system using its ID.

### Kafka Messaging:
- **sendMessage(String message)**  
  Sends a string message to the Kafka topic `notification`.

- **@KafkaListener**  
  Listens to messages on the `notification` topic and logs them in the console.

---

## To-Do List

Future improvements and additional features for the system include:

- Add event scheduling and reminders
- Send real-time notifications via email or SMS
- Include event categories, organizers, and attendees
- Build a frontend dashboard using React or Angular
- Add authentication and role-based access (e.g., admin, viewer)

---

## Getting Started

### Prerequisites:

Before running the project, ensure you have the following installed on your machine:

- **Java 17 or higher**: Required to compile and run the application.
- **Apache Kafka and Zookeeper**: Required for message sending/listening.
- **PostgreSQL or H2**: For storing event data.
- **Maven**: For building the application.
- **IntelliJ IDEA**: Recommended for editing and running the Spring Boot project.

---

### Installation:

**Clone the Repository**  
Run the following commands in your terminal:

```bash
git clone https://github.com/yourusername/event-management-system.git
cd event-management-system
