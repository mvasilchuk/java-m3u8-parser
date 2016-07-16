package net.chilicat.m3u8;


import org.apache.commons.io.IOUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 */
@RunWith(JUnit4.class)
public class M3UParserTest {

    private static final String RES_FOLDER = "src/test/resources/";

    @Before
    public void prepareTest() {

    }

    protected String readFile(final String fileName) throws IOException {
        FileInputStream stream = new FileInputStream(fileName);
        return IOUtils.toString(stream);
    }

    @Test
    public void testM3uExt() throws IOException, ParseException {
        Playlist playlist = Playlist.parse(readFile(RES_FOLDER + "raw/m3u_ext1.m3u"));

        Assert.assertEquals("http://61.50.196.42/iptv/jtv.zip", playlist.getTvGuideUrl());
        Assert.assertEquals(-1, playlist.getTvGuideShift());
        Assert.assertEquals(1, playlist.getDeinterlace());

        Assert.assertEquals(3, playlist.getElements().size());

        Element firstItem = playlist.getElements().get(0);

        Assert.assertEquals("Украина", firstItem.getTitle());
        Assert.assertEquals(-1, firstItem.getDuration());
        Assert.assertEquals("Украина", firstItem.getTvGuideAttributes().getName());
    }

    /*
    @Test
    public void testSimpleM3u() throws IOException, ParseException {
        Playlist playlist = Playlist.parse(readFile(RES_FOLDER + "raw/m3u_simple.m3u"));
        Assert.assertEquals(1, playlist.getElements().size());
        Element firstItem = playlist.getElements().get(0);
        Assert.assertEquals(null, firstItem.getTitle());
        Assert.assertEquals("C:\\Music", firstItem.getURI().toString());
    }*/
}
