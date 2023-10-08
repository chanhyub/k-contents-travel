package com.nomadlab.imstupidnigger.modules.common.file;

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
@Table(name = "FILE_INFO")
public class FileInfo extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("파일 타입")
    @Enumerated(EnumType.STRING)
    private FileType fileType;

}
