package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		
		/* SellerDao sellerDao = DaoFactory.createSellerDao();
				
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
		
		*/


		Scanner sc = new Scanner(System.in);
 		
 		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
 
 		System.out.println("=== TEST 1: findById ======="); 
 		Department dep = departmentDao.findById(4);
 		System.out.println(dep);
 		
 		
 		System.out.println("\n=== TEST 2: findAll ======="); 
 		List<Department> list = departmentDao.findAll();
 		for (Department d : list) {
 			System.out.println(d);
 		}
 
 		System.out.println("\n=== TEST 3: insert =======");
 		Department newDepartment = new Department(null, "Music");
 		departmentDao.insert(newDepartment);
 		System.out.println("Inserted! New id: " + newDepartment.getId());
 
 
 		
 		System.out.println("\n=== TEST 4: update ======="); 
 		Department dep2 = departmentDao.findById(1);
 		dep2.setName("Food");
 		departmentDao.update(dep2);
 		System.out.println("Update completed"); 		
 		
 		System.out.println("\n=== TEST 5: delete =======");
 		System.out.print("Enter id for delete test: ");
 		int id = sc.nextInt();
 		departmentDao.deleteById(id);
 		System.out.println("Delete completed");
 		
 		sc.close();
	}

}
