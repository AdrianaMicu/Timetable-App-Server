package timetable.dao;

import java.util.List;

import timetable.model.DayDetails;

public interface DayDetailsDAO {

	public List<DayDetails> getAllByDayAndID(int day, String androidID);

	public void saveDayDetails(DayDetails dayDetails);
}
