package com.chuanyun.myjni;

/**
 * Created by hanfeng-pc on 2016/10/9.
 */

public class NdkJniUtils {

        static {
                System.loadLibrary("ChuanYunJniLibName");   //defaultConfig.ndk.moduleName
        }
        public native String getCLanguageString();
}
