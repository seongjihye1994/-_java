package com.kh.mini_Project.model;

public class ATM extends Facility {
	// 인덱스를 기준으로 버튼 인덱스 구현?
	private String fName;
	private String fOpenTime;
	private String fAddress;
	private String fImagePath;

	public ATM() {}

	public ATM(String fName, String fOpenTime, String fAddress, String fImagePath) {
		super();
		this.fName = fName;
		this.fOpenTime = fOpenTime;
		this.fAddress = fAddress;
		this.fImagePath = fImagePath;
	}
	
	public ATM(String type, String name, String address, String phone, String imagePath) {
		super(type, name, address, phone, imagePath);
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getfOpenTime() {
		return fOpenTime;
	}

	public void setfOpenTime(String fOpenTime) {
		this.fOpenTime = fOpenTime;
	}

	public String getfAddress() {
		return fAddress;
	}

	public void setfAddress(String fAddress) {
		this.fAddress = fAddress;
	}

	public String getfImagePath() {
		return fImagePath;
	}

	public void setfImagePath(String fImagePath) {
		this.fImagePath = fImagePath;
	}

	@Override
	public String toString() {
		return "ATM [fName=" + fName + ", fOpenTime=" + fOpenTime + ", fAddress=" + fAddress + ", fImagePath="
				+ fImagePath + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fAddress == null) ? 0 : fAddress.hashCode());
		result = prime * result + ((fImagePath == null) ? 0 : fImagePath.hashCode());
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + ((fOpenTime == null) ? 0 : fOpenTime.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ATM other = (ATM) obj;
		if (fAddress == null) {
			if (other.fAddress != null)
				return false;
		} else if (!fAddress.equals(other.fAddress))
			return false;
		if (fImagePath == null) {
			if (other.fImagePath != null)
				return false;
		} else if (!fImagePath.equals(other.fImagePath))
			return false;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (fOpenTime == null) {
			if (other.fOpenTime != null)
				return false;
		} else if (!fOpenTime.equals(other.fOpenTime))
			return false;
		return true;
	}

}
