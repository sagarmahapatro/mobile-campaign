package org.adalyist.rest.api.to;

public class ResultTO<T> {
	private String status;
	private String metaData;
	private T payload;

	public ResultTO(String status, String metaData, T to) {
		this.status = status;
		this.metaData = metaData;
		this.payload = to;
	}

	public ResultTO(T to) {
		this.status = "";
		this.metaData = "";
		this.payload = to;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMetaData() {
		return metaData;
	}

	public void setMetaData(String metaData) {
		this.metaData = metaData;
	}

	public T getPayload() {
		return payload;
	}

	public void setPayload(T payload) {
		this.payload = payload;
	}

}
