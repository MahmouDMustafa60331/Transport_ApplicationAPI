// package com.example.demo.Core;

// import java.util.Scanner;

// public class Main {

// 	public static void main(String[] args) {


// 		Admin admin = new Admin();
// 		Driver d = new Driver();
// 		LocalSaving ls = new LocalSaving();
// 		Passenger_Manager pm = new Passenger_Manager();
// 		pm.SetDBSmethod(ls);
// 		Driver_Manager dm = new Driver_Manager();
// 		dm.SetDBSmethod(ls);
// 		Ride_Manager rm = new Ride_Manager();
// 		rm.SetDBSmethod(ls);
// 		int foption;
// 		int soption;
// 		int poption;
// 		int doption;
// 		boolean i = true;

// 		System.out.print("Welcome to the Transportaion App\n");
// 		while (i) {
				
			
// 		System.out.print("Please choose a type:\n");
// 		System.out.print("1- Passenger\n2- Driver\n3- Exit\n");
// 		Scanner in = new Scanner(System.in);

			
		
// 		foption=in.nextInt();
			
			
				
			

// 		switch(foption)
// 		{
//    			 	case 1 :
					
// 					System.out.println("How can I help you?");
// 					System.out.println("1-Register\n2-Login");
					
// 					soption=in.nextInt();
// 					Passenger p = new Passenger(); 

// 					//Register and login cases

// 					switch (soption) {
// 						case 1: //Register

// 							pm.Register(p);
// 							pm.UpdatePassenger(p);
						
// 						case 2: //Login
							
							
							
// 							pm.login();
// 							System.out.println("press 1 to request a ride");
// 							poption=in.nextInt();
// 							switch (poption) {
// 								case 1:

// 									Scanner on = new Scanner(System.in);
// 									Ride ride = new Ride();
// 									System.out.println("enter the source");
// 									String s = on.nextLine();
// 									System.out.println("enter the destination");
// 									String dis = on.nextLine();
// 									ride.RequestRide(s,dis);
// 									rm.UpdateRide(ride);
// 									break;

// 								default:
// 									System.out.println("Wrong Choice!");
// 									break;
// 							}
// 							break;
					
// 						default:
// 							System.out.println("Wrong Choice!");
// 							break;
// 					}
					
// 				break;
// 				case 2 :

					
// 					System.out.println("How can I help you?");
// 					System.out.println("1-Register\n2-Login");



// 					//Register and login cases
// 					soption=in.nextInt();
// 					switch (soption) {
						
// 						case 1: //Register
// 							dm.Register(d);
// 							dm.UpdatePending(d);
// 							admin.verifyDriver(d);
// 							dm.UpdateVerfied(d);		
// 						case 2: //Login
						
// 							dm.login();
// 							System.out.println("Choose what you want:\n1- Add a Favorite Area\n2- List rides within one of you favorite areas\n");
// 							doption=in.nextInt();
// 							switch (doption) {
// 								case 1: //Add Favorite Area
// 									System.out.println("Enter the Area");

// 									Scanner on = new Scanner(System.in);
// 									String area = on.nextLine();
// 									d.AddFavArea(area);
									
// 									break;
// 								case 2:
// 									System.out.println(d.getRides());
// 									break;

// 								default:
// 									System.out.println("Wrong Choice!");
// 									break;
// 							}
							
// 							break;
// 						default:
// 							System.out.println("Wrong Choice!");
// 							break;
// 					}
// 					break;
// 				case 3:
// 					i=false;
// 					break;	
//    			 	default : 
// 					System.out.println("Wrong Choice!");
//       		 		break;
// 			}
// 		}
		
			 
// 	}

// }
