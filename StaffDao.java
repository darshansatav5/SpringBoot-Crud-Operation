package com.example.demo.Staff;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Admin;

@Service
public class StaffDao implements StaffService 
{

	@Autowired
	StaffRepo sr;
	
	
	
	@Override
	public void registerdata(Staff s1) 
	{
		sr.save(s1);
		
	}



	@Override
	public List<Staff> getallinfo()
	{
		
		return sr.findAll();
	}



	@Override
	public void deld1(int id)
	{
	
		sr.deleteById(id);
		
	}



	@Override
	public Staff getSingleInfo(int id)
	{
		
		return sr.getById(id);
	}



	@Override
	public void updatedata2(Staff s1)
	{
		sr.save(s1);
		
	}



	

}
