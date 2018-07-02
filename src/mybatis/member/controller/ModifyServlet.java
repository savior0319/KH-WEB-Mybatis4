package mybatis.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mybatis.member.model.service.MemberServiceImpl;
import mybatis.member.model.vo.MemberVO;

@WebServlet(name = "Modify", urlPatterns = { "/modify" })
public class ModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ModifyServlet() {
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

		request.setCharacterEncoding("utf-8");

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		MemberVO mv = new MemberVO();
		mv.setMemberId(id);
		mv.setMemberPw(pw);

		int result = new MemberServiceImpl().modify(mv);

		if (result > 0) {
			response.sendRedirect("/views/member/success.jsp");
		} else {
			response.sendRedirect("/views/member/fail.jsp");
		}
	}

}
