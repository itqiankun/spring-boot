package com.itqiankun.neo4j.payload;

import com.itqiankun.neo4j.model.Student;
import lombok.Data;
import org.springframework.data.neo4j.annotation.QueryResult;

import java.util.List;

/**
 * <p>
 * 师生关系
 * </p>
 *
 * @author ma_qiankun
 * @date Created in 2018-12-24 19:18
 */
@Data
@QueryResult
public class TeacherStudent {
    /**
     * 教师姓名
     */
    private String teacherName;

    /**
     * 学生信息
     */
    private List<Student> students;
}
