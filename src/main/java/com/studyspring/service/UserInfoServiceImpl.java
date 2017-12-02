package com.studyspring.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studyspring.dao.UserInfoDao;
import com.studyspring.vo.UserInfoEnrollRequestVO;

@Service  //Service임을 ServiceImpl에 명시해주어야함 
public class UserInfoServiceImpl implements UserInfoService{
	@Autowired
	UserInfoDao userInfoDao;
	
	@Override
	public String searchNameService(Map<String, Object> info) {
		return userInfoDao.searchNameDao(info);
	}

	@Override
	public int enrollUserInfoService(UserInfoEnrollRequestVO userInfoEnrollRequestVO) {
		// TODO Auto-generated method stub
		return 0;
	}
}
