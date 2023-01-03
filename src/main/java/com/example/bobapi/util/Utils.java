package com.example.bobapi.util;

public class Utils {
    public static String getLoremText(int l){
        String loremText = "ABCDEFGHIJKLMNQRSTUVWXYZabcdefghijnopqrstuvxyz0123456789";
        StringBuilder s = new StringBuilder(l);
        int i;
        for ( i=0; i<l; i++) {
            int ch = (int)(loremText.length() * Math.random());
            s.append(loremText.charAt(ch));
        }
        return s.toString();
    }
}
