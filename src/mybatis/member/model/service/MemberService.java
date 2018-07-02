package mybatis.member.model.service;

import java.util.ArrayList;

import mybatis.member.model.vo.*;
import mybatis.member.model.vo.MemberVO;
import mybatis.member.model.vo.SearchVO;

public interface MemberService {

	MemberVO login(MemberVO mvLogin);

	int signup(MemberVO mv);

	MemberVO myInfo(int memberNo);

	int memberWithDraw(int memberNo);

	int modify(MemberVO mv);

	ArrayList<MemberVO> allMember();

	ArrayList<MemberVO> search(SearchVO sv);

	ArrayList<MemberVO> search2(CheckVo cv);

	ArrayList<MemberVO> search3(String[] check);

}
