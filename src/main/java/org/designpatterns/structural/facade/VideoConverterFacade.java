package org.designpatterns.structural.facade;

/**
 * Facade class,
 * Instead of making your code work with dozens of the framework classes directly,
 * you create a facade class which encapsulates that functionality and hides it from the rest of the code.
 * This structure also helps you to minimize the effort of upgrading to future versions of the framework
 * or replacing it with another one. The only thing you’d need to change in your app would be the
 * implementation of the facade’s methods.
 */
public class VideoConverterFacade {

    public void convert(String filename, String format) {
//        file = new VideoFile(filename)
//        sourceCodec = (new CodecFactory).extract(file)
//        if (format == "mp4")
//            destinationCodec = new MPEG4CompressionCodec()
//        else
//            destinationCodec = new OggCompressionCodec()
//        buffer = BitrateReader.read(filename, sourceCodec)
//        result = BitrateReader.convert(buffer, destinationCodec)
//        result = (new AudioMixer()).fix(result)
//        return new File(result)
    }
}
