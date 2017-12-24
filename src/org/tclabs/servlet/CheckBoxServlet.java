package org.tclabs.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.tclabs.db.UserDao;
import org.tclabs.dto.LanguagesKnownDTO;
import org.tclabs.dto.UserDTO;

/**
 * Servlet implementation class CheckBoxServlet
 */
public class CheckBoxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CheckBoxServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.getRequestDispatcher("pages/checboxform.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/* Reading Form Data from the request object */
		String[] subjects = (String[]) request.getParameterValues("subjects");
		String userName = request.getParameter("name");
		String emailId = request.getParameter("emailId");
		String age = request.getParameter("age");
		String  id  = request.getParameter("id");
		
		/* creating equivalent object to data */
		UserDTO userDTO = new UserDTO(); 
		userDTO.setUserName(userName);
		userDTO.setEmailId(emailId);
		userDTO.setAge(Float.parseFloat(age));
		userDTO.setLanguagesKnown(new ArrayList<LanguagesKnownDTO>());
		userDTO.setId(Long.parseLong(id));
		for(String subject: subjects) {
			LanguagesKnownDTO lkDTO = new LanguagesKnownDTO();
			lkDTO.setLanguageKnown(subject);
			
			userDTO.getLanguagesKnown().add(lkDTO);
		}
		
	
		/* Saving in DB Using JDBC */
		UserDao dao = new UserDao();
		userDTO = dao.saveUserAndLanguages(userDTO);
		
		/* Passing Saved data to page using request attribute */
		request.setAttribute("saveduser", userDTO);
		
		/* Displays response page */
		request.getRequestDispatcher("pages/languagesresponse.jsp").forward(request, response);
	}

}
