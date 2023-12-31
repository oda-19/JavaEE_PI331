package main.java.domain;

public class City {
	private Long id;
	// город
	private String city;

	// внешний ключ для связи с моделью Region
	private Long regionId;
	// Навигационное свойства - ссылка на регион
	private Region region;


	public City() {
		
	}
	public City(Long id, String city, Long regionId) {
		this.id = id;
		this.city = city;
		this.regionId = regionId;
	}
	public City(Long id, String city, Long regionId, Region region) {
		this.id = id;
		this.city = city;
		this.regionId = regionId;
		this.region = region;
	}


    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public Region region () {
		return region;
	}
	public Long getRegionId() {
		return regionId;
	}
	public void setRegionId(Long regionId) {
		this.regionId = regionId;
	}
	public String getRegion() {	return region.getRegion(); }
	public void setRegion(Region region) {
		this.region = region;
	}

	@Override
	public String toString() {
		return "City {id=" + id + ", city='" + city + ", regionId=" + regionId + ", region=" + region + "}";
	}
}
