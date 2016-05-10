package timetable.controller;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import timetable.dao.DayDetailsDAO;
import timetable.model.DayDetails;
import timetable.service.DayDetailsService;

@RestController
@RequestMapping(value = "/daydetails")
public class DayDetailsController {

	@Autowired
	private DayDetailsService dayDetailsService;

	@RequestMapping(value = "/getCoursesAndHours")
	@ResponseBody
	public HashMap<String, String> getByDayAndID(int day, String androidID) {
		return dayDetailsService.getAllByDayAndID(day, androidID);
	}

	@RequestMapping(value = "/save")
	@ResponseBody
	public HashMap<String, String> create(String androidID, String courseName, int day,
			String courseHour) {
		
		dayDetailsService.saveDayDetails(androidID, courseName, day, hour);
		
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = null;
        try {
            date = dateFormat.parse(courseHour);
        } catch (Exception e) {

        }

        long time = date.getTime();
        Timestamp hour = new Timestamp(time);
		
		try {
			DayDetails dayDetails = new DayDetails(androidID, courseName, day);
			_dayDetailsDao.save(dayDetails);
		} catch (Exception ex) {
			return null;
		}
		
		return getByDayAndID(day, androidID);
	}
}
