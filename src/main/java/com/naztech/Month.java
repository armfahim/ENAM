package com.naztech;

public enum Month {

	JANUARY("January", 31), FEBRUARY("February", 28), MARCH("March", 31), APRIL("April", 30), MAY("May", 31),
	JUNE("June", 30), JULY("July", 31), AUGUST("August", 31), SEPTEMBER("September", 30), OCTOBER("October", 31),
	NOVEMBER("November", 30), DECEMBER("December", 31);

	private String Title;
	private int DaysInMonth;

	private Month(String title, int days) {
		this.Title = title;
		DaysInMonth = days;
	}

	public int daysInMonth() {
		return this.DaysInMonth;
	}

	public String getShortName() {
		return this.Title.substring(0, 3);
	}

	public static Month parse(String v) {
		if (v == null || v.isEmpty()) return null;

		v = v.toUpperCase();
		try {
			return valueOf(v);
		} catch (IllegalArgumentException e) {
			for (Month month : values()) {
				if (v.equals(month.getShortName().toUpperCase())) return month;
			}
		}
		return null;

	}
}
