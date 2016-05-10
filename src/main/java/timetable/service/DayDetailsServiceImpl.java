package timetable.service;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import timetable.dao.DayDetailsDAO;
import timetable.model.DayDetails;

@Service
@Transactional
public class DayDetailsServiceImpl implements DayDetailsService {

	@Autowired
	private DayDetailsDAO _dayDetailsDao;
	
	@Override
	public HashMap<String, String> getAllByDayAndID(int day, String androidID) {
		
		List<DayDetails> dayDetailsList = null;
		try {
			dayDetailsList = _dayDetailsDao.getAllByDayAndID(day, androidID);
		} catch (Exception ex) {
		}

		HashMap<String, String> coursesNamesAndHours = new HashMap<String, String>();
		for (DayDetails d : dayDetailsList) {

			String hour = new SimpleDateFormat("HH:mm").format("23:23");//d.getHour());

			coursesNamesAndHours.put(d.getCourseName(), hour);
		}

		return coursesNamesAndHours;
	}

	@Override
	public void saveDayDetails(DayDetails dayDetails) {
		_dayDetailsDao.saveDayDetails(dayDetails);
	}

	
}
