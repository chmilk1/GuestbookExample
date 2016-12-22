Introduction to JSP
-------------------

 1. Create a JSP (Java Server Page)
    1. Reopen your HelloWorld project. 
    2. Select the web folder and create a new JSP file named HelloWorld
    3. Set the Title of the JSP page to Hello, World!
   
 2. Read parameter from request. 
    3. Open a code block by adding <% in the body of your JSP page.
    4. Read the value of a parameter named guestbookName into a String variable named guestbookName.  
   *Hint: see your servlet code for how to read a parameter, use the same objects and methods.*
    5. If the guestbookName parameter was not supplied, set the guestbookName variable equal to "default".
    6. Set the page context attribute guestbookName to the variable, guestbookName.
   
 3. Get a user from the UserService
    8. Create a new user service named userService using the UserServiceFactory.
    9. Store the current user from the user service into a variable name user.
   
 4. Add a block for when the current user is not null
   1. Add the user to the page context attribute “user”.
   2. End the code block using %>.  The **if** block will still be open, this is intentional,
   3. Add a greeting and sign out button:  
	 `<p>Hello, ${fn:escapeXml(user.nickname)}! (You can <a href="<%= userService.createLogoutURL(request.getRequestURI()) %>">sign out&lt;/a>.)</p>`
   4. Open a code block “<%” and close the if “}” 
   
 4. Add imports and tag library
    5. Use IntelliJ to resolve any remaining import errors.
    6. After the imports, add the following line to import the tag library  
   `<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>`

 5. Test
    6. Open [http://localhost:8080/HelloWorld.jsp](http://localhost:8080/HelloWorld.jsp) (It’s perfectly reasonable for the page to be blank, view source.) 
 
 6.  Add the else block to our login section
    8. Insert the following before our last code block.  
	 `<%   } else { %> <p>Hello! <a href="<%= userService.createLoginURL(request.getRequestURI()) %>">Sign in</a> to include your name with greetings you post.</p>`
    
 7. Test again, can you log in and log out?
    8. What happens if you log into a new tab?
    9. A new window? New browser?
 
 8. Bonus:
    1. Add css to the page In the header:    
    `<link type="text/css" rel="stylesheet" href="/stylesheets/main.css"/>`
    2. stylesheet folder goes under web contents:  
     `body {`
     `font-family: Verdana, Helvetica, sans-serif;`
     `background-color: #FFFFCC;`  
     `}`

