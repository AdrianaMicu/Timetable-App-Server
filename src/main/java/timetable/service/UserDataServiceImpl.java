package timetable.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import timetable.dao.UserDataDAO;
import timetable.model.UserData;

@Service
@Transactional
public class UserDataServiceImpl implements UserDataService {

	@Autowired
	private UserDataDAO _userDataDao;

	@Override
	public String saveUserData(String androidID, String type) {
		try {
			UserData userdata = new UserData(androidID, type);
			_userDataDao.saveUserData(userdata);
		} catch (Exception ex) {
			return ex.getMessage();
		}
		return "Userdata succesfully saved!";		
	}

}
