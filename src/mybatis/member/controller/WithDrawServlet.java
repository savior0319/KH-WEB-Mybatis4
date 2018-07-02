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

@WebServlet(name = "WithDraw", urlPatterns = { "/withDraw" })
public class WithDrawServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public WithDrawServlet() {
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

		HttpSession session = request.getSession(false);
		MemberVO mv = (MemberVO) session.getAttribute("member");
		int memberNo = mv.getMemberNo();

		int result = new MemberServiceImpl().memberWithDraw(memberNo);

		if (result > 0) {
			session.invalidate();
			response.sendRedirect("/views/member/withdraw.jsp");
		} else {
			response.sendRedirect("/views/member/withdrawfail.jsp");
		}
	}

}
