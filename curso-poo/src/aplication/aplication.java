package aplication;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import model.WorkerLevel;

public class aplication {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter department's name:");
		String nameD = sc.nextLine();
		Department department = new Department(nameD);
		System.out.println("Enter worker data:");
		System.out.println("Name:");
		String nameW = sc.next();
		System.out.println("Level:JUNIOR,MID_LEVEL,SENIOR");
		String levelSc = sc.next();
		WorkerLevel level = WorkerLevel.valueOf(levelSc);
		System.out.println("Base Salary:");
		Double baseSalary = sc.nextDouble();
		Worker worker = new Worker(nameW, level, baseSalary, department);
		
		System.out.println("How many contracts to this worker?");
		int N = sc.nextInt();
		for (int i=1;i<=N;i++) {
			System.out.println("Enter contract #" +i+" data:");
			System.out.println("Date (DD/MM/YYYY):");
			Date contractDate = sdf.parse(sc.next());
			System.out.println("Value per hour:");
			Double valuePerHour = sc.nextDouble();
			System.out.println("Duration (hours):");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate,valuePerHour,hours);
			worker.addContract(contract);
			
			


		}
		

	}

}
