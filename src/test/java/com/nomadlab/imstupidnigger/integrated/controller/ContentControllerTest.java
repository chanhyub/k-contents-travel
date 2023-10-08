package com.nomadlab.imstupidnigger.integrated.controller;

import com.nomadlab.imstupidnigger.integrated.AbstractControllerTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.MediaType;
import org.springframework.restdocs.payload.FieldDescriptor;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.restdocs.payload.PayloadDocumentation.*;

@DisplayName("컨텐츠 컨트롤러 통합 테스트")
public class ContentControllerTest extends AbstractControllerTest {

    @Test
    @DisplayName("전체 컨텐츠 리스트 조회")
    void getAllContentList() throws Exception {

        ResultActions perform = this.mockMvc.perform(
                get("/content")
                        .accept(MediaType.APPLICATION_JSON)
        );

        perform
                .andExpect(status().isOk())
                .andDo(print())
                .andDo(
                        document("content-all-list",
                                responseFields().and(getContentListField())
                        )
                );
    }

    private FieldDescriptor[] getContentListField() {
        return new FieldDescriptor[] {
                fieldWithPath("[].contentTitle").description("컨텐츠 제목"),
                fieldWithPath("[].contentType").description("컨텐츠 타입"),
                fieldWithPath("[].imageList[].fileTitle").description("컨텐츠 이미지 제목"),
                fieldWithPath("[].imageList[].fileUrl").description("컨텐츠 이미지 URL"),
        };
    }
}
