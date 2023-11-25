package com.gushi.pattern.creational.simplefactory;

/**
 * @Author Gushiyang
 * @Version 1.0.0
 * @Time 2023/11/2 17:14
 */
public class Test {
    public static void main(String[] args) {
//        Video javaVideo = new JavaVideo();
//        Video pythonVideo = new PythonVideo();
//        javaVideo.produce();
//        pythonVideo.produce();
//        Video java = VideoFactory.getVideo("java");
        Video video = VideoFactory.getVideo(JavaVideo.class);
        video.produce();
    }
}
