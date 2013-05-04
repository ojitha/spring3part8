package au.com.ojitha.blogspot.spring.part8.dao;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import au.com.ojitha.blogspot.spring.part8.domain.State;


@Repository("stateDao")
@Transactional
public class StateDaoImpl implements StateDao<State, String> {
	
	@Resource(name="sessionFactory")
	SessionFactory sessionFactory;

	@Transactional(readOnly=true)
	public List<State> findAll() {
		List<State> states = sessionFactory.getCurrentSession().createQuery("select s from State s").list();
		return states;
	}

	public State findByPk(String pk) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	

}
