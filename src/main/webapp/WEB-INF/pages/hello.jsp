
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head><title>SpringStart</title></head>
  <body>
  Hello <%= request.getAttribute("name")%>

  <p><img src="http://www.elcivics.com/esl/images/esl-lesson-greetings.jpg"></p>
  <p> Let's go back!  Just push it:) ▐ ☻▐ </p>

 <p>
  <form action="/test2.form" method="get">
      <input type="submit">
  </form>
  </p>

  </body>
</html>
