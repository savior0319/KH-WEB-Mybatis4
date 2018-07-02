package mybatis.member.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import mybatis.member.model.vo.CheckVo;
import mybatis.member.model.vo.MemberVO;
import mybatis.member.model.vo.SearchVO;

@SuppressWarnings("all")
public class MemberDAOImpl implements MemberDAO {

	public MemberDAOImpl() {
	}

	@Override
	public MemberVO login(SqlSession session, MemberVO mv) {
		MemberVO mvLogin = session.selectOne("member.query1", mv);
		return mvLogin;
	}

	@Override
	public int signup(SqlSession session, MemberVO mv) {
		int result = session.insert("member.query2", mv);
		return result;
	}

	@Override
	public MemberVO myInfo(SqlSession session, int memberNo) {
		MemberVO mvLogin = session.selectOne("member.query3", memberNo);
		return mvLogin;
	}

	@Override
	public int memberWithDraw(SqlSession session, int memberNo) {
		int result = session.delete("member.query4", memberNo);
		return result;
	}

	@Override
	public int modify(SqlSession session, MemberVO mv) {
		int result = session.update("member.query5", mv);
		return result;
	}

	@Override
	public ArrayList<MemberVO> allMember(SqlSession session) {
		List list = session.selectList("member.query6");
		return (ArrayList<MemberVO>) list;
	}

	@Override
	public ArrayList<MemberVO> search(SqlSession session, SearchVO sv) {
		List list = session.selectList("member.query7", sv);
		return (ArrayList<MemberVO>) list;
	}

	@Override
	public ArrayList<MemberVO> search2(SqlSession session, CheckVo cv) {
		List list = session.selectList("member.query8", cv);
		return (ArrayList<MemberVO>) list;
	}

	@Override
	public ArrayList<MemberVO> search3(SqlSession session, String[] check) {
		List list = session.selectList("member.query9", check);
		return (ArrayList<MemberVO>) list;
	}

}
