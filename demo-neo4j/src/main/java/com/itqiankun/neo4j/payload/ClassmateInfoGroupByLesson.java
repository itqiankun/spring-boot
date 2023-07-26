package com.itqiankun.neo4j.payload;

import com.itqiankun.neo4j.model.Student;
import lombok.Data;
import org.springframework.data.neo4j.annotation.QueryResult;

import java.util.List;

/**
 * <p>
 * 按照课程分组的同学关系
 * </p>
 *
 * @author ma_qiankun
 * @date Created in 2018-12-24 19:18
 */
@Data
@QueryResult
public class ClassmateInfoGroupByLesson {
    /**
     * 课程名称
     */
    private String lessonName;

    /**
     * 学生信息
     */
    private List<Student> students;
}
