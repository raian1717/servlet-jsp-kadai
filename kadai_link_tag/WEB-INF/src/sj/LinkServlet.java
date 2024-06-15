package sj;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LinkServlet extends HttpServlet {
	// GETメソッドのリクエスト受信時に実行されるメソッド
    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    	
    	request.setCharacterEncoding("UTF-8");
    	
    	String name = request.getParameter("username");
    	
    	request.setAttribute("text", "Servletからデータを受信しました: " + name + "さん、こんにちは！");
    	
    	
    	RequestDispatcher dpr = request.getRequestDispatcher("/index.jsp");
    	dpr.forward(request, response);
    	
    	
    	
    	
    	}
    }
