package com.nomadlab.imstupidnigger.example;

import com.nomadlab.imstupidnigger.modules.content.contentLocation.ContentLocation;
import com.nomadlab.imstupidnigger.modules.content.dto.ContentLocationResponseDto;

public interface ContentLocationExample {
    Long contentLocationId = 1L;

    String locationName = "테스트 촬영지";

    String locationDetail = "테스트 촬영지 입니다.";

    Double lat = 37.17643;

    Double lng = -17.33245;

    ContentLocation contentLocation = new ContentLocation(contentLocationId, locationName, locationDetail, lat, lng, ContentExample.content, FileInfoExample.fileInfo);

    ContentLocationResponseDto contentLocationResponseDto = new ContentLocationResponseDto(locationName, locationDetail, lat, lng, ContentExample.contentResponseDto, FileExample.fileDtoList);
}
