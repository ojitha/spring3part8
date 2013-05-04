package au.com.ojitha.blogspot.spring.part8.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Hibernate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import au.com.ojitha.blogspot.spring.part8.dao.AddressDao;
import au.com.ojitha.blogspot.spring.part8.domain.Address;
import au.com.ojitha.blogspot.spring.part8.domain.State;

@Repository("addressService")
@Transactional
public class AddressServiceImpl implements AddressService {
	
	@Resource(name="addressDao")
	AddressDao<Address, Integer> addressDao;
	
	
	@Transactional(readOnly=true)
	public List<State> getAllStates(){
		List<Address> addresses = addressDao.findAll();
		List<State> states = new ArrayList<State>();
		for (Address address : addresses) {
			State state = address.getState();
			Hibernate.initialize(state);
			states.add(state);
		}
		Hibernate.initialize(states);
		return states;
	}
}
