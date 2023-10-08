package com.nomadlab.imstupidnigger.repository;

import com.nomadlab.imstupidnigger.example.ContentExample;
import com.nomadlab.imstupidnigger.modules.content.Content;
import com.nomadlab.imstupidnigger.modules.content.ContentRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
@DisplayName("컨텐츠 레포지토리 테스트")
public class ContentRepositoryTest {

    @Autowired
    private ContentRepository contentRepository;

    @Test
    void findById(){
        Content saveContent = saveContent();

        Optional<Content> content = contentRepository.findById(saveContent().getId());
        Assertions.assertTrue(content.isPresent());

        Content checkContent = content.get();
        Assertions.assertEquals(saveContent.getId(), checkContent.getId());
    }

    @Test
    void update(){
        String changeContentTitle = "테스트 컨텐츠 - 수정";
        Content content = saveContent();
        content.setContentTitle(changeContentTitle);

        Content updateContent = contentRepository.save(content);

        Assertions.assertEquals(updateContent.getContentTitle(), changeContentTitle);
        Assertions.assertEquals(content.getId(), updateContent.getId());
    }

    @Test
    void delete(){
        Content content = saveContent();
        contentRepository.delete(content);
        Assertions.assertTrue(contentRepository.findById(content.getId()).isEmpty());
    }

    private Content saveContent() {
        Content content = ContentExample.content;
        return contentRepository.save(content);
    }
}
