package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminDao implements AdminService {

	@Autowired
	AdminRepo ar;
	
	
	
	
	
	@Override
	public void registerdata(Admin a1)
	{
	
		ar.save(a1);

	}





	@Override
	public List<Admin> getallinfo() {
		
		return ar.findAll();
	}





	@Override
	public void deld(int id)
	{
	
		ar.deleteById(id);
		
	}

	@Override
	public Admin getSingleInfo(int id)
	{
		
		return ar.getById(id);
	}

	@Override
	public void updatedata(Admin a1)
	{
		ar.save(a1);
		
	}
	
	

}
