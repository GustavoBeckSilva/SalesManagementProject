package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {


		Department dpt = new Department(1, "Books");
		Seller seller = new Seller(2, "John", "john@gmail", new Date(), 3000.0, dpt);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		System.out.println(seller);
	}

}
