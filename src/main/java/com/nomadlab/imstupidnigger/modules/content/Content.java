package com.nomadlab.imstupidnigger.modules.content;

import com.nomadlab.imstupidnigger.modules.common.file.FileInfo;
import com.nomadlab.imstupidnigger.modules.common.jpa.BaseTime;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CONTENT")
public class Content extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("컨텐츠 이름")
    private String contentTitle;

    @Comment("컨텐츠 이미지")
    @ManyToOne
    private FileInfo image;

    @Comment("컨텐츠 타입")
    @Enumerated(EnumType.STRING)
    private ContentType contentType;

}
