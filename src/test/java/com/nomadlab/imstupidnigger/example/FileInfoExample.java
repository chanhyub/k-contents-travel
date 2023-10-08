package com.nomadlab.imstupidnigger.example;

import com.nomadlab.imstupidnigger.modules.common.file.FileInfo;
import com.nomadlab.imstupidnigger.modules.common.file.FileType;

public interface FileInfoExample {
    Long fileInfoId = 1L;
    FileType fileType = FileType.CONTENT;
    FileInfo fileInfo = new FileInfo(fileInfoId, fileType);
}
