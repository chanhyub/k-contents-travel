package com.nomadlab.imstupidnigger.modules.content.dto;

import com.nomadlab.imstupidnigger.modules.common.file.FileDto;
import com.nomadlab.imstupidnigger.modules.content.ContentType;

import java.util.List;

public record ContentResponseDto(String contentTitle, ContentType contentType, List<FileDto> imageList) {
}
