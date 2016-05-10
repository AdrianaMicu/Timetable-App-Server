package timetable.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import timetable.model.UserData;

@Repository
public class UserDataDAOImpl implements UserDataDAO {

	@Autowired
	private SessionFactory _sessionFactory;

	private Session getSession() {
		return _sessionFactory.getCurrentSession();
	}

	@Override
	public void saveUserData(UserData userData) {
		getSession().save(userData);
		return;		
	}
}
