package com.project4.web.mapperImpl;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project4.web.domain.CommonDTO;
import com.project4.web.domain.MemberDTO;
import com.project4.web.mapper.MemberMapper;

@Service
public class MemberMapperImpl implements MemberMapper{
	private static final Logger logger = LoggerFactory.getLogger(MemberMapperImpl.class);
	@Autowired MemberDTO member;
	@Autowired CommonDTO common;
	@Autowired SqlSessionTemplate sqlSession;
	String ns = "com.project4.web.mapperImpl.MemberMapperImpl.";
		
	@Override
	public void insertMember(MemberDTO member) {
		// TODO Auto-generated method stub
		System.out.println("매퍼임플 insertMember id : "+ member.getId());
		System.out.println("매퍼임플 insertMember 날짜 : "+member.getRegdate());
		sqlSession.insert(ns+"insertMember", member);
	}

	@Override
	public void updateMember(CommonDTO common) {
		logger.info("매퍼임플 이전비번{} ", common.getBefPass());
		logger.info("매퍼임플 이후비번{} ", common.getAftPass());
		sqlSession.update(ns+"updateMember", common);		
	}

	@Override
	public void deleteMember(CommonDTO common) {
		logger.info("매퍼임플 deleteMember도착 nowPass는 {}", common.getNowPass());
		sqlSession.delete(ns+"deleteMember", common);
	}

	@Override
	public List<MemberDTO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberDTO> selectByName(MemberDTO member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberDTO selectById(MemberDTO member) {
		logger.info("멤버매핑임플-selectById 도착");
		MemberDTO m = sqlSession.selectOne(ns+"selectById",member);
		System.out.println("@매퍼임플 selectById 아이디는 " + m.getId());
		System.out.println("@매퍼임플 selectById 비밀번호는 " + m.getPass());
		System.out.println("@매퍼임플 selectById 이름은 " + m.getName());
		System.out.println("@매퍼임플 selectById 가입날짜는 " + m.getRegdate());
		return m;
	}

	@Override
	public int selectCount(MemberDTO member) {
		logger.info("멤버매퍼임플 도착했습니다 아이디는 {}", member.getId());
		int k = sqlSession.selectOne(ns+"selectCount",member);
		logger.info("멤버매퍼임플 셀렉트카운트 DB 일치개수는 {}", k);
		return k;
	}

}
