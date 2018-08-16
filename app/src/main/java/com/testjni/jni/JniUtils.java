package com.testjni.jni;

/**
 * desc
 * Author:shimao
 * Date:2018.04.11 11:06
 */
public class JniUtils {

    static
    {
        System.loadLibrary("JNISample");
    }

    public native String getWorld();

    public native String getMessage();
}
