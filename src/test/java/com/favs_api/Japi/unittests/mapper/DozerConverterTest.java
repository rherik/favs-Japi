package com.favs_api.Japi.unittests.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.favs_api.Japi.data_vo_v1.AlbumVO;
import com.favs_api.Japi.mapper.DozerMapper;
import com.favs_api.Japi.models.Album;
import com.favs_api.Japi.unittest.mapper_mocks.MockAlbum;

public class DozerConverterTest {

    MockAlbum inputObject;

    @BeforeEach
    public void setUp() {
        inputObject = new MockAlbum();
    }

    @Test
    public void parseEntityToVOTest() {
        AlbumVO output = DozerMapper.parseObject(inputObject.mockEntity(), AlbumVO.class);
        assertEquals(Long.valueOf(0L), output.getId());
        assertEquals("First Name Test0", output.getName());
        assertEquals("Last Name Test0", output.getRelease());
        assertEquals("Addres Test0", output.getAuthor());
        assertEquals("Lorem ipsum", output.getDescription());
        assertEquals("Lorem ipsum", output.getFoto());
        assertEquals("Lorem ipsum", output.getKind());
        assertEquals(5, output.getRate());
    }

    @Test
    public void parseEntityListToVOListTest() {
        List<AlbumVO> outputList = DozerMapper.parseListObjects(inputObject.mockEntityList(), AlbumVO.class);
        AlbumVO outputZero = outputList.get(0);

        assertEquals(Long.valueOf(0L), outputZero.getId());
        assertEquals("First Name Test0", outputZero.getName());
        assertEquals("Last Name Test0", outputZero.getRelease());
        assertEquals("Addres Test0", outputZero.getAuthor());
        assertEquals("Lorem ipsum", outputZero.getDescription());
        assertEquals("Lorem ipsum", outputZero.getFoto());
        assertEquals("Lorem ipsum", outputZero.getKind());
        assertEquals(5, outputZero.getRate());

        AlbumVO outputSeven = outputList.get(7);

        assertEquals(Long.valueOf(7L), outputSeven.getId());
        assertEquals("First Name Test7", outputSeven.getName());
        assertEquals("Last Name Test7", outputSeven.getRelease());
        assertEquals("Addres Test7", outputSeven.getAuthor());
        assertEquals("Lorem ipsum", outputSeven.getDescription());
        assertEquals("Lorem ipsum", outputSeven.getFoto());
        assertEquals("Lorem ipsum", outputSeven.getKind());
        assertEquals(5, outputSeven.getRate());

        AlbumVO outputTwelve = outputList.get(12);

        assertEquals(Long.valueOf(12L), outputTwelve.getId());
        assertEquals("First Name Test12", outputTwelve.getName());
        assertEquals("01/11/2010", outputTwelve.getRelease());
        assertEquals("Fulano de tal", outputTwelve.getAuthor());
        assertEquals("Loren ipsum", outputTwelve.getDescription());
        assertEquals("Loren ipsum", outputTwelve.getFoto());
        assertEquals("Loren ipsum", outputTwelve.getKind());
        assertEquals(5, outputTwelve.getRate());
    }

    @Test
    public void parseVOToEntityTest() {
        Album output = DozerMapper.parseObject(inputObject.mockVO(), Album.class);
        assertEquals(Long.valueOf(0L), output.getId());
        assertEquals("First Name Test0", output.getName());
        assertEquals("Last Name Test0", output.getRelease());
        assertEquals("Addres Test0", output.getAuthor());
        assertEquals("Male", output.getDescription());
        assertEquals("Male", output.getFoto());
        assertEquals("Male", output.getKind());
        assertEquals(5, output.getRate());
    }

    @Test
    public void parserVOListToEntityListTest() {
        List<Album> outputList = DozerMapper.parseListObjects(inputObject.mockVOList(), Album.class);
        Album outputZero = outputList.get(0);

        assertEquals(Long.valueOf(0L), outputZero.getId());
        assertEquals("First Name Test0", outputZero.getName());
        assertEquals("Last Name Test0", outputZero.getRelease());
        assertEquals("Addres Test0", outputZero.getAuthor());
        assertEquals("Male", outputZero.getDescription());
        assertEquals("Male", outputZero.getFoto());
        assertEquals("Male", outputZero.getKind());
        assertEquals(5, outputZero.getRate());

        Album outputSeven = outputList.get(7);

        assertEquals(Long.valueOf(7L), outputSeven.getId());
        assertEquals("First Name Test7", outputSeven.getName());
        assertEquals("Last Name Test7", outputSeven.getRelease());
        assertEquals("Addres Test7", outputSeven.getAuthor());
        assertEquals("Female", outputSeven.getDescription());
        assertEquals("Female", outputSeven.getFoto());
        assertEquals("Female", outputSeven.getKind());
        assertEquals(5, outputSeven.getRate());

        Album outputTwelve = outputList.get(12);

        assertEquals(Long.valueOf(12L), outputTwelve.getId());
        assertEquals("First Name Test12", outputTwelve.getName());
        assertEquals("Last Name Test12", outputTwelve.getRelease());
        assertEquals("Addres Test12", outputTwelve.getAuthor());
        assertEquals("Male", outputTwelve.getDescription());
        assertEquals("Male", outputTwelve.getFoto());
        assertEquals("Male", outputTwelve.getKind());
        assertEquals(5, outputTwelve.getRate());
    }
}
