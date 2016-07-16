package net.chilicat.m3u8;

/**
 tvg-shift - TV guide time shifting
 tvg-name - TV guide progamm identifier
 tvg-logo -  channel's logo (url)
 audio-track - Audio track definition of this channel, if it's supported by stream. Write language codes in ISO 639-2 standard, you may use several codes separated by comma (e.g.: "eng, rus, deu"). The first item in the list will be defined as default.
 aspect-ratio - defines aspec ratio (not available for webOS TVs). Available values: 16:9, 3:2, 4:3, 1,85:1, 2,39:1

 example:
 #EXTM3U

 #EXTINF:0 tvg-name="BBC" audio-track="eng" tvg-logo="http://mylogos.domain/BBC.png", BBC World
 http://server.name/stream/to/video2
 #EXTINF:0 tvg-name="CNN" audio-track="rus", CNN International
 http://server.name/stream/to/video2
 #EXTINF:0, Arirang
 http://server.name/stream/to/video3


 */
public class TvGuideAttributes {
    private String timeShift = null;
    private String name = null;
    private String logo = null;

    public String getTimeShift() {
        return timeShift;
    }

    public void setTimeShift(String timeShift) {
        this.timeShift = timeShift;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}
