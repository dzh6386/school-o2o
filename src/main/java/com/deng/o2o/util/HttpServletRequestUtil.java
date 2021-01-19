package com.deng.o2o.util;

import javax.servlet.http.HttpServletRequest;

public class HttpServletRequestUtil {
    public static int getInt(HttpServletRequest request,String k){
        try{
            return Integer.decode(request.getParameter(k));
        }catch (Exception e){
            return -1;

        }

    }
    public static long getLong(HttpServletRequest request,String k){
        try{
            return Long.valueOf(request.getParameter(k));
        }catch (Exception e){
            return -1;

        }

    }
    public static Double getDouble(HttpServletRequest request,String k){
        try{
            return Double.valueOf(request.getParameter(k));
        }catch (Exception e){
            return -1d;

        }

    }
    public static boolean getBoolean(HttpServletRequest request,String k){
        try{
            return Boolean.valueOf(request.getParameter(k));
        }catch (Exception e){
            return false;

        }

    }
    public static String getString(HttpServletRequest request,String k){
        try{
            String result = request.getParameter(k);
            if (result != null){
                result = result.trim();//将字符串两边的空格去掉

            }
            if(result.equals("")){
                result = null;

            }
            return result;
        }catch (Exception e){
            return null;
        }

    }

}
