package timetable.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "daydetails")
public class DayDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long courseID;

	@NotNull
	private String androidID;

	@NotNull
	private String courseName;

	public DayDetails() {};
	
	public DayDetails(String androidID, String courseName) {
		this.androidID = androidID;
		this.courseName = courseName;
	}
	
	public String getAndroidID() {
		return androidID;
	}

	public void setAndroidID(String androidID) {
		this.androidID = androidID;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public long getCourseID() {
		return courseID;
	}

	public void setCourseID(long courseID) {
		this.courseID = courseID;
	}
}
