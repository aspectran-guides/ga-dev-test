package com.aspectran.example.common;

import com.aspectran.core.context.bean.scan.BeanClassScanFilter;

public class UserClassScanFilter implements BeanClassScanFilter {

    public String filter(String beanId, String resourceName, Class<?> scannedClass) {
        return beanId;
    }

}
