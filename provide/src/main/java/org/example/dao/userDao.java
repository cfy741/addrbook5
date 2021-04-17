package org.example.dao;

import org.example.pojo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface userDao {
	List<User> findListByQuery(User query) throws Exception;

	int save(User entity) throws Exception;

	int update(User entity) throws Exception;

	int delete(Long id) throws Exception;
}
