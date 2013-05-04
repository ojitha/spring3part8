package au.com.ojitha.blogspot.spring.part8.client;

import java.util.List;

import org.springframework.context.support.GenericXmlApplicationContext;

import au.com.ojitha.blogspot.spring.part8.dao.AddressDao;
import au.com.ojitha.blogspot.spring.part8.dao.StateDao;
import au.com.ojitha.blogspot.spring.part8.domain.Address;
import au.com.ojitha.blogspot.spring.part8.domain.State;
import au.com.ojitha.blogspot.spring.part8.service.AddressService;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:META-INF/spring/app-context.xml");
		ctx.refresh();
		
//		StateDao<State, String> dao = ctx.getBean("stateDao", StateDao.class);
//		List<State> states = dao.findAll();
//		for (State state : states) {
//			System.out.println("Code: "+state.getCode()+" state: "+state.getState()+" version: "+state.getVersion());
//		}

//		AddressDao<Address, Integer> addressDao = ctx.getBean("addressDao",AddressDao.class);
//		List<Address> addresses = addressDao.findAll();
//		for (Address address : addresses) {
//			System.out.println("Street "+address.getStreet()+" State "+address.getState().getState());
//		}
		
		AddressService service = ctx.getBean("addressService", AddressService.class);
		List<State> states = service.getAllStates();
		for (State state : states) {
			System.out.println(state.getState());
		}
	}

}
