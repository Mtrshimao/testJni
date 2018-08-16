//
// Created by Administrator on 2018/4/11.
//

#include "com_testjni_jni_JniUtils.h"

JNIEXPORT jstring JNICALL Java_com_testjni_jni_JniUtils_getMessage(JNIEnv *env, jobject obj)
{
    return env -> NewStringUTF("hello world");



}


JNIEXPORT jstring JNICALL Java_com_testjni_jni_JniUtils_getWorld(JNIEnv *env, jobject obj)
{
    return env -> NewStringUTF("welcome to china");
}