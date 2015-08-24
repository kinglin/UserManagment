package servlet;

import dao.UserDao;
import model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by kinglin on 2015/8/18.
 */
public class LoginServlet extends HttpServlet{

    private RequestDispatcher requestDispatcher = null;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UserDao userDao = new UserDao();

        User user = new User(req.getParameter("username"),req.getParameter("password"));

        String loginResult = userDao.find(user);

        requestDispatcher = req.getRequestDispatcher("login_result.jsp");
        req.setAttribute("loginResult",loginResult);
        requestDispatcher.forward(req,resp);
    }
}
