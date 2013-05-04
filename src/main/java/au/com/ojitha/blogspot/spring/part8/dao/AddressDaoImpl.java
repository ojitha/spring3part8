package au.com.ojitha.blogspot.spring.part8.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import au.com.ojitha.blogspot.spring.part8.domain.Address;

@Repository("addressDao")
@Transactional
public class AddressDaoImpl implements AddressDao<Address, Integer> {

	@Resource(name="sessionFactory")
	SessionFactory sessionFactory;
	
	@Transactional(readOnly=true)
	public List<Address> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from Address a").list();
		//return sessionFactory.getCurrentSession().getNamedQuery("Address.findAll").list();
	}

	public Address findByPk(Integer pk) {
		// TODO Auto-generated method stub
		return null;
	}

}
