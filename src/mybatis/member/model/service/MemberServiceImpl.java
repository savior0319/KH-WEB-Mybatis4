package mybatis.member.model.service;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import common.SQLSessionTemplate;
import mybatis.member.model.dao.MemberDAOImpl;
import mybatis.member.model.vo.CheckVo;
import mybatis.member.model.vo.MemberVO;
import mybatis.member.model.vo.SearchVO;

public class MemberServiceImpl implements MemberService {

	public MemberServiceImpl() {
	}

	@Override
	public MemberVO login(MemberVO mv) {
		SqlSession session = SQLSessionTemplate.getSqlSession();
		MemberVO mvLogin = new MemberDAOImpl().login(session, mv);
		return mvLogin;
	}

	@Override
	public int signup(MemberVO mv) {
		SqlSession session = SQLSessionTemplate.getSqlSession();
		int result = new MemberDAOImpl().signup(session, mv);
		if (result > 0) {
			session.commit();
		} else
			session.rollback();
		return result;
	}

	@Override
	public MemberVO myInfo(int memberNo) {
		SqlSession session = SQLSessionTemplate.getSqlSession();
		MemberVO myInfo = new MemberDAOImpl().myInfo(session, memberNo);
		return myInfo;
	}

	@Override
	public int memberWithDraw(int memberNo) {
		SqlSession session = SQLSessionTemplate.getSqlSession();
		int result = new MemberDAOImpl().memberWithDraw(session, memberNo);
		if (result > 0) {
			session.commit();
		} else
			session.rollback();
		return result;
	}

	@Override
	public int modify(MemberVO mv) {
		SqlSession session = SQLSessionTemplate.getSqlSession();
		int result = new MemberDAOImpl().modify(session, mv);
		if (result > 0) {
			session.commit();
		} else
			session.rollback();
		return result;
	}

	@Override
	public ArrayList<MemberVO> allMember() {
		SqlSession session = SQLSessionTemplate.getSqlSession();
		ArrayList<MemberVO> aList = new MemberDAOImpl().allMember(session);
		return aList;
	}

	@Override
	public ArrayList<MemberVO> search(SearchVO sv) {
		SqlSession session = SQLSessionTemplate.getSqlSession();
		ArrayList<MemberVO> aList = new MemberDAOImpl().search(session, sv);
		return aList;
	}

	@Override
	public ArrayList<MemberVO> search2(CheckVo cv) {
		SqlSession session = SQLSessionTemplate.getSqlSession();
		ArrayList<MemberVO> aList = new MemberDAOImpl().search2(session, cv);
		return aList;
	}

	@Override
	public ArrayList<MemberVO> search3(String[] check) {
		SqlSession session = SQLSessionTemplate.getSqlSession();
		ArrayList<MemberVO> aList = new MemberDAOImpl().search3(session, check);
		return aList;
	}

}
