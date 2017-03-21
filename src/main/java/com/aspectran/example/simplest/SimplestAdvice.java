package com.aspectran.example.simplest;

import com.aspectran.core.activity.Translet;
import com.aspectran.core.util.logging.Log;
import com.aspectran.core.util.logging.LogFactory;

import javax.servlet.http.HttpServletRequest;

public class SimplestAdvice {

    private final Log log = LogFactory.getLog(SimplestAdvice.class);

    public String welcome(Translet translet) {
        HttpServletRequest req = translet.getRequestAdaptee();
        String ip = req.getRemoteAddr();
        String msg = "Welcome to Aspectran! (" + ip + ")";

        log.info(msg);

        return msg;
    }

    public String goodbye() {
        String msg = "Goodbye!";

        log.info(msg);

        return msg;
    }

}
