package com.git.constant;

import java.util.Locale;
import java.util.ResourceBundle;

public class ConfigConstant {

    private static final ResourceBundle resource= ResourceBundle.getBundle("config", Locale.CHINA);

    public static void main(String[] args) {
        System.out.println(resource.getString("test"));
    }

}
