package timetable.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import timetable.model.DayDetails;

@Repository
public class DayDetailsDAOImpl implements DayDetailsDAO {

	@Autowired
	private SessionFactory _sessionFactory;

	private Session getSession() {
		return _sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<DayDetails> getAllByDayAndID(int day, String androidID) {
		return getSession()
				.createQuery(
						"from DayDetails where androidID = :androidID and day = :day")
				.setParameter("androidID", androidID).setParameter("day", day)
				.list();
	}

	@Override
	public void saveDayDetails(DayDetails dayDetails) {
		getSession().save(dayDetails);
		return;
	}
}
