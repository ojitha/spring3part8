package au.com.ojitha.blogspot.spring.part8.dao;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import au.com.ojitha.blogspot.spring.part8.domain.State;

@ContextConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class StateDaoPersistenceTest {

	@Autowired
	private StateDao<State, String> stateDao;
	
	@Test
	public void testFindAll() {
		assertTrue(stateDao.findAll().size() > 0);
		
	}

}
