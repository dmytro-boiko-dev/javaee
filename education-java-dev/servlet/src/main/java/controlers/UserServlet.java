package controlers;

import com.google.gson.Gson;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserServlet extends HttpServlet{
    private List<User> userList = new ArrayList<>();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.println("hello from servlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        //and this is back from client to backend
//        BufferedReader reader = req.getReader();
//        //here we use StringBuffer because it is mutable
//        StringBuffer bodyFromClient = new StringBuffer("");
//        String buf = "";
//        while((buf = reader.readLine()) != null){    //<-- read response from client while it is not null
//            bodyFromClient.append(buf);
//        }
//
//        //here we create representative of Gson; and write inside what we got from bodyFromClient
//        //so, bodyFromClient is transformed into User; MAGIC
//        Gson gson = new Gson();
//        User user = gson.fromJson(bodyFromClient.toString(), User.class);
//
//        userList.add(user); //add current user to the list of users
//
//
//        resp.setStatus(200);
//        //writer.println("hello from POST");
//        PrintWriter writer = resp.getWriter(); //<-- this is for client, so we use Writer
//        //writer.println();
//        writer.println(userList.stream().map(usr -> usr.getName()).collect(Collectors.toList()));


        //dependent to JSP page
        String name = req.getParameter("name"); //get name from request
        User user = new User(name); // create new user
        userList.add(user); //add user to list
        req.setAttribute("userList", userList);
        req.getRequestDispatcher("/users.jsp").forward(req, resp); //back to user.jsp

    }
}
