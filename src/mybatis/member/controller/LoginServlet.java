package mybatis.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mybatis.member.model.service.MemberServiceImpl;
import mybatis.member.model.vo.MemberVO;

@WebServlet(name = "Login", urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	protected void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getParameter("utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		MemberVO mv = new MemberVO();
		mv.setMemberId(id);
		mv.setMemberPw(pw);

		MemberVO mvLogin = new MemberServiceImpl().login(mv);

		if (mvLogin != null) {
			HttpSession session = request.getSession();
			session.setAttribute("member", mvLogin);
			response.sendRedirect("/views/member/login.jsp");
		} else {
			response.sendRedirect("/views/member/loginfail.jsp");
		}
	}

}
