package com.example.demo;

import java.util.List;

public interface AdminService 
{

	void registerdata(Admin a1);
	
	List<Admin> getallinfo();
	
	void deld(int id);
	
	Admin getSingleInfo(int id);
	
	void updatedata(Admin a1);
}
