package org.big.university;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


import newLinkList.LinkedList1;

public class University {

	public static void main(String[] args) {
		LinkedList1<Student> objList = new LinkedList1<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enroll for the following courses");
		int k = 0;
		int choice = 1;
		while (k == 0) {
			System.out.println("\n1.Enroll for the courses\n2.Save\n3.Load\n4.Exit");
			System.out.print("Enter your choice :");
			choice = sc.nextInt();

			switch (choice) {

			case 1: {
				int j = 0;
				while (j == 0) {

					System.out.println("\n1.Engineering\n2.Medical\n3.MBA\n4.Exit to main menu");
					System.out.println("Enter your choice :");
					int option = sc.nextInt();

					if (option > 0 && option < 4) {
						System.out.println("enter the Name");
						String name = sc.next();
						System.out.println("Enter the Date of Birth in DD-MM-YYYY Format ");
						String dateOfBirth=sc.next();

						System.out.println("enter the gender ");
						String strGender = sc.next();
						boolean gender;
						if (strGender.equalsIgnoreCase("male"))
							gender = true;
						else
							gender = false;

						System.out.println("enter the address");
						String address = sc.next();
						if (option == 1) {
							System.out.println("enter the Elective 1");
							String elective_1 = sc.next();
							System.out.println("enter the Elective 2");
							String elective_2 = sc.next();
							EngineeringStudent objEngineeringStudent = new EngineeringStudent(name,dateOfBirth,
									gender, address, elective_1, elective_2);
							objList.add(objEngineeringStudent);
						} else if (option == 2) {
							System.out.println("enter the Specialization");
							String specialization = sc.next();
							MedicalStudent objMedicalStudent = new MedicalStudent(name, dateOfBirth, gender,
									address, specialization);
							objList.add(objMedicalStudent);
						} else if (option == 3) {
							System.out.println("enter the Year of Experience");
							int experience = sc.nextInt();
							System.out.println("Enter the Graduation details");
							String graduation_details = sc.next();
							MBAStudent objMBAStudent = new MBAStudent(name, dateOfBirth, gender, address,
									experience, graduation_details);
							objList.add(objMBAStudent);

						}

					} else
						j++;
				}
			}
				break;
			case 2: {
				Student objStudent = (Student) objList.getFirst();

				FileOutputStream fileOutputStream = null;
				ObjectOutputStream objOutputStream = null;
				try {
					System.out.println("Enter the file name");
					String fileName = sc.next();
					fileOutputStream = new FileOutputStream(fileName);
					objOutputStream = new ObjectOutputStream(fileOutputStream);
					objOutputStream.writeObject(objStudent);
					System.out.println("Data Written");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					if (objOutputStream != null)
						try {
							objOutputStream.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

				}
			}
				break;
			case 3: {

				Student objStudent = (Student) objList.getFirst();
				FileInputStream fileInputStream = null;
				ObjectInputStream objInputStream = null;
				try {
					System.out.println("Enter the file name");
					String fileName = sc.next();

					fileInputStream = new FileInputStream(fileName);
					objInputStream = new ObjectInputStream(fileInputStream);
					Student objStudent1 = (Student) objInputStream.readObject();
					while (objStudent1 != null) {

						System.out.println(objStudent1.toString());
						System.out.println(objStudent1.getDateOfBirth().toString());

						objStudent1 = (Student) objList.getNext();
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					if (fileInputStream != null)
						try {
							fileInputStream.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}

			}
				break;
			case 4:
				k++;
				break;
			default: {
				System.out.println("invalid Choice");

			}
				break;

			}
		}
	}

}
