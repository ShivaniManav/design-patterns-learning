package org.designpatterns.structural.proxy;

public class ProxyPattern {

    public static void main(String[] args) {
        CachedYouTubeClass cachedYouTubeClass = new CachedYouTubeClass(new ThirdPartyYouTubeClass());
        cachedYouTubeClass.listVideos();
        cachedYouTubeClass.listVideos();
        cachedYouTubeClass.getVideoInfo(1);
        cachedYouTubeClass.getVideoInfo(1);
        cachedYouTubeClass.downloadVideo(1);
    }
}
