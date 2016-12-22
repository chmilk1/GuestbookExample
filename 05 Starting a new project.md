Starting a New Google App Engine Maven Project
==============================================
**Prerequistes**: Before starting this project your team should decide on a group name and project name. The group name will be used in the groupId which will typically take the form of org.jointheleague.<group-name> and the project name will become the artifactId. These names should follow maven naming conventions and be all lowercase, no special characters and use hyphens to separate words.

1. Fix an IntelliJ IDEA configuration problem.
    1. Open the IDEA settings dialog.
    2. Select Build, Exectution, Deployment > Build Tools > Maven > Importing
    3. Change the VM options for importing to `-Xmx1024m` the default value is too small.

2. Create a new Maven project.
    1. File > Project... > Maven
    2. Check Create from Archetype
    3. Add or Select Archetype
        1. GroupId: com.google.appengine.archetypes
        2. ArtifactId: skeleton-archetype
        3. Version: 1.7.5
    4. Specify your GroupId and ApplicationId
    5. Add additional variables:
        1. appengine-version: 1.9.46
        2. application-id: your-app-id (normally you would get this from Google App Engine dashboard before creating the project)
    6. Specify the name and location for your new project for IDEA and create the project.
    
    At this point it may take some time for IDEA to create your project. However this is significantly less time than it would have taken you to do the same amount of work. If prompted, import your maven changes.

3. Check the Java version
Although we are using the Java 1.8 SDK, GAE still limits us to 1.7 language features. We need to ensure that is how our code is compiled
    1. In the `<properties>` block of the pom, add or modify `<maven.compiler.source>`, set it to 1.7.
    2. Repeat for `<maven.compiler.target>`.

4. IDEA should recognize the project as a Google App Engine project. Allow it to configure the project.

5. Run the project
    1. Create a simple index.jsp, here is a boring one:
    
         ```xml
         <html>
         <head>
             <title>Sample Application JSP Page</title>
         </head>
         
         <body bgcolor=white>
         
         <br />
         <p>This is the output of a JSP page that is part of the HelloWorld application.</p>
         
         <%= new String("Hello!") %>
         
         </body>
         </html> 
         ```
    2. Hit the run button, a run configuration should have been automatically created.
    
