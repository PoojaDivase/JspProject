package com.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.model.Hardware;
import com.model.HardwareDetails;
import com.model.SoftwareDetails;

public class AdminOperationsServiceImpl implements AdminOperationsService{

	HardwareDetailsService hardwareDetailsService=new HardwareDetailsServiceImpl();
	SoftwareDetailsService softwareDetailsService=new SoftwareDetailsServiceImpl();
	
	@Override
	public List<HardwareDetails> SortByHardwareName(int hid) {
		List<HardwareDetails> allHardwareDetailsList1=hardwareDetailsService.getAllHardwareDetailsForParticularType(hid);
		HardwareSorting sortingByName=new HardwareSorting();
		Collections.sort(allHardwareDetailsList1, sortingByName); 
		return allHardwareDetailsList1;
	}
	

	List<HardwareDetails> allHardwareDetailsList = new ArrayList<HardwareDetails>();
	@Override
	public HardwareDetails SearchHardwareByName(String search) {
		
		allHardwareDetailsList=hardwareDetailsService.getAllHardwareDetails();
//		for(HardwareDetails hd:allHardwareDetailsList)
//		{
//			System.out.println(hd);
//		}
		for(HardwareDetails hd1:allHardwareDetailsList)
		{
			if(hd1.getHardwareName().equalsIgnoreCase(search))
			{
				return hd1;
			}
		}
		return null;
	}
	
	
	@Override
	public List<SoftwareDetails> SortBySoftwareName(int sid) {
		List<SoftwareDetails> allSoftwareDetailsList1=softwareDetailsService.getAllSoftwareDetailsForParticularType(sid);
		SoftwareSorting sortingBySoftwareName=new SoftwareSorting();
		Collections.sort(allSoftwareDetailsList1, sortingBySoftwareName); 
		return allSoftwareDetailsList1;
		
	}
	@Override
	public SoftwareDetails SearchSoftwareByName(String search) {
		List<SoftwareDetails> allSoftwareDetailsList=softwareDetailsService.getAllSoftware();
//		for(SoftwareDetails soft:allSoftwareDetailsList)
//		{
//			System.out.println(soft);
//		}
		for(SoftwareDetails soft:allSoftwareDetailsList)
		{
			if(soft.getSoftwareName().equalsIgnoreCase(search))
			{
				return soft;
			}
		}
		return null;
		
	}

	

//	List<HardwareDetails> allHardwareDetailsList = new ArrayList<HardwareDetails>();
//	List<SoftwareDetails> allSoftwareDetailsList = new ArrayList<SoftwareDetails>();
//	@Override
//	public HardwareDetails SearchByName(String search) {
//		
//		allHardwareDetailsList=hardwareDetailsService.getAllHardwareDetails();
//		allSoftwareDetailsList=softwareDetailsService.getAllSoftware();
//		//List<String> newlist=new ArrayList<String>();
//		boolean flag=true;
//		
//		if(flag==true)
//		{
//			for(HardwareDetails hd:allHardwareDetailsList)
//			{
//				System.out.println(hd);
//			}
//			for(HardwareDetails hd1:allHardwareDetailsList)
//			{
//				if(hd1.getHardwareName().equalsIgnoreCase(search))
//				{
//					return hd1;
//				}
//			}
//			flag=false;
//		}
//		else if(flag==false)
//		{
//			for(SoftwareDetails soft:allSoftwareDetailsList)
//			{
//				System.out.println(soft);
//			}
//			for(HardwareDetails soft:allHardwareDetailsList)
//			{
//				if(soft.getHardwareName().equalsIgnoreCase(search))
//				{
//					return soft;
//				}
//			}
//		}
//		return null;
//	}

	
}
