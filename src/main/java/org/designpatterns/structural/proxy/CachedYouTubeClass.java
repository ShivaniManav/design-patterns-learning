package org.designpatterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class CachedYouTubeClass implements ThirdPartyYouTubeLib {

    private ThirdPartyYouTubeLib thirdPartyYouTubeClass;

    private Map<Integer, String> listCache = new HashMap<>();

    private Map<Integer, String> videoCache = new HashMap<>();

    public CachedYouTubeClass(ThirdPartyYouTubeLib thirdPartyYouTubeClass) {
        this.thirdPartyYouTubeClass = thirdPartyYouTubeClass;
    }

    @Override
    public Map<Integer, String> listVideos() {
        if(listCache.isEmpty()) {
            System.out.println("list cache is empty...fetching list data from service class");
            listCache = thirdPartyYouTubeClass.listVideos();
        } else {
            System.out.println("list cache has the data...fetching list data from cache");
        }
        return listCache;
    }

    @Override
    public Map<Integer, String> getVideoInfo(int id) {
        if(videoCache.isEmpty()) {
            System.out.println("video cache is empty...fetching video data from service class");
            videoCache = thirdPartyYouTubeClass.getVideoInfo(id);
        } else {
            System.out.println("video cache has the data...fetching video data from cache");
        }
        return videoCache;
    }

    @Override
    public void downloadVideo(int id) {
        thirdPartyYouTubeClass.downloadVideo(id);
    }
}
