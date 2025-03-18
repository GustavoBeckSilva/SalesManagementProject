package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
				
		System.out.println("=== TEST 1: seller findById =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment =====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		
		for(Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println("\n=== TEST 3: seller findAll =====");
		list = sellerDao.findAll();
		
		for(Seller s : list) {
			System.out.println(s);
		}
		
		System.out.println("\n=== TEST 4: insert =====");
		Seller newSeller = new Seller(null, "Test", "test@gmail.com", new Date(), 4000.0, department);
		
		sellerDao.insert(newSeller);
		
		System.out.println(newSeller.getId());
		
		System.out.println("\n=== TEST 5: update =====");
		seller = sellerDao.findById(1);
		
		seller.setName("New Test");
		
		sellerDao.update(seller);
		
		System.out.println("Update done");
		
		System.out.println("\n=== TEST 6: delete =====");
		
		int id = 203;
		sellerDao.deleteById(id);
		System.out.println("Delete done");
	}

}
