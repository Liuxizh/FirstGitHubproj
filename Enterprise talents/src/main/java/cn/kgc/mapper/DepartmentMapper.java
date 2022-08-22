package cn.kgc.mapper;

import cn.kgc.bean.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentMapper {
    List<Department> getDepartNameInfo();

}
