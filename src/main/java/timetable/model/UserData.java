package timetable.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "userdata")
public class UserData {
	@Id
	private String androidID;
	
	@NotNull
	private String type;

	public UserData() {
	}

	public UserData(String androidID, String type) {
		this.androidID = androidID;
		this.type = type;
	}

	public String getAndroidID() {
		return androidID;
	}

	public void setAndroidID(String androidID) {
		this.androidID = androidID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
