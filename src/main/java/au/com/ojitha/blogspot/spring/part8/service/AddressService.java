package au.com.ojitha.blogspot.spring.part8.service;

import java.util.List;

import au.com.ojitha.blogspot.spring.part8.domain.State;



public interface AddressService {
	/**
	 * All the states from the {@link State}.
	 * @return array of States.
	 */
	public List<State> getAllStates();

}
