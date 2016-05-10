package timetable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import timetable.service.UserDataService;

@RestController
@RequestMapping(value = "/userdata")
public class UserDataController {

	@Autowired
	UserDataService userDataService;
	
	@RequestMapping(value = "/save")
	@ResponseBody
	public String saveUserData(String androidID, String type) {
		return userDataService.saveUserData(androidID, type);
	}
}
