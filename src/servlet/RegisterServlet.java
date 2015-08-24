package servlet;

import dao.UserDao;
import model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by kinglin on 2015/8/18.
 */
public class RegisterServlet extends HttpServlet{

    private RequestDispatcher requestDispatcher = null;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserDao userDao = new UserDao();

        User user = new User(req.getParameter("username"),req.getParameter("password"));

        String registerResult = userDao.add(user);

        requestDispatcher = req.getRequestDispatcher("register_result.jsp");
        req.setAttribute("registerResult",registerResult);
        requestDispatcher.forward(req,resp);
    }
}
