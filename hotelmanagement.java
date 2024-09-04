package hotel.java;  	import java.util.ArrayList; 
 	import java.util.Scanner; 
 
 	class Room {  	    int roomNumber;  	    boolean isBooked;  	    public Room(int roomNumber) {  	        this.roomNumber = roomNumber; 
 	        this.isBooked = false; 
 	    } 
 	} 
 
 	class Hotel { 
 	    ArrayList<Room> rooms; 
 
 	    public Hotel(int numRooms) {  	        rooms = new ArrayList<>();  	        for (int i = 1; i <= numRooms; i++) {  	            rooms.add(new Room(i)); 
 	        } 
 	    } 
 
 	    public void displayAvailableRooms() {  	        System.out.println("Available Rooms:");  	        for (Room room : rooms) {  	            if (!room.isBooked) { 
 	                System.out.println("Room " + room.roomNumber); 
 	            } 
 	        } 
 	        System.out.println(); 
 	    } 
 
 	    public void bookRoom(int roomNumber) { 
 	        for (Room room : rooms) { 
 	            if (room.roomNumber == roomNumber && !room.isBooked) {  	                room.isBooked = true; 
 	                 
                                                                                      19 
                           System.out.println("Room " + roomNumber + " booked successfully!");  	                return; 
 	            } 
 	        } 
 	        System.out.println("Room " + roomNumber + " not available for booking."); 
 	    } 
 	} 
 	public class HotelManagementSystem {  	    public static void main(String[] args) {  	        Scanner scanner = new Scanner(System.in); 
 	        System.out.println("Welcome to the Hotel Management System!"); 
 
 	        // Initialize the hotel with 5 rooms 
 	        Hotel hotel = new Hotel(5); 
 
 	        while (true) { 
 	            System.out.println("1. Display available rooms"); 
 	            System.out.println("2. Book a room"); 
 	            System.out.println("3. Exit"); 
 	            System.out.print("Enter your choice: ");  	            int choice = scanner.nextInt(); 
 
 	            switch (choice) {  	                case 1:  	                    hotel.displayAvailableRooms();  	                    break;  	                case 2: 
 	                    System.out.print("Enter room number to book: ");  	                    int roomNumber = scanner.nextInt();  	                    hotel.bookRoom(roomNumber);  	                    break;  	                case 3: 
 	                    System.out.println("Exiting Hotel Management System. Thank you!"); 
 	                    System.exit(0);  	                    break;  	                default: 
                     System.out.println("Invalid choice. Please enter a valid option.");              } 
 	        } 
 	    } 
 	} 
 	 
