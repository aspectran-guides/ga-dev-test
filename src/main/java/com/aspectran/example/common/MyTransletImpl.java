package com.aspectran.example.common;

import javax.servlet.http.HttpServletRequest;

import com.aspectran.core.activity.CoreActivity;
import com.aspectran.core.activity.CoreTranslet;

/**
 * <code>Translet</code>을 확장한다.
 */
public class MyTransletImpl extends CoreTranslet implements MyTranslet {

    /**
     * Instantiates a new my translet implementation.
     *
     * @param coreActivity the core activity
     */
    public MyTransletImpl(CoreActivity coreActivity) {
        super(coreActivity);
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
