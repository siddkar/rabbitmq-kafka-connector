package com.rabbitmq.kafka.connector.model;

public class DeviceDetailsInfo {

	private String location;
	private int ram;
	private int hdd;
	private String cpu;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	@Override
	public String toString() {
		return "location: " + location + ", ram: " + ram + ", hdd: " + hdd + ", cpu" + cpu;
	}

}
