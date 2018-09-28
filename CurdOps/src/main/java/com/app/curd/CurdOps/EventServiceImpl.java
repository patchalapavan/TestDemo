package com.app.curd.CurdOps;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EventServiceImpl implements EventService{
	
	@Autowired
	private EventRepository eventRepository;
	
	@Override
	public Iterable<Event> findAll() {
		// TODO Auto-generated method stub
		return eventRepository.findAll();
	}

	@Override
	public Optional<Event> find(Integer id) {
		// TODO Auto-generated method stub
		return eventRepository.findById(id);
	}

	@Override
	public void save(Event event) {
		eventRepository.save(event);
		
	}

	@Override
	public String delete(Integer eventId) {
		String text = "";
		Optional<Event> event= eventRepository.findById(eventId);
		if(event.get() != null) {
			eventRepository.delete(event.get());
			text =  "Event Delete Successfully";
		} else {
			text =  "Event ID not found";
		}
		
		return text;
	}

}
