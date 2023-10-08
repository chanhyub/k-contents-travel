package com.nomadlab.imstupidnigger.mock;

import com.nomadlab.imstupidnigger.example.ContentExample;
import com.nomadlab.imstupidnigger.example.ContentLocationExample;
import com.nomadlab.imstupidnigger.modules.content.ContentController;
import com.nomadlab.imstupidnigger.modules.content.ContentService;
import com.nomadlab.imstupidnigger.modules.content.dto.ContentLocationResponseDto;
import com.nomadlab.imstupidnigger.modules.content.dto.ContentResponseDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.jpa.mapping.JpaMetamodelMappingContext;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@WebMvcTest(ContentController.class)
@MockBean(JpaMetamodelMappingContext.class)
@DisplayName("컨텐츠 Mock 테스트")
public class ContentControllerMockTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private ContentService contentService;

    @Test
    @WithMockUser
    @DisplayName("전체 컨텐츠 리스트 조회")
    void getAllContentList() throws Exception {
        ContentResponseDto contentResponseDto = ContentExample.contentResponseDto;

        List<ContentResponseDto> contentResponseDtoList = List.of(contentResponseDto);

        //given
        given(this.contentService.getAllContentList()).willReturn(contentResponseDtoList);

        //when
        ResultActions perform = this.mockMvc.perform(
                get("/content")
                        .accept(MediaType.APPLICATION_JSON)
        );

        //then
        perform.andExpect(status().isOk())
                .andDo(print())
                .andExpect(jsonPath("$.[0].contentTitle").value("테스트 컨텐츠"))
                .andExpect(jsonPath("$.[0].contentType").value("MOVIE"))
                .andExpect(jsonPath("$.[0].imageList.[0].fileTitle").value("테스트 이미지 파일"))
                .andExpect(jsonPath("$.[0].imageList.[0].fileUrl").value("test_image_1.jpg"));
    }

    @Test
    @WithMockUser
    @DisplayName("전체 촬영지 리스트 조회")
    void getAllContentLocationList() throws Exception {
        ContentLocationResponseDto contentLocationResponseDto = ContentLocationExample.contentLocationResponseDto;

        List<ContentLocationResponseDto> contentLocationResponseDtoList = List.of(contentLocationResponseDto);

        //given
        given(this.contentService.getAllContentLocationList()).willReturn(contentLocationResponseDtoList);

        //when
        ResultActions perform = this.mockMvc.perform(
                get("/content/location")
                        .accept(MediaType.APPLICATION_JSON)
        );

        //then
        perform.andExpect(status().isOk())
                .andDo(print())
                .andExpect(jsonPath("$.[0].locationName").value("테스트 촬영지"))
                .andExpect(jsonPath("$.[0].locationDetail").value("테스트 촬영지 입니다."))
                .andExpect(jsonPath("$.[0].lat").value("37.17643"))
                .andExpect(jsonPath("$.[0].lng").value("-17.33245"))
                .andExpect(jsonPath("$.[0].contentResponseDto.contentTitle").value("테스트 컨텐츠"))
                .andExpect(jsonPath("$.[0].contentResponseDto.contentType").value("MOVIE"))
                .andExpect(jsonPath("$.[0].contentResponseDto.imageList.[0].fileTitle").value("테스트 이미지 파일"))
                .andExpect(jsonPath("$.[0].contentResponseDto.imageList.[0].fileUrl").value("test_image_1.jpg"))
                .andExpect(jsonPath("$.[0].imageList.[0].fileTitle").value("테스트 이미지 파일"))
                .andExpect(jsonPath("$.[0].imageList.[0].fileUrl").value("test_image_1.jpg"));
    }
}
