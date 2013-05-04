package au.com.ojitha.blogspot.spring.part8.dao;

import java.util.List;

public interface Dao<T, PK> {
	List<T> findAll();
	T findByPk(PK pk);
}
