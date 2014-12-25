package guessGame;

import java.awt.Canvas;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JPanel;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;



public class HttpHandler extends AbstractHandler {

	@Override
	public void handle(String target, Request baseRequest,
			HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		boolean create = "true".equals(request.getParameter("create"));

		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");
		response.setContentType("application/octet-stream");
		response.setStatus(HttpServletResponse.SC_OK);
		//response.getWriter().println("Hello World");
		TaskFactory tf = new TaskFactory();
		
	
		ObjectOutputStream out = new ObjectOutputStream(response.getOutputStream());
		out.writeObject(tf.getTask());
		out.flush();
		//response.getWriter().println(
				//( request.getAttribute("myCanvas")));
		System.out.println("Handled");
		

		baseRequest.setHandled(true);

	}

}
