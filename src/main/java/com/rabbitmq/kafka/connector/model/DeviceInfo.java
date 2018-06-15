package com.rabbitmq.kafka.connector.model;

public class DeviceInfo {
	
	private int deviceId;
	private String deviceName;
	private DeviceDetailsInfo deviceDetailsInfo;
	
	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public DeviceDetailsInfo getDeviceDetailsInfo() {
		return deviceDetailsInfo;
	}

	public void setDeviceDetailsInfo(DeviceDetailsInfo deviceDetailsInfo) {
		this.deviceDetailsInfo = deviceDetailsInfo;
	}
	
	@Override
	public String toString() {
		return "{ deviceId: " + deviceId + ", deviceName: " + deviceName + ", { " + deviceDetailsInfo.toString() + " } }";
	}
}
