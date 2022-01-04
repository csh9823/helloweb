package com.javaex.servernet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet {

	// 사용법 http://localhost:8088/helloweb/gugudan?dan=3 ?의 뜻 값을 넣어준다
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//코드작성
		 response.setContentType("text/html;charset=utf-8");
		 
		 //파라미터 값 꺼내기
		 int dan = Integer.parseInt(request.getParameter("dan"));
		 
	      PrintWriter out = response.getWriter();
	      out.println("<table border='1'>");
	      
	      for(int i=1; i<=9; i++) {
	    	  out.println("        <tr>");
		      out.println("             <td>" + dan + "</td>");
		      out.println("             <td>"+ i + "</td>");
		      out.println("             <td>"+ dan*i + "</td>");
		      out.println("        </tr>");
		       
	      }
	      out.println("</table>"); 
	 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
