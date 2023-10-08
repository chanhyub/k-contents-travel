package com.nomadlab.imstupidnigger.example;

import com.nomadlab.imstupidnigger.modules.content.Content;
import com.nomadlab.imstupidnigger.modules.content.ContentType;
import com.nomadlab.imstupidnigger.modules.content.dto.ContentResponseDto;

public interface ContentExample {
    Long contentId = 1L;

    String contentTitle = "테스트 컨텐츠";

    ContentType contentType = ContentType.MOVIE;

    Content content = new Content(contentId, contentTitle, FileInfoExample.fileInfo, contentType);

    ContentResponseDto contentResponseDto = new ContentResponseDto(contentTitle, contentType, FileExample.fileDtoList);
}
