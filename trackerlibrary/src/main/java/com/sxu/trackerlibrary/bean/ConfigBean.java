package com.sxu.trackerlibrary.bean;

import com.sxu.trackerlibrary.TrackerConfiguration;
import com.sxu.trackerlibrary.http.BaseProtocolBean;

import java.util.List;

/*******************************************************************************
 * Description: 从服务器获取配置信息
 *
 * Author: Freeman
 *
 * Date: 2018/12/5
 *
 * Copyright: all rights reserved by Freeman.
 *******************************************************************************/
public class ConfigBean extends BaseProtocolBean<ConfigBean.DataBean> {

	public static class DataBean {
		public TrackerConfiguration baseConfig;
		public List<EventBean> validEventList;
	}
}
