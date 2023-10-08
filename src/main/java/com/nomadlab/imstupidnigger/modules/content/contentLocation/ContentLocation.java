package com.nomadlab.imstupidnigger.modules.content.contentLocation;

import com.nomadlab.imstupidnigger.modules.common.file.FileInfo;
import com.nomadlab.imstupidnigger.modules.common.jpa.BaseTime;
import com.nomadlab.imstupidnigger.modules.content.Content;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CONTENTS_LOCATION")
public class ContentLocation extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("촬영지 이름")
    private String locationName;

    @Comment("촬영지 상세 설명")
    @Lob
    private String locationDetail;

    @Comment("위도")
    private Double lat;

    @Comment("경도")
    private Double lng;

    @Comment("컨텐츠")
    @ManyToOne
    private Content content;

    @Comment("촬영지 이미지")
    @ManyToOne
    private FileInfo image;
}
