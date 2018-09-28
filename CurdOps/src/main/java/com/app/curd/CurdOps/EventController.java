package com.app.curd.CurdOps;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/event")
public class EventController {
	
	@Autowired
	private EventServiceImpl eventService;
	
	@GetMapping("/allEvents")
	public Iterable<Event> getAllEventDetails() {
		return eventService.findAll();
	}
	
	@GetMapping("/{eventId}")
	public Optional<Event> getEventDetails(@PathVariable("eventId") Integer eventId) {
		return eventService.find(eventId);
	}
	
	@PostMapping("/addEvent")
	public String addEventDetails(@RequestBody Event event) {
		eventService.save(event);
		return "Event Added Successfully";
	}
	
	@GetMapping("/delete/{eventId}")
	public String deleteEventDetails(@PathVariable("eventId") Integer eventId) {
		eventService.delete(eventId);
		return "Delete even "+eventId;
	}

}
