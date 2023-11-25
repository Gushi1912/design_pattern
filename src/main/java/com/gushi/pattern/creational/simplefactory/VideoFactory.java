package com.gushi.pattern.creational.simplefactory;

import java.lang.reflect.InvocationTargetException;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/11/2 17:16
 */
public class VideoFactory {
//    public static Video getVideo(String type) {
//        if ("java".equals(type)) {
//            return new JavaVideo();
//        } else if ("python".equals(type)) {
//            return new PythonVideo();
//        } else return null;
//    }

    public static Video getVideo(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        return video;
    }
}
