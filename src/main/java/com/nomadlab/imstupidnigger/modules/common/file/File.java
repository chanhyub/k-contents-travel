package com.nomadlab.imstupidnigger.modules.common.file;

import com.nomadlab.imstupidnigger.modules.common.jpa.BaseTime;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "FILE")
public class File extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("파일 이름")
    private String fileTitle;

    @Comment("파일 경로")
    private String fileUrl;

    @Comment("파일 정보")
    @ManyToOne
    private FileInfo fileInfo;
}
