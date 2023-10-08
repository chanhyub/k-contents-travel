package com.nomadlab.imstupidnigger.modules.course.courseDetail;

import com.nomadlab.imstupidnigger.modules.content.contentLocation.ContentLocation;
import com.nomadlab.imstupidnigger.modules.course.Course;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "COURSE_DETAIL")
public class CourseDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Comment("코스 순서")
    private Integer courseIndex;

    @Comment("촬영지")
    @ManyToOne
    private ContentLocation contentLocation;

    @Comment("코스")
    @ManyToOne
    private Course course;
}
