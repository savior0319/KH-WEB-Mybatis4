package mybatis.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mybatis.member.model.service.MemberServiceImpl;
import mybatis.member.model.vo.MemberVO;

@WebServlet(name = "Signup", urlPatterns = { "/signup" })
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SignupServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		proccess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		proccess(request, response);
	}

	protected void proccess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String location = request.getParameter("location");
		String gender = request.getParameter("gender");
		String hobbyArr[] = request.getParameterValues("hobby");

		StringBuilder hobbyAppend = new StringBuilder();

		if (hobbyArr == null) {
			hobbyAppend.append("없음,");
		} else {
			for (int i = 0; i < hobbyArr.length; i++) {
				if (hobbyArr != null) {
					hobbyAppend.append(hobbyArr[i] + ",");
				}
			}
		}

		String hobby = hobbyAppend.substring(0, hobbyAppend.length() - 1);

		MemberVO mv = new MemberVO();
		mv.setMemberId(id);
		mv.setMemberPw(pw);
		mv.setMemberName(name);
		mv.setMemberAddr(location);
		mv.setGender(gender);
		mv.setHobby(hobby);

		int result = new MemberServiceImpl().signup(mv);

		if (result > 0) {
			response.sendRedirect("/views/member/signupsuccess.jsp");
		} else {
			response.sendRedirect("/views/member/signupfail.jsp");
		}

	}

}
