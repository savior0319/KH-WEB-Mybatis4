package mybatis.member.model.dao;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;

import mybatis.member.model.vo.CheckVo;
import mybatis.member.model.vo.MemberVO;
import mybatis.member.model.vo.SearchVO;

public interface MemberDAO {

	MemberVO login(SqlSession session, MemberVO mvLogin);

	int signup(SqlSession session, MemberVO mv);

	MemberVO myInfo(SqlSession session, int memberNo);

	int memberWithDraw(SqlSession session, int memberNo);

	int modify(SqlSession session, MemberVO mv);

	ArrayList<MemberVO> allMember(SqlSession session);

	ArrayList<MemberVO> search(SqlSession session, SearchVO sv);

	ArrayList<MemberVO> search2(SqlSession session, CheckVo cv);

	ArrayList<MemberVO> search3(SqlSession session, String[] check);

}
