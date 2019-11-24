<%@ page import="Model.Entities.Project" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Project dashboard</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
    <meta name="description" content="" />
    <meta name="keywords" content="" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/TemplateHtml/assets/css/main.css" />
</head>
<body>
<header id="header">
    <a class="logo" href="${pageContext.request.contextPath}/index.html">Leaf+</a>
    <a class="logo" href="StudProfile.html">My profile</a>
</header>
<section class="wrapper">
    <div class="inner">
        <header class="special">
            <h2>Projects</h2>
            <a class="logo"  href="filteredProjects.html">Filter by IT projects</a>
        </header>
        <div class="highlights">
        <%
            int i = 1;
            List<Project> projects = (List) request.getAttribute("projects");
            Iterator it = projects.iterator();
            while(it.hasNext()){
                Project project = (Project)it.next();
                String str =
                        "            <section>\n" +
                        "                <div class=\"content\">\n" +
                        "                    <header>\n" +
                        "                        <a href=\"#\" class=\"icon fa-files-o\"><span class=\"label\">Icon</span></a>";
                str += "<h3>"+ project.getTitle() + "</h3>";
                str += "</header>\n" + "<p>";
                str += project.getDetails();
                str += "<br>Status:" + project.getStatus();
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
</html>