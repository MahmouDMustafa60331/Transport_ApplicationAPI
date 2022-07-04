# Project overview

In the current days the transportation technologies are growing rapidly. Therefore, in this 
project we are going to develop an application that helps users to communicate with car 
drivers to transport users to any area.
 
# Requirements backlog

1. The admin user should be able to verify driver registration. So the admin should be able to 
list all pending driver registrations and verify any pending driver registration.

2. The user should be able to register to the system. The user should provide username, 
mobile number, email (optional), and password. If the user is going to register to the 
system as a driver so the driving license and national id should be provided. The user 
should be able to login into the system once the registration is completed. If the user 
registers as a driver, so the user should be able to login into the system once the admin 
user verify the registration

3. The user should be able to request a ride given a source and a destination. For a simplicity 
user can enter the source area’s name and the destination area’s name.

4. The driver should be able to add some areas to get notification when any ride is requested 
and one of these areas is added as the source area. These areas will be called as “favorite 
areas”.

5. The driver should be notified if any new ride is requested from any area added as a 
“favorite area” to the driver.

6. The driver should be able to list all rides with source area within one of the driver’s favorite 
areas. The driver should be able to suggest a price to this ride and notify the user with this 
price. Each price suggestions is called an “offer”

7. The user should be notified if any new price is added to the requested ride. So the user 
should be able to list all ride offers and check the driver details for each offer.

8. The user should be able to select a specific offer for the requested ride. By this selection 
the corresponding driver (who put the selected price) should be notified that the user 
accepts the suggested ride price.

9. The system should calculate the distance and estimate time arrival (ETA) with the help of 
google maps API

10. The system should track number of calls to google maps API if it’s exceeded specific 
number of calls. The system should change the way to calculate ETA by using harvesine 
distance to calculate the distance between the source area and the destination area then 
divide this distance by the speed (Assume 60 KM/H speed).

11. The driver should be able to end the ride once the ride is finished and the ride should be 
added to the rides history. The ride cost should be added to the driver balance.

12. The user should be able to rate any completed ride requested before by the user. 

13. The driver should be able to announce any new ride. To announce a ride the driver will 
provide the ride details (Title, description, ride source, destination, time to leave, and cost).

14. The user should be able to list the rides announced by the drivers and register to any ride. 
Once the user register to a specific ride the driver should be notified.

# Class Diagram

![Blank diagram - Page 1](https://user-images.githubusercontent.com/94802915/177206120-a45ef930-2a07-491a-85a5-e586894967b7.png)
