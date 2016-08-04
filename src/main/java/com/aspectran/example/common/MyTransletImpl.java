package com.aspectran.example.common;

import com.aspectran.core.activity.Activity;
import com.aspectran.core.activity.CoreTranslet;

import javax.servlet.http.HttpServletRequest;

/**
 * <code>Translet</code>을 확장한다.
 */
public class MyTransletImpl extends CoreTranslet implements MyTranslet {

	/**
	 * Instantiates a new my translet implementation.
	 *
	 * @param activity the activity
	 */
	public MyTransletImpl(Activity activity) {
		super(activity);
	}
	
	/**
	 * Gets the request.
	 *
	 * @return the request
	 */
	public HttpServletRequest getRequest() {
		return super.getRequestAdaptee();
	}
	
	/**
	 * Gets the response.
	 *
	 * @return the response
	 */
	public HttpServletRequest getResponse() {
		return super.getResponseAdaptee();
	}

}
