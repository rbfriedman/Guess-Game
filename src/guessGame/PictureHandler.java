package guessGame;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Request;


public class PictureHandler extends MasterHttpHandler{

	public PictureHandler() {
		super();
		System.out.println("Handled with pic server");
	}
	@Override
	public void handle(String target, Request baseRequest,
			HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		System.out.println("Pic handler");
	}

}
