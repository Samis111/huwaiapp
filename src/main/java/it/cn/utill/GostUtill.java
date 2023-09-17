package it.cn.utill;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Objects;

public class GostUtill {

    public static <T> T jsonToList(String json, Class<T> clazz) {
        if (Objects.isNull(json)) return null;
        try {
            Gson gson = new  GsonBuilder().serializeNulls().create();;
            // 需要注意这里的type
            Type listType = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, ArrayList.class, clazz);

            return gson.fromJson(json, listType);
        } catch (Exception e) {
            System.out.println("json:"+json);
            e.printStackTrace();
        }
        return null;
    }



    public static <T> T jsonToObject(String json,Class<T> listType) {
        if (Objects.isNull(json)) return null;
        try {
            Gson gson = new  GsonBuilder().serializeNulls().create();;
            // 需要注意这里的type
//            Type listType = com.google.gson.internal.$Gson$Types.newParameterizedTypeWithOwner(null, null, listClass);

            return gson.fromJson(json, listType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
