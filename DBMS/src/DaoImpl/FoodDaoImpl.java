package DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.FoodDao;
import Models.Food;
import util.JDBCUtil;
 
public class FoodDaoImpl implements FoodDao{

	public void addFood(Food food) {
	}
	public List<Food> showFood(Food food) {
		 List<Food> Foods = null;
		return Foods; 
	}
	
	public List<Food> findFood(Food food) {
		Food food2 = new Food();
		List<Food> foods = new ArrayList<Food>();

		StringBuffer strSQL=new StringBuffer();

	
		strSQL.append("select * from food where foodId=?");
		
		Connection conn=JDBCUtil.getConn();
		PreparedStatement stmt=null;
		ResultSet rs=null;
		try {
			stmt=conn.prepareStatement(strSQL.toString());
		    stmt.setInt(1, food.getFoodId());
		    
		    rs=  stmt.executeQuery();
//		    System.out.println("foodId为"+rs.toString().indexOf(1));
//		    System.out.println("foodName为"+rs.toString().indexOf(2));
//		    System.out.println("salt为"+rs.toString().indexOf(3));
//		    
//		    ResultSetMetaData rsmd = rs.getMetaData();
//		    int columnsNumber = rsmd.getColumnCount();
//		    while (rs.next()) {
//		        for (int i = 1; i <= columnsNumber; i++) {
//		            if (i > 1) System.out.print(",  ");
//		            String columnValue = rs.getString(i);
//		            System.out.print(columnValue + " " + rsmd.getColumnName(i));
//		        }
//		        System.out.println("");
//		    }
		
		    while(rs.next()){
		    	
			    System.out.println("foodid为"+rs.getInt(1));
			    System.out.println("foodName为"+rs.getString(2));
			    System.out.println("salt为"+rs.getString(3));
			    food2.setFoodId(rs.getInt(1));
			    food2.setFoodName(rs.getString(2));
				food2.setSalt(rs.getString(3));
				food2.setBeef(rs.getString(4));
				food2.setVinegar(rs.getString(5));
				System.out.println("要添加的食品为"+ food2.getFoodName());

				foods.add(food2);
		
			}
			System.out.println("查到的食品为"+foods.get(0).getFoodName());
		
		    
		  //  Foods=(List<Food>) rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			JDBCUtil.closeParam(null, null, stmt, conn);
		}
		
		return foods;
		
	}
	
	
	
	
	
}
