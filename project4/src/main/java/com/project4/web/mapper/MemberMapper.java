package com.project4.web.mapper;

import java.util.List;
import org.springframework.stereotype.Component;

import com.project4.web.domain.CommonDTO;
import com.project4.web.domain.MemberDTO;

@Component
public interface MemberMapper {
		public void insertMember(MemberDTO member);
		public void updateMember(CommonDTO common);
		public void deleteMember(CommonDTO common);
		public List<MemberDTO> selectAll();
		public List<MemberDTO> selectByName(MemberDTO member);
		public MemberDTO selectById(MemberDTO member);
		public int selectCount(MemberDTO member);
	
}
