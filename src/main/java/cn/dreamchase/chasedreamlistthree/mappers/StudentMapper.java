package cn.dreamchase.chasedreamlistthree.mappers;

import java.util.List;

import cn.dreamchase.chasedreamlistthree.pojos.Student;

/**
 * mybatis入门- mybatis字段属性映射
 * 
 * @author MENGDEFANG
 *
 */
public interface StudentMapper {

	/**
	 * 字段别名
	 * 
	 * @return
	 */
	public List<Student> getStudents();

	/**
	 * 使用resultMap元素
	 * 
	 * @return
	 */
	public List<Student> getStudentsResultMap();
}
