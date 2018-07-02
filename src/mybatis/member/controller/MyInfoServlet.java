package mybatis.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mybatis.member.model.service.MemberServiceImpl;
import mybatis.member.model.vo.MemberVO;

@WebServlet(name = "MyInfo", urlPatterns = { "/myInfo" })
public class MyInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyInfoServlet() {
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

		MemberVO mvInfo = new MemberServiceImpl().myInfo(memberNo);

		if (mvInfo != null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/member/myinfo.jsp");
			request.setAttribute("myinfo", mvInfo);
			dispatcher.forward(request, response);
		} else {
			response.sendRedirect("views/member/myinfofail.jsp");
		}

	}

}
