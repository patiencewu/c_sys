package org.dao.service.interf;

import org.humanDepartment.humanSystem.pojo.Departmentemployee;

public interface DepartmentemployeeService extends BaseService<Departmentemployee>
{
//TODO 用来对Departmentemployee表的增删改查
	public void deleteById(int id);
}
