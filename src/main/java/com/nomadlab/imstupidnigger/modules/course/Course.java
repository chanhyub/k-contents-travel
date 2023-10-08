package com.nomadlab.imstupidnigger.modules.course;

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
@Table(name = "COURSE")
public class Course extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("코스 이름")
    private String courseTitle;

}
