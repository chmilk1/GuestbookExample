import com.googlecode.objectify.ObjectifyService;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by league on 12/21/16.
 */
public class OfyHelper implements ServletContextListener{

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ObjectifyService.register(Guestbook.class);
        ObjectifyService.register(Greeting.class);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        throw new UnsupportedOperationException();
    }
}
