package guessGame;

import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.AbstractHandler;

public class JPEGResponseHandler extends AbstractHandler {

	@Override
	public void handle(String target, Request baseRequest,
			HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		response.setContentType(TaskFactoryType.JPEG.getDescription());

		response.setStatus(HttpServletResponse.SC_OK);
		// response.getWriter().println("Hello World");
		// HttpExchange g = new HttpExchange(null, null, null);

		ObjectOutputStream out = new ObjectOutputStream(
				response.getOutputStream());
		// request.getAttribute("Task") always returnd an Object - set in
		// MasterHandler
		out.writeObject(request.getAttribute("Task"));
		out.flush();
		// response.getWriter().println(
		// ( request.getAttribute("myCanvas")));
		System.out.println("Handled");
	}
}
