package timetable.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "coursedetails")
public class CourseDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotNull
	private long courseID;

	@NotNull
	private int day;
	
	@NotNull
	private Timestamp hour;

	private String professor;

	private String room;

	private String type;

	public CourseDetails() {
	}

	public CourseDetails(long courseID, int day, Timestamp hour, String professor,
			String room, String type) {

		this.courseID = courseID;
		this.day = day;
		this.hour = hour;
		this.professor = professor;
		this.room = room;
		this.type = type;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getCourseID() {
		return courseID;
	}

	public void setCourseID(long courseID) {
		this.courseID = courseID;
	}

	public Timestamp getHour() {
		return hour;
	}

	public void setHour(Timestamp hour) {
		this.hour = hour;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
}
