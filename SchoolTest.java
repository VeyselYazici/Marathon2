package com.bilgeadam.boost.marathon2.veyselyazici;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class SchoolTest {
	List<SchoolEmployee> employees;
	List<SchoolEmployee> formerEmployees;
	List<Student> students;
	
	
	public SchoolTest()
	{
		employees = new ArrayList<>();
		formerEmployees = new ArrayList<>();
		students = new ArrayList<>();
	}
	public static void main(String[] args) 
	{
		SchoolTest school = new SchoolTest();
		System.out.println("Okul Programima Hosgeldiniz. Menuye yonlendiriliyorsunuz.");
		school.menu();
		System.out.println("Bye Bye");
		
	}
	
	private void menu() 
	{
		Scanner in = new Scanner(System.in);
		int menuCohice = 0;
		displayMenu();
		boolean cikis = true;
		
		while(cikis)
		{
			System.out.print("Lutfen yapmak istediginiz islemi seciniz: ");
			menuCohice = in.nextInt();
			switch (menuCohice) 
			{
			case 1:
				initEmployee();
				break;
			case 2:
				listEmployee();
				break;
			case 3:
				formerEmploye();
				break;
			case 4:
				createClass();
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 10:
				System.out.print("Cikmak istediginize eminseniz 0'a basiniz: ");
				menuCohice = in.nextInt();
				if (menuCohice == 0)
				{
					System.out.print("Programdan ciktiniz.");
					cikis = false;
					break;
				}
				else
				{
					continue;
				}
			default:
				break;
			}
		}
		in.close();
		
	}
	private void createClass() 
	{
		
		
	}
	private void formerEmploye() 
	{
		
		for (SchoolEmployee schoolEmployee : formerEmployees) 
		{
			System.out.println(schoolEmployee);
			System.out.println("Iste Calistigi Sure(Yil-Ay-Gun): " + schoolEmployee.workTime());
		}
		
	}
	private void displayMenu() 
	{
		System.out.println("===================");
		System.out.println("1. Calisan olustur.");
		System.out.println("2. Calisan listesini goruntule.");
		System.out.println("3. Eski calisanlari goruntule.");
		System.out.println("4. Yeni sinif olustur.");
		System.out.println("5. Ogrenci ata.");
		System.out.println("6. Sinif bilgisi gosterme.");
		System.out.println("7. Ogrencinin katildigi siniflar");
		System.out.println("8. Hediye listesi goruntule");
		System.out.println("9. Maas listesi goruntule");
		System.out.println("10. Programdan cikis");
		
	}
	
	private void listEmployee() 
	{
		this.employees.stream()
		.forEach(employee -> System.out.printf("%s - %2d - %s\n",employee.getEmployeepositions()
					, employee.getRegistrationNumber(), employee.getName()));
	}
	
	private void initEmployee() 
	{
		employees.add(new SchoolEmployee("Ali", "Veli", "Erkek", LocalDate.of(1990, 5, 5), LocalDate.of(2021, 5, 5), 0532, 0312, 
				EmployeePosition.TEACHER, 7000, "asdf", true));
		employees.add(new SchoolEmployee("Veli", "Veli", "Erkek", LocalDate.of(1990, 5, 5), LocalDate.of(2021, 5, 5), 0532, 0312, 
				EmployeePosition.TEACHER, 7000, "asdf", true));
		
		formerEmployees.add(new SchoolEmployee("Zehra", "Fatma", "Kiz", LocalDate.of(1990, 5, 5), LocalDate.of(2020, 5, 5), 0532, 0312, 
				EmployeePosition.OFFICIAL, 7000, "asdf", false, LocalDate.of(2022, 6, 6)));
		formerEmployees.add(new SchoolEmployee("Ayse", "Fatma", "Kiz", LocalDate.of(1990, 5, 5), LocalDate.of(2018, 5, 5), 0532, 0312, 
				EmployeePosition.OFFICIAL, 7000, "asdf", false, LocalDate.of(2021, 4, 4)));
		
		students.add(new Student("Sefa", "Uzun", "Erkek", LocalDate.of(1990, 2, 2), LocalDate.of(2021, 4, 4), 532, 321, 535, false));
		students.add(new Student("Aleyna", "Kisa", "Kiz", LocalDate.of(1995, 9, 9), LocalDate.of(2022, 2, 2), 531, 312, 532, false));
		
		
		
	}

}
