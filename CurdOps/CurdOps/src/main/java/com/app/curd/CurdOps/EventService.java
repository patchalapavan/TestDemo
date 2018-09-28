package com.app.curd.CurdOps;

import java.util.Optional;

public interface EventService {
	
	public Iterable<Event> findAll();
	
	public Optional<Event> find(Integer id);
	
	public void save(Event event);
	
	public String delete(Integer event);

}
