package com.nomadlab.imstupidnigger.modules.content;

import com.nomadlab.imstupidnigger.modules.common.file.File;
import com.nomadlab.imstupidnigger.modules.common.file.FileDto;
import com.nomadlab.imstupidnigger.modules.common.file.FileRepository;
import com.nomadlab.imstupidnigger.modules.content.contentLocation.ContentLocation;
import com.nomadlab.imstupidnigger.modules.content.contentLocation.ContentsLocationRepository;
import com.nomadlab.imstupidnigger.modules.content.dto.ContentLocationResponseDto;
import com.nomadlab.imstupidnigger.modules.content.dto.ContentResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ContentService {
    private final ContentRepository contentRepository;
    private final FileRepository fileRepository;
    private final ContentsLocationRepository contentsLocationRepository;

    public List<ContentResponseDto> getAllContentList(){
        List<Content> contentList = contentRepository.findAll();

        return contentList.stream()
                .map(m -> {
                    List<File> fileList = fileRepository.findByFileInfoId(m.getImage().getId());
                    List<FileDto> imageList = fileList.stream().map(file -> new FileDto(file.getFileTitle(), file.getFileUrl())).toList();
                    return new ContentResponseDto(m.getContentTitle(),m.getContentType(), imageList);
                }).toList();
    }

    public List<ContentLocationResponseDto> getAllContentLocationList(){
        List<ContentLocation> contentLocationList = contentsLocationRepository.findAll();

        return contentLocationList.stream()
                .map(m -> {
                    List<File> fileList = fileRepository.findByFileInfoId(m.getImage().getId());
                    List<FileDto> imageList = fileList.stream().map(file -> new FileDto(file.getFileTitle(), file.getFileUrl())).toList();

                    List<File> contentFileList = fileRepository.findByFileInfoId(m.getContent().getId());
                    List<FileDto> contentImageList = contentFileList.stream().map(contentFile -> new FileDto(contentFile.getFileTitle(), contentFile.getFileUrl())).toList();

                    ContentResponseDto contentResponseDto = new ContentResponseDto(m.getContent().getContentTitle(), m.getContent().getContentType(), contentImageList);

                    return new ContentLocationResponseDto(m.getLocationName(), m.getLocationDetail(), m.getLat(), m.getLng(), contentResponseDto, imageList);
                }).toList();
    }

}
