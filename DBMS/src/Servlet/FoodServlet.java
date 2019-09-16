package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;
import Models.Food;
import DaoImpl.FoodDaoImpl;
/**
 * Servlet implementation class FoodServlet
 */
@WebServlet("/FoodServlet")
public class FoodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FoodServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		//HttpSession session = request.getSession();

		Food food = new Food();
		List<Food> foods=new ArrayList<Food>();
		//Food food2 = new Food();
		FoodDaoImpl daoImpl=new FoodDaoImpl();
		System.out.printf("haha\n");
		System.out.printf("you inputed foodid:"+request.getParameter("foodId")+"\n");
	
		//System.out.printf("you inputed foodName:",session.getAttribute("foodId").toString()+"\n");
		
		Integer foodId = request.getParameter("foodId") != null && !request.getParameter("foodId").equals("") ? Integer.parseInt(request.getParameter("foodId")) : null;
		//String foodName = request.getParameter("foodName");
		//String salt = request.getParameter("salt");
		//String beef = request.getParameter("beef");
	
		food.setFoodId(foodId);
		//food.setFoodName(foodName);
		//food.setSalt(salt);
		//food.setBeef(beef);
		System.out.printf("food对象的id为:"+food.getFoodId()+"\n");
		foods=daoImpl.findFood(food);
		System.out.printf("servlet获取到的foodName为:"+foods.get(0).getFoodName());


		response.setCharacterEncoding("utf-8");
		response.setContentType("text;charset=utf-8"); 
		request.getRequestDispatcher("result.jsp").forward(request,response);
		
		PrintWriter out = response.getWriter(); 
		out.print(1);
		out.flush();
		out.close();

		
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
