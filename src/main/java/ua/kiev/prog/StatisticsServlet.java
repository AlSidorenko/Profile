package ua.kiev.prog;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created on 16.12.2019 13:15.
 *
 * @author Aleks Sidorenko (e-mail: alek.sidorenko@gmail.com).
 * @version Id$.
 * @since 0.1.
 */
public class StatisticsServlet extends HttpServlet {

    private Map<String, Map<String, Integer>> statistic = new HashMap<>();

    @Override
    public void init() throws ServletException {
        super.init();
        statistic.put("First", new HashMap<String, Integer>());
        statistic.put("Second", new HashMap<String, Integer>());
        statistic.put("Third", new HashMap<String, Integer>());

        statistic.get("First").put("Male", 0);
        statistic.get("First").put("Female", 0);

        statistic.get("Second").put("English", 0);
        statistic.get("Second").put("Deutsch", 0);
        statistic.get("Second").put("French", 0);

        statistic.get("Third").put("Yes", 0);
        statistic.get("Third").put("No", 0);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String gender = req.getParameter("gender");
        String language = req.getParameter("language");
        String children = req.getParameter("children");

        Map<String, Integer> question1 = statistic.get("First");
        Integer count1 = question1.get(gender);
        if (count1 != null) {
            question1.put(gender, count1 + 1);
        }

        Map<String, Integer> question2 = statistic.get("Second");
        Integer count2 = question2.get(language);
        if (count2 != null) {
            question2.put(language, count2 + 1);
        }

        Map<String, Integer> question3 = statistic.get("Third");
        Integer count3 = question3.get(children);
        if (count3 != null) {
            question3.put(children, count3 + 1);
        }

        req.setAttribute("statistic", statistic);

        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher("/statistic.jsp");
        dispatcher.forward(req, resp);
    }
}
