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
import mybatis.member.model.vo.MemberVO;
import mybatis.member.model.vo.SearchVO;

@WebServlet(name = "Search", urlPatterns = { "/search" })
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SearchServlet() {
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

		String searchSelect = request.getParameter("searchSelect");
		String searchVal = request.getParameter("searchVal");

		SearchVO sv = new SearchVO();
		sv.setSearchSelect(searchSelect);
		sv.setSearchVal(searchVal);

		ArrayList<MemberVO> aList = new MemberServiceImpl().search(sv);

		if (!aList.isEmpty()) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/views/member/list.jsp");
			request.setAttribute("list", aList);
			dispatcher.forward(request, response);
		} else {
			response.sendRedirect("/views/member/fail.jsp");
		}

	}

}
