package com.example.multipleviewrecyclerview;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import com.google.gson.annotations.Expose;


class JSONResponse {

	@SerializedName("features")
	@Expose
	private List<Feature> features = null;

	public List<Feature> getFeatures() {
		return features;
	}

}

class Feature {

	@SerializedName("properties")
	@Expose
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}


}



public class Properties {

	@SerializedName("mag")
	@Expose
	private Double mag;
	@SerializedName("place")
	@Expose
	private String place;
	@SerializedName("time")
	@Expose
	private Long time;
	@SerializedName("url")
	@Expose
	private String url;


	public Double getMag() {
		return mag;
	}

	public String getPlace() {
		return place;
	}

	public Long getTime() {
		return time;
	}

	public String getUrl() {
		return url;
	}

}