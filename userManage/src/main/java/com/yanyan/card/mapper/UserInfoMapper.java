package com.yanyan.card.mapper;
import com.yanyan.card.bean.UserInfo;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

public interface UserInfoMapper {

//	public UserInfo getUserInfoById(@Param(value = "id") Long id)throws Exception;
//
//	public List<UserInfo>	getUserInfoListByMap(Map<String, Object> param)throws Exception;
//
//	public Integer getUserInfoCountByMap(Map<String, Object> param)throws Exception;

	public Integer saveUserInfo(UserInfo userInfo);

	public Integer quryUserByName(String suerName);

	public UserInfo login(UserInfo userInfo);



}
