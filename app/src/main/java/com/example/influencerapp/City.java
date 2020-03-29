package com.example.influencerapp;

public class City {


    private String Title;
    private String Description;
    private String Earning;
    private String Date;
    private String Status;

    private int Thumbnail;

    public City() {

    }

    public City(String title, String description, String earning, String date, String status, int thumbnail) {
        Title = title;
        Description = description;
        Earning = earning;
        Date = date;
        Status = status;
        Thumbnail = thumbnail;
    }

    public String getTitle() {
        if(Title==null)
        {
            setTitle("Video");
        }
        return Title;
    }

    public String getDescription() {
        if(Description==null)
        {
            setDescription("Video");
        }
        return Description;
    }

    public String getEarning() {
        if(Earning==null)
        {
            setEarning("Earning is 1000");
        }
        return Earning;
    }

    public String getDate() {
        if(Date==null)
        {
            setDate("Submitted on 10/02/2020");
        }
        return Date;
    }

    public String getStatus() {
        if(Status==null)
        {
            setStatus("Accepted");
        }
        return Status;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setEarning(String earning) {
        Earning = earning;
    }

    public void setDate(String date) {
        Date = date;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}
