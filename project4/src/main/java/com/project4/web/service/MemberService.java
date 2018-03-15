package com.project4.web.service;

import java.util.List;
import org.springframework.stereotype.Component;

import com.project4.web.domain.CommonDTO;
import com.project4.web.domain.MemberDTO;

@Component
public interface MemberService {
	public void addMember(MemberDTO member);
	public void modifyMember(CommonDTO common);
	public void removeMember(CommonDTO common);
	public List<MemberDTO> list();
	public List<MemberDTO> findByName(MemberDTO member);
	public MemberDTO findById(MemberDTO member);
	public boolean count(MemberDTO member);

	
}
