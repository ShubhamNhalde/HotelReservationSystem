package www.bridgelabz.HotelReservationSystem;

import java.util.ArrayList;

public class HotelReservationSystem {

	static ArrayList<Hotel> HotelsList = new ArrayList<>();

	public static void view() {
		for (Hotel i : HotelsList) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		Hotel LakeWood = new Hotel();
		LakeWood.setHotelName("Lakewood");
		LakeWood.setWeekDayRate(110);
		HotelsList.add(LakeWood);

		Hotel BridgeWood = new Hotel();
		BridgeWood.setHotelName("BridgeWood");
		BridgeWood.setWeekDayRate(160);
		HotelsList.add(BridgeWood);

		Hotel RidgeWood = new Hotel();
		RidgeWood.setHotelName("RidgeWood");
		RidgeWood.setWeekDayRate(220);
		HotelsList.add(RidgeWood);

		view();

	}
	
}
