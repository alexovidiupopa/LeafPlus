<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="Model.Entities.Student" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Student dashboard</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
    <meta name="description" content="" />
    <meta name="keywords" content="" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/TemplateHtml/assets/css/main.css" />
</head>
<body>
<header id="header">
    <a class="logo" href="${pageContext.request.contextPath}/index.html">Leaf+</a>
    <a class="logo" href="ClientProfile.html">My profile</a>
</header>
<section class="wrapper">
    <div class="inner">
        <header class="special">
            <h2>Students</h2>
        </header>
        <div class="highlights">
            <%
                int i = 1;
                List<Student> projects = (List) request.getAttribute("students");
                Iterator it = projects.iterator();
                while(it.hasNext()){
                    Student student = (Student) it.next();
                    String str =
                            "            <section>\n" +
                                    "                <div class=\"content\">\n" +
                                    "                    <header>\n" +
                                    "                        <a href=\"#\" class=\"icon fa-vcard-o\"><span class=\"label\">Icon</span></a>";
                    str += "<h3>"+ student.getFname() + " " + student.getLname() + "</h3>";
                    str += "</header>\n" + "<p>";
                    str += "Studies: " + student.getStudies();
                    str += "<br>Email: " + student.getEmail();
                    str += "<br>Rating: " + student.getRating() + " / 5";
                    str +=  "                 </p>\n" +
                            "                </div>\n" +
                            "            </section>";
                    if(i == 3) {
                        //TODO: get a PhD in this
                        i = 1;
                    }
                    out.println(str);
                }
            %>
        </div>
    </div>
</section>

</body>
