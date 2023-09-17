package it.cn.utill;

import java.lang.reflect.Field;
import java.util.Map;

public class LinkedHashMapClass {

    public static <T> T mapToObject(Map<String, Object> map, Class<T> clazz) throws Exception {
        T obj = clazz.newInstance();

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            Field field = clazz.getDeclaredField(key);
            field.setAccessible(true);
            field.set(obj, value);
        }

        return obj;
    }


}
