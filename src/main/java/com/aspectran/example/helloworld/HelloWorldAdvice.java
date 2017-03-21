package com.aspectran.example.helloworld;

import javax.servlet.http.HttpServletRequest;

import com.aspectran.core.activity.Translet;
import com.aspectran.core.util.logging.Log;
import com.aspectran.core.util.logging.LogFactory;

public class HelloWorldAdvice {

    private final Log log = LogFactory.getLog(HelloWorldAdvice.class);

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

    public String errorOccured() {
        String msg = "Error occured!";

        log.info(msg);

        return msg;
    }

    public String terminator() {
        String msg = "I'll be back.";

        log.info(msg);

        return msg;
    }

    public void checkCountRange(Translet translet) {
        String from = translet.getAttribute("from");
        String to = translet.getAttribute("to");

        if(from == null || from.length() == 0 || Integer.parseInt(from) < 1)
            translet.setAttribute("from", "1");

        if(to == null || to.length() == 0)
            translet.setAttribute("to", "10");
        else if(Integer.parseInt(to) > 100)
            translet.setAttribute("to", "100");
    }

}
