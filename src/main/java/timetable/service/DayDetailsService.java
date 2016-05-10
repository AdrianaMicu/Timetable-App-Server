package timetable.service;

import java.util.HashMap;

import timetable.model.DayDetails;

public interface DayDetailsService {

	public HashMap<String, String> getAllByDayAndID(int day, String androidID);

	public void saveDayDetails(DayDetails dayDetails);
}
