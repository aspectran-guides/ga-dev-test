package com.aspectran.example.common;

import com.aspectran.core.component.bean.scan.BeanClassScanFilter;

public class UserClassScanFilter implements BeanClassScanFilter {

    public String filter(String beanId, String resourceName, Class<?> retrievedClass) {
        return beanId;
    }

}
