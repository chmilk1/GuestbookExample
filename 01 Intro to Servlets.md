Introduction to Servlets using Google App Engine and IntelliJ IDEA
------------------------------------------------------------------
Preconditions:
--------------
1. IntelliJ IDEA is installed and licensed.
2. Google App Engine SDK is downloaded and available.

Instructions:
-------------
1. Create a new "HelloWorld" Google App Engine project.
    1. New Project… → Java Enterprise → Google App Engine
    2. Project SDK: 1.7 if available
    3. Select Persistence: JDO 3

2. Create a new HelloWorldServlet
    4. Select the ‘src’ folder
    5. File → New → Servlet
    A servlet class is created. The web.xml is also updated with the servlet definition. We’ll get back to that later.
    
3. Output "Hello, World!" in the servlet doGet method
    6. Create an java.io.PrintWriter and set it equal to the response writer.
    7. Send output to the print writer as you would to System.out.

4. Create a **&lt;servlet-mapping&gt;** in web.xml following the **&lt;/servlet&gt;** tag.
	*Hint: use autocomplete to allow the IDE to create the entire servlet-mapping block.*
    8. The servlet name is the same as in your &lt;servlet&gt;
    9. The url pattern is a relative URL like "/hello-world".

5. Configure the build
    10. File → Project Structure → Artifacts
    11. Check "Build on make"

6. View in browser
    12. Point browser to [http://localhost:8080](http://localhost:8080) 
    13. Point browser to [http://localhost:8080/hello-world](http://localhost:8080/hello-world) (or your URL)

7. Working with data
    15. Add an integer named counter to your servlet initialized to 0
    16. Increment the value in the doGet() method
    17. Output these the value to the web page

8. Check the page from a web browser
    18. What happens when you reload the page?
    19. What happens if you use a different browser?

9. Add a parameter
    21. What happens if you type [http://localhost:8080/hello-world?number=5](http://localhost:8080/hello-world?number=5) 
    22. Look at the request parameter and see if you can get access to the arguments (hint: it’s called a query string)
    23. Look at other request methods like getParameterNames()
    24. Attempt to get the number value using the request.getParameter method. Increment your counter variable using that value. What happens if you don't supply a number parameter?

10. Change your page to output html
    24. Add response.setContentType("text/html"); at the top of doGet()
    25. Change doGet to write html content, the first thing you output must be the beginning &lt;html&gt; tag or a DOCTYPE tag. Look on the web for a hello world example if you have not written HTML before.

