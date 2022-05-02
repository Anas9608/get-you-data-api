package com.kraken.getudata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shows")
public class Show {
    @Id
    @Column(name = "show_id" )
    private String showId;
    @Column(name = "title")
    private String _title;
    @Column(name = "type")
    private String _type;
    @Column(name = "director")
    private String _director;
    @Column(name = "cast")
    private String _cast;
    @Column(name = "country")
    private String country;
    @Column(name="date_added")
    private String dateAdded;
    @Column(name="description")
    private String _description;
    @Column(name = "release_year")
    private double releaseYear;
    @Column(name= "rating")
    private String _rating;
    @Column(name= "duration")
    private String _duration;
    @Column(name= "listed_in")
    private String listedIn;


    public String get_title() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }





    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public String get_type() {
        return _type;
    }

    public void set_type(String _type) {
        this._type = _type;
    }

    public String get_director() {
        return _director;
    }

    public void set_director(String _director) {
        this._director = _director;
    }

    public String get_cast() {
        return _cast;
    }

    public void set_cast(String _cast) {
        this._cast = _cast;
    }

    public String getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(String dateAdded) {
        this.dateAdded = dateAdded;
    }

    public double getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(double releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String get_rating() {
        return _rating;
    }

    public void set_rating(String _rating) {
        this._rating = _rating;
    }

    public String get_duration() {
        return _duration;
    }

    public void set_duration(String _duration) {
        this._duration = _duration;
    }

    public String getListedIn() {
        return listedIn;
    }

    public void setListedIn(String listedIn) {
        this.listedIn = listedIn;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    @Override
    public String toString() {
        return "show{" +
                "show_id='" + showId + '\'' +
                ", title='" + _title + '\'' +
                ", type='" + _type + '\'' +
                ", director='" + _director + '\'' +
                ", cast='" + _cast + '\'' +
                ", country='" + country + '\'' +
                ", date_added='" + dateAdded + '\'' +
                ", release_year=" + releaseYear +
                ", rating='" + _rating + '\'' +
                ", duration='" + _duration + '\'' +
                ", listed_in='" + listedIn + '\'' +
                ", description='" + _description + '\'' +
                '}';
    }
}
