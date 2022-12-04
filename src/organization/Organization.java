package organization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Bhavesh_gupta.ConsoleInput;
import exercise12.LinkedList;
import newLinkList.LinkedList1;

public class Organization {

	public static void main(String[] args) {
		LinkedList1<Employee> objList = new LinkedList1<>();
		int choice = 1;
		while (choice != 7) {
			System.out.println("\n1.Add \n2.Display\n3.Sort\n4.Delete" + "\n5.Load" + "\n6.Save" + "\n7.Exit");
			System.out.print("Enter your choice :");
			choice = ConsoleInput.getInteger();

			switch (choice) {
			case 1: {
				int j = 0;
				while (j == 0) {

					System.out.println("\nAdd " + "\n1.Manager\n2.Engineer\n3.SalesPerson\n4.Exit to main menu");
					System.out.println("Enter your choice :");
					int option = ConsoleInput.getInteger();

					if (option > 0 && option < 4) {
						System.out.println("enter the Name");
						String name = ConsoleInput.getstring();

						System.out.println("enter the age");
						int age = ConsoleInput.getInteger();

						System.out.println("enter the gender (male=true or female=false)");
						boolean gender = ConsoleInput.getBoolean();

						System.out.println("enter the address");
						String address = ConsoleInput.getstring();

						System.out.println("enter the Basic Salry");
						int basicSalary = ConsoleInput.getInteger();

						if (option == 1) {
							System.out.println("enter the HRA");
							int hra = ConsoleInput.getInteger();
							Manager objManager = new Manager(name, address, age, gender, basicSalary, hra);
							objList.add(objManager);

						} else if (option == 2) {
							System.out.println("enter the Over Time");
							int overTime = ConsoleInput.getInteger();
							Engineer objEngineer = new Engineer(name, address, age, gender, basicSalary, overTime);
							objList.add(objEngineer);
						} else if (option == 3) {
							System.out.println("enter the commission");
							int commision = ConsoleInput.getInteger();
							SalesPerson objSalesP = new SalesPerson(name, address, age, gender, basicSalary, commision);
							objList.add(objSalesP);
						}

					} else
						j++;

				}

			}
				break;
			case 2: {
				int j = 0;
				while (j == 0) {

					System.out.println(
							"\nDisplay " + "\n1.Managers\n2.Engineers\n3.Sales Persons\n4.All\n5.Exit to main menu");
					System.out.println("Enter your choice :");
					int option = ConsoleInput.getInteger();

					switch (option) {
					case 1: {
						Employee objEmployee =  objList.getFirst();

						System.out.println("************************");
						System.out.println("LIST OF MANAGERS");
						while (objEmployee != null) {

							if (objEmployee instanceof Manager) {

								System.out.println(objEmployee.toString());
							}

							objEmployee =  objList.getNext();
						}

					}
						break;
					case 2: {
						Employee objEmployee =  objList.getFirst();
						System.out.println("************************");
						System.out.println("LIST OF ENGINEERS");
						while (objEmployee != null) {
							if (objEmployee instanceof Engineer) {

								System.out.println(objEmployee.toString());

							}

							objEmployee =  objList.getNext();
						}
					}
						break;
					case 3: {
						Employee objEmployee =  objList.getFirst();
						System.out.println("************************");
						System.out.println("LIST OF SALES PERSONS");
						while (objEmployee != null) {
							if (objEmployee instanceof SalesPerson) {

								System.out.println(objEmployee.toString());

							}

							objEmployee =  objList.getNext();
						}
					}
						break;
					case 4: {
						Employee objEmployee =  objList.getFirst();
						System.out.println("LIST OF ALL MANAGERS, ENGINEERS, Sales PERSONS");
						System.out.println("********************************************");
						while (objEmployee != null) {

							if (objEmployee instanceof Manager) {

								System.out.println(objEmployee.toString());
								System.out.println("********************************************");
							} else if (objEmployee instanceof Engineer) {

								System.out.println(objEmployee.toString());
								System.out.println("********************************************");
							} else if (objEmployee instanceof SalesPerson) {
								System.out.println("LIST OF SALES PERSONS");
								System.out.println(objEmployee.toString());

							}

							objEmployee =  objList.getNext();
						}

					}

						break;
					case 5:
						j++;
						break;
					default: {
						System.out.println("invalid Choice");

					}
						break;
					}
				}
			}
			case 6: {
				Employee objEmployee =  objList.getFirst();

				FileOutputStream fileOutputStream = null;
				ObjectOutputStream objOutputStream = null;

				try {
					fileOutputStream = new FileOutputStream("D:\\Images\\Employee.txt");
					objOutputStream = new ObjectOutputStream(fileOutputStream);
					objOutputStream.writeObject(objEmployee);
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

			case 5: {
				//Employee objEmployee =  objList.getFirst();
				FileInputStream fileInputStream = null;
				ObjectInputStream objInputStream = null;
				try {

					fileInputStream = new FileInputStream("D:\\Images\\Employee.txt");
					objInputStream = new ObjectInputStream(fileInputStream);
					Employee objEmployee1 = (Employee) objInputStream.readObject();
					while (objEmployee1 != null) {

						System.out.println(objEmployee1.toString());

						objEmployee1 =  objList.getNext();
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
			default: {
				System.out.println("invalid Choice");

			}
				break;

			}

		}
	}
}