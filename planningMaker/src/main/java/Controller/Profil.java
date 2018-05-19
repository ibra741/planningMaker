package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Profil
 */
public class Profil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Profil() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Recupere la session
				HttpSession session = request.getSession(true); 
				//faire une redirection vers la page profil ...
				if(session.getAttribute("idEnseignant")!=null){
				this.getServletContext().getRequestDispatcher("/profil.jsp").forward(request, response);
				}else if(session.getAttribute("idEtudiant")!=null){
				this.getServletContext().getRequestDispatcher("/profilEtudiant.jsp").forward(request, response);

				}else
					this.getServletContext().getRequestDispatcher("/profilAgent.jsp").forward(request, response);
	
	}



}
