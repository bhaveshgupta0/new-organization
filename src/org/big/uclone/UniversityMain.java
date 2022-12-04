package org.big.uclone;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import newLinkList.LinkedList1;

public class UniversityMain {

	public static void main(String[] args)
	{
		LinkedList1<Student1> objList = new LinkedList1<>();
		try (Scanner sc = new Scanner(System.in))
		
		{
			System.out.println("*******CDAC University********");
			int k = 0;
			int choice = 1;
			while (k == 0)
			{

				System.out.println("\n1.Enroll for the courses\n2.Save\n3.Load\n4.Exit");
				System.out.print("Enter your choice :");
				choice = sc.nextInt();
				switch (choice) {

				case 1:
				{
					int j = 0;
					while (j == 0)
					{

						System.out.println(
								"\nEnroll for the following Courses\n\n1.Engineering\n2.Medical\n3.MBA\n4.Exit to main menu");
						System.out.println("Enter your choice :");
						int option = sc.nextInt();

						if (option > 0 && option < 4)
						{

							System.out.println("enter the Name");
							String name = sc.next();
							System.out.println("Enter the Date of Birth in  ");

							System.out.println("Enter the Day");
							int day = sc.nextInt();
							System.out.println("Enter the Month");
							int month = sc.nextInt();
							System.out.println("Enter the year");
							int year = sc.nextInt();

							System.out.println("enter the gender ");
							String strGender = sc.next();
							boolean gender;
							if (strGender.equalsIgnoreCase("male"))
								gender = true;
							else
								gender = false;

							System.out.println("enter the address");
							String address = sc.next();

							if (option == 1)
							{

								System.out.println("enter the Elective 1");
								String elective_1 = sc.next();
								System.out.println("enter the Elective 2");
								String elective_2 = sc.next();
								EngineeringStudent1 objEngineeringStudent = new EngineeringStudent1(name, day, month,
										year, gender, address, elective_1, elective_2);
								objList.add(objEngineeringStudent);
							} else if (option == 2)
							{
								System.out.println("enter the Specialization");
								String specialization = sc.next();
								MedicalStudent1 objMedicalStudent = new MedicalStudent1(name, day, month, year, gender,
										address, specialization);
								objList.add(objMedicalStudent);
							} else if (option == 3)
							{
								System.out.println("enter the Year of Experience");
								int experience = sc.nextInt();
								System.out.println("Enter the Graduation details");
								String graduation_details = sc.next();
								MBAStudent1 objMBAStudent = new MBAStudent1(name, day, month, year, gender, address,
										experience, graduation_details);
								objList.add(objMBAStudent);

							}
						} else
							j++;
					}
				}
					break;
				case 2:
				{
					Student1 objStudent =  objList.getFirst();
					FileOutputStream fileOutputStream = null;
					ObjectOutputStream objOutputStream = null;

					try
					{
						System.out.println("Enter the file name");
						String fileName = sc.next();
						fileOutputStream = new FileOutputStream(fileName);
						objOutputStream = new ObjectOutputStream(fileOutputStream);
						objOutputStream.writeObject(objStudent);
						System.out.println("Data Saved");
					} catch (FileNotFoundException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally
					{
						if (objOutputStream != null)
							try
							{
								objOutputStream.close();
							} catch (IOException e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}

					}
				}
					break;

				case 3:
				{
					//3Student1 objStudent = (Student1) objList.getFirst();
					FileInputStream fileInputStream = null;
					ObjectInputStream objInputStream = null;

					try
					{
						System.out.println("Enter the file name");
						String fileName = sc.next();
						fileInputStream = new FileInputStream(fileName);
						objInputStream = new ObjectInputStream(fileInputStream);
						Student1 objStudent1 = (Student1) objInputStream.readObject();
						while (objStudent1 != null)
						{

							System.out.println(objStudent1.toString());

							objStudent1 = (Student1) objList.getNext();
						}
					} catch (FileNotFoundException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();

					} catch (ClassNotFoundException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally
					{
						if (fileInputStream != null)
							try
							{
								fileInputStream.close();
							} catch (IOException e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
					}
				}
					break;
				case 4:
					k++;
					break;
				default:
				{
					System.out.println("invalid Choice");

				}
					break;
				}
			}
		}
	}
}
