package com.techpalle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PercentageServlet
 */
@WebServlet("/percentage")
public class PercentageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PercentageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		RequestDispatcher r=request.getRequestDispatcher("display.jsp");
		
		String maths=request.getParameter("tbmaths");
		String phy=request.getParameter("tbphysics");
		String chem=request.getParameter("tbchem");
		String bio=request.getParameter("tbbio");
		int a=Integer.valueOf(maths);
		int b=Integer.valueOf(phy);
		int c=Integer.valueOf(chem);
		int d=Integer.valueOf(bio);
		int avg=(a+b+c+d)/4;
		if(avg<60) {
			request.setAttribute("result", "second");
		}else if(avg>=60 && avg<75) {
			request.setAttribute("result", "first");
		}else {
			request.setAttribute("result", "Distinction");
		}
		r.forward(request, response);
		}

}
