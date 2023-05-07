package org.designpatterns.structural.facade;

public class FacadePattern {

    public static void main(String[] args) {
        VideoConverterFacade videoConverterFacade = new VideoConverterFacade();
        videoConverterFacade.convert("funny-cats-video.ogg", "mp4");
    }
}
