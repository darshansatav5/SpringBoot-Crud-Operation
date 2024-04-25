package com.example.demo.Staff;

import java.util.List;

public interface StaffService 
{

	void registerdata(Staff s1);

	List<Staff> getallinfo();
	
	void deld1(int id);
	
	Staff getSingleInfo(int id);
	
	void updatedata2(Staff s1);
}
