package org.designpatterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class ThirdPartyYouTubeClass implements ThirdPartyYouTubeLib {

    @Override
    public Map<Integer, String> listVideos() {
        Map<Integer, String> videos = new HashMap<>();
        videos.put(1,"video1");
        videos.put(2,"video2");
        videos.put(3,"video3");
        videos.put(4,"video4");
        videos.put(5,"video5");
        return videos;
    }

    @Override
    public Map<Integer, String> getVideoInfo(int id) {
        Map<Integer, String> videoInfos = new HashMap<>();
        videoInfos.put(1,"videoinfo1");
        return videoInfos;
    }

    @Override
    public void downloadVideo(int id) {
        System.out.println("ThirdPartyYouTubeClass :: Downloading video id="+id+" !!");
    }
}
