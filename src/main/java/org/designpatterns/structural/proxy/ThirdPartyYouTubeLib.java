package org.designpatterns.structural.proxy;

import java.util.Map;

public interface ThirdPartyYouTubeLib {

    public Map<Integer, String> listVideos();

    public Map<Integer, String> getVideoInfo(int id);

    public void downloadVideo(int id);
}
