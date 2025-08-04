package com.example.weddinginvitation.model;

import jakarta.persistence.*;

@Entity
public class WeddingInvitation 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brideName;
    private String groomName;
    private String date;
    private String venue;

    public WeddingInvitation(){}

    // Getters & Setters
    public Long getId() 
    { 
    	return id; 
    }
    
   /* public void setGetId(Long id)
    {
    	return id;
    }*/
    
    public String getBrideName()
    { 
    	return brideName; 
    }
    
    public void setBrideName(String brideName) 
    { 
    	this.brideName = brideName; 
    }
    
    
    public String getGroomName()
    {
    	return groomName; 
    	}
    
    public void setGroomName(String groomName)
    { 
    	this.groomName = groomName; 
    }
    
    
    
    public String getDate() 
    {
    	return date; 
    }
    
    public void setDate(String date)
    {
    	this.date = date; 
    }
    
    
    public String getVenue() 
    { 
    	return venue; 
    }
    
    public void setVenue(String venue)
    {
    	this.venue = venue;
    }
}
