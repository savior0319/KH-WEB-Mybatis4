package mybatis.member.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mybatis.member.model.service.MemberServiceImpl;
import mybatis.member.model.vo.CheckVo;
import mybatis.member.model.vo.MemberVO;

@WebServlet(name = "Search2", urlPatterns = { "/search2" })
public class Search2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Search2Servlet() {
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

		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		String gender = request.getParameter("gender");
		String hobby = request.getParameter("hobby");

		CheckVo cv = new CheckVo(name, addr, gender, hobby);
		ArrayList<MemberVO> aList = new MemberServiceImpl().search2(cv);

		if (!aList.isEmpty()) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/member/list.jsp");
			request.setAttribute("list", aList);
			dispatcher.forward(request, response);
		} else {
			response.sendRedirect("/views/member/fail.jsp");
		}

	}

}
