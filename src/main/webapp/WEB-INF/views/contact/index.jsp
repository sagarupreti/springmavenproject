<%-- 
    Document   : index
    Created on : Dec 21, 2018, 3:19:07 PM
    Author     : ideapad-520S
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        <h1>Hello World!</h1>
        <form method="post" action="">
            <div>
                <label>Name</label>
                <input type="text" name="name" required="required"/>
            </div>
            <div>
                <label>Email</label>
                <input type="email" name="emial" required="required"/>
            </div>
            <div>
                <label>Subject</label>
                <input type="text" name="subject" required="required"/>
            </div>
            <div>
                <label>Message</label>
                <textarea name="message" required="required" style="height:200px"></textarea>
            </div>
            <div>
                <label>
                    <input type="checkbox" name="sendMe"/>
                    send me a copy
                </label>
            </div>
            <button type="submit" name="submit">Send</button>
        </form>
    </body>
</html>
