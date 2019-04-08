package com.cai.model;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Visit implements Serializable{
    
	private static final long serialVersionUID = 1L;

	private Integer id;
    
    private String ip;
    
    private String userAgent;
    
    private String city;
    
    private String url;
    
    private String browserType;//浏览器类型  
    
    
    private String platformType;//平台类型  


    
    @DateTimeFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date time;

    public Visit(){}  
    
    public Visit(String browserType, String platformType){  
        this.browserType = browserType;  
        this.platformType = platformType;  
    } 
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }
    
   
	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
	public String getBrowserType() {
		return browserType;
	}
	public void setBrowserType(String browserType) {
		this.browserType = browserType;
	}
	
	public String getPlatformType() {
		return platformType;
	}
	public void setPlatformType(String platformType) {
		this.platformType = platformType;
	}

}