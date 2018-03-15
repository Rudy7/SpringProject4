package com.project4.web.serviceImpl;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project4.web.domain.CommonDTO;
import com.project4.web.domain.MemberDTO;
import com.project4.web.mapper.MemberMapper;
import com.project4.web.mapperImpl.MemberMapperImpl;
import com.project4.web.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{
	private static final Logger logger = LoggerFactory.getLogger(MemberMapperImpl.class);
	@Autowired MemberMapper mapper;
	@Autowired MemberDTO member;
	@Autowired CommonDTO common;
	
	@Override
	public void addMember(MemberDTO member) {
		mapper.insertMember(member);
	}

	@Override
	public void modifyMember(CommonDTO common) {
		mapper.updateMember(common);
	}

	@Override
	public void removeMember(CommonDTO common) {
		mapper.deleteMember(common);
	}

	@Override
	public List<MemberDTO> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberDTO> findByName(MemberDTO member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberDTO findById(MemberDTO member) {
		logger.info("멤버서비스임플-findById 도착");
		MemberDTO i = mapper.selectById(member);
		return i;
	}

	@Override
	public boolean count(MemberDTO member) {
		logger.info("멤버서비스임플 도착했습니다 아이디는 {}", member.getId());
		boolean e = false;
		int k = mapper.selectCount(member);
		if(k!=0) {
			e = true;
		}else {
			e = false;
		}
		logger.info("멤버서비스임플 ture/false 중 {}", e);
		return e;
	}

}
