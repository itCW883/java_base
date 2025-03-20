package com.ruirui;

public class A_Demo01 {
    public static String PinJie(String tag,String...aar){

        //此处不能写null
           String result="";
            for (int i = 0; i < aar.length; i++) {
                if(i!=aar.length-1){
                    result=result+aar[i]+tag;
                }
                else result+=aar[i];

            }
            return result;

    }
}
