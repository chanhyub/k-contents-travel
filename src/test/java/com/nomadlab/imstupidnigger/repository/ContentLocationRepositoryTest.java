package com.nomadlab.imstupidnigger.repository;

import com.nomadlab.imstupidnigger.example.ContentLocationExample;
import com.nomadlab.imstupidnigger.modules.content.contentLocation.ContentLocation;
import com.nomadlab.imstupidnigger.modules.content.contentLocation.ContentsLocationRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
@DisplayName("촬영지 레포지토리 테스트")
public class ContentLocationRepositoryTest {

    @Autowired
    private ContentsLocationRepository contentsLocationRepository;

    @Test
    void findById(){
        ContentLocation saveContentLocation = saveContentLocation();

        Optional<ContentLocation> contentLocation = contentsLocationRepository.findById(saveContentLocation().getId());
        Assertions.assertTrue(contentLocation.isPresent());

        ContentLocation checkContentLocation = contentLocation.get();
        Assertions.assertEquals(saveContentLocation.getId(), checkContentLocation.getId());
    }

    @Test
    void update(){
        String changeLocationName = "테스트 촬영지 - 수정";
        ContentLocation contentLocation = saveContentLocation();
        contentLocation.setLocationName(changeLocationName);

        ContentLocation updateContentLocation = contentsLocationRepository.save(contentLocation);

        Assertions.assertEquals(updateContentLocation.getLocationName(), changeLocationName);
        Assertions.assertEquals(contentLocation.getId(), updateContentLocation.getId());
    }

    @Test
    void delete(){
        ContentLocation contentLocation = saveContentLocation();
        contentsLocationRepository.delete(contentLocation);
        Assertions.assertTrue(contentsLocationRepository.findById(contentLocation.getId()).isEmpty());
    }

    private ContentLocation saveContentLocation(){
        ContentLocation contentLocation = ContentLocationExample.contentLocation;
        return contentsLocationRepository.save(contentLocation);
    }
}
