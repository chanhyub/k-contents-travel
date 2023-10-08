package com.nomadlab.imstupidnigger.example;

import com.nomadlab.imstupidnigger.modules.common.file.File;
import com.nomadlab.imstupidnigger.modules.common.file.FileDto;

import java.util.List;

public interface FileExample {
    Long fileId = 1L;

    String fileTitle = "테스트 이미지 파일";

    String fileUrl = "test_image_1.jpg";

    File file = new File(fileId, fileTitle, fileUrl, FileInfoExample.fileInfo);

    FileDto fileDto = new FileDto(fileTitle, fileUrl);

    List<FileDto> fileDtoList = List.of(fileDto);
}
