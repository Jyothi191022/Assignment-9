package com.codegnan.controlstatements;

public class HotelRoomPricing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter room type and season: ");
        int room = sc.nextInt();
        int season = sc.nextInt();
        String price;
        switch (room) {
            case 1: 
                if (season == 1) {
                    price = "$100"; 
                } else if (season == 2) {
                    price = "$80";  
                } else {
                    price = "Invalid Input";
                }
                break;
            case 2: 
                if (season == 1) {
                    price = "$200"; 
                } else if (season == 2) {
                    price = "$150"; 
                } else {
                    price = "Invalid Input";
                }
                break;
            default:
                price = "Invalid Input";
        }
        System.out.println(price);
        sc.close();
	}

}
