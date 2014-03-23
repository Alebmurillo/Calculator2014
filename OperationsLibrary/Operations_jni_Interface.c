#include <jni.h>
#include "..\CalculatorJavaC\bin\Operations_jni_MainWindow.h"
#include <stdio.h>
#include <string.h>

//multiply the argument
int mult(int arg, int arg2)
{
    return(arg2*arg);
}
//divide
int div(int arg, int arg2)
{
    return(arg/arg2);
}
//add
int sum(int arg, int arg2)
{
    return(arg2+arg);
}
//rest
int resta(int arg, int arg2)
{
    return(arg-arg2);
}
//module
int mod(int arg, int arg2)
{
    return(arg%arg2);
}


JNIEXPORT jint JNICALL Java_Operations_jni_MainWindow_suma(JNIEnv *env, jobject obj, jint arg, jint arg2)
{
	printf("Add!\n");
	jint j_retCode = sum(arg,arg2);
    return(j_retCode);
}
JNIEXPORT jint JNICALL Java_Operations_jni_MainWindow_rest(JNIEnv *env, jobject obj, jint arg, jint arg2)
{
	printf("Rest!\n");
	jint j_retCode = resta(arg,arg2);
    return(j_retCode);
}
JNIEXPORT jint JNICALL Java_Operations_jni_MainWindow_div(JNIEnv *env, jobject obj, jint arg, jint arg2)
{
	printf("Div!\n");
	jint j_retCode = div(arg,arg2);
    return(j_retCode);
}

JNIEXPORT jint JNICALL Java_Operations_jni_MainWindow_mul(JNIEnv *env, jobject obj, jint arg, jint arg2)
{
	printf("Mult!\n");
	jint j_retCode = mult(arg,arg2);
    return(j_retCode);
}
JNIEXPORT jint JNICALL Java_Operations_jni_MainWindow_mod(JNIEnv *env, jobject obj, jint arg, jint arg2)
{
	printf("Module!\n");
	jint j_retCode = mod(arg,arg2);
    return(j_retCode);
}
JNIEXPORT void JNICALL Java_Operations_jni_MainWindow_sayHello(JNIEnv *env, jobject obj)
{
	printf("Hello world!\n");
	return;
}
