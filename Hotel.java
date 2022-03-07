package www.bridgelabz.HotelReservationSystem;

public class Hotel {
	
	private String hotelName;
	private int WeekDayRate;
	
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getWeekDayRate() {
		return WeekDayRate;
	}
	public void setWeekDayRate(int WeekDayRate) {
		this.WeekDayRate =WeekDayRate;
	}
	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", WeekDayRate=" + WeekDayRate + "]";
	}

}
