package com.nomadlab.imstupidnigger.modules.content.dto;

import com.nomadlab.imstupidnigger.modules.common.file.FileDto;

import java.util.List;

public record ContentLocationResponseDto(String locationName, String locationDetail, Double lat, Double lng, ContentResponseDto contentResponseDto, List<FileDto> imageList) {
}
