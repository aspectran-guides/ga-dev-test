package com.aspectran.example.sample;

import com.aspectran.core.activity.Translet;
import com.aspectran.core.component.bean.ablility.DisposableBean;
import com.aspectran.core.component.bean.ablility.InitializableBean;
import com.aspectran.core.util.apon.Parameters;
import com.aspectran.core.util.apon.VariableParameters;

public class SampleBean implements InitializableBean, DisposableBean {

    @Override
    public void initialize() {
        System.out.println("initialize sample bean");
    }

    @Override
    public void destroy() {
        System.out.println("destroy sample bean");
    }

    public String hello(Translet translet) {
        return "Hello~";
    }

    @Override
    public String toString() {
        return "Hello! I'm a SampleBean.";
    }

    public Parameters getParameters() {
        Parameters p = new VariableParameters();
        p.putValue("p1", "동해물과");
        p.putValue("p2", "백두산이");
        p.putValue("p3", "마르고 닳도록");
        return p;
    }

}
