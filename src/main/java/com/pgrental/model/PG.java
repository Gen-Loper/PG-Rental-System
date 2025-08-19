package com.pgrental.model;

public class PG {
	private int userId;
    private String name;
    private String address;
    private int rent;
    private String description;

    // Getters and Setters
	public int getUserId() {
	    return userId;
	}

	public void setUserId(int userId) {
	    this.userId = userId;
	}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public int getRent() { return rent; }
    public void setRent(int rent) { this.rent = rent; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
