package guessGame;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.session.HashSessionIdManager;
import org.eclipse.jetty.server.session.HashSessionManager;
import org.eclipse.jetty.server.session.SessionHandler;

<<<<<<< HEAD
public class HttpServer {

	private final Server server;
	private final HashSessionIdManager sessionIdManager;
	private final ContextHandler context;
	final HashSessionManager manager;
	final SessionHandler sessions;

	public HttpServer() throws Exception {
		server = new Server(8080);
		sessionIdManager = new HashSessionIdManager();
		context = new ContextHandler("/");
		manager = new HashSessionManager();
		sessions = new SessionHandler(manager);
		context.setHandler(sessions);

		server.setSessionIdManager(sessionIdManager);

=======
import com.sun.media.jfxmedia.logging.Logger;


public class HttpServer {
	public static void main(String args[]) throws Exception {
		Server server = new Server(8080);
		 // Specify the Session ID Manager
		
        HashSessionIdManager sessionIdManager = new HashSessionIdManager();
       
        //server.setSessionIdManager(idmanager);

        // Sessions are bound to a context.
        ContextHandler context = new ContextHandler("/");
        //server.setHandler(context);

        // Create the SessionHandler (wrapper) to handle the sessions
        HashSessionManager manager = new HashSessionManager();
        SessionHandler sessions = new SessionHandler(manager);
        context.setHandler(sessions);
	    //ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
		//ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        //context.setContextPath("/");
        //server.setHandler(h);
        server.setSessionIdManager(sessionIdManager);
 /*
        context.addServlet(new ServletHolder(new HelloServlet()),"/*");
        context.addServlet(new ServletHolder(new HelloServlet("Buongiorno Mondo")),"/it/*");
        context.addServlet(new ServletHolder(new HelloServlet("Bonjour le Monde")),"/fr/*");
 */	
>>>>>>> origin/master
		server.setHandler(new MasterHttpHandler());
		server.start();
		server.join();
	}

<<<<<<< HEAD
	public static void main(String args[]) throws Exception {
		new HttpServer();
	}

=======
>>>>>>> origin/master
}
