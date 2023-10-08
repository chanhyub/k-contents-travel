package com.nomadlab.imstupidnigger.modules.content;

import com.nomadlab.imstupidnigger.modules.content.dto.ContentLocationResponseDto;
import com.nomadlab.imstupidnigger.modules.content.dto.ContentResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/content")
@RequiredArgsConstructor
public class ContentController {
    private final ContentService contentService;

    @GetMapping
    public ResponseEntity<List<ContentResponseDto>> getAllContent(){
        return ResponseEntity.ok(contentService.getAllContentList());
    }

    @GetMapping("location")
    public ResponseEntity<List<ContentLocationResponseDto>> getAllContentLocation(){
        return ResponseEntity.ok(contentService.getAllContentLocationList());
    }
}
