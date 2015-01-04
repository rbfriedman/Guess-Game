package guessGame;

import java.awt.Canvas;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.LinkedList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JPanel;

import org.eclipse.jetty.client.HttpExchange;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;





public class MasterHttpHandler extends AbstractHandler  {
	private TaskFactory tf;
	private HandlerFactory handlerFactory;
	
	public MasterHttpHandler(TaskFactory tf){
		this.tf = tf;
		handlerFactory = new HandlerFactory();
	}
		
	@Override
	public void handle(String target, Request baseRequest,
			HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String user = request.getParameter("user");
		System.out.println(request.getAttribute(user));
		String pwd = request.getParameter("pwd");
		/*
		HttpSession session = request.getSession();
		Enumeration<String> g = session.getAttributeNames();
		while(g.hasMoreElements()){
			System.out.println(g.nextElement());
		}
		*/
		
		Task currentTask = getTask();
		request.setAttribute("Task", currentTask);
		handlerFactory.handleTask(currentTask ,target,  baseRequest,
				request, response);

		
=======
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class MasterHttpHandler extends AbstractHandler {

	private TaskFactory tf;

	public MasterHttpHandler(TaskFactory tf) {
		tf = new TaskFactory();
	}

	@Override
	public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		final String user = request.getParameter("user");
		System.out.println(request.getAttribute(user));
		final String pwd = request.getParameter("pwd");

		/*
		 * HttpSession session = request.getSession(); Enumeration<String> g =
		 * session.getAttributeNames(); while(g.hasMoreElements()){
		 * System.out.println(g.nextElement()); }
		 */

		response.setContentType(tf.getTask());
		response.setStatus(HttpServletResponse.SC_OK);
		// response.getWriter().println("Hello World");
		// HttpExchange g = new HttpExchange(null, null, null);

		final ObjectOutputStream out = new ObjectOutputStream(response.getOutputStream());

		out.writeObject(tf.getTask());
		out.flush();
		// response.getWriter().println(
		// ( request.getAttribute("myCanvas")));
		System.out.println("Handled");

		baseRequest.setHandled(true);

	}
	
	private Task getTask(){
		return tf.getTask();
	}

}
