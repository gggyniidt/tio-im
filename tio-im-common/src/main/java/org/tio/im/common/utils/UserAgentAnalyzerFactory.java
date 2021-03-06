package org.tio.im.common.utils;

import com.xiaoleilu.hutool.lang.Singleton;

import nl.basjes.parse.useragent.UserAgentAnalyzer;

/**
 * @author tanyaowu 
 * 2017年5月16日 下午4:13:34
 */
public abstract class UserAgentAnalyzerFactory {
	
	private static UserAgentAnalyzer userAgentAnalyzer = null;
	
	public static UserAgentAnalyzer getUserAgentAnalyzer(){
		
		userAgentAnalyzer = Singleton.get(UserAgentAnalyzer.class);
		return userAgentAnalyzer;
	}

	/**
	 * 
	 * @author: tanyaowu
	 */
	public UserAgentAnalyzerFactory() {
	}

	/**
	 * @param args
	 * @author: tanyaowu
	 */
	public static void main(String[] args) {

	}
}
