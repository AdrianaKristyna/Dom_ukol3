package com.example.adriana.dom_ukol3;


import android.os.Parcel;
import android.os.Parcelable;

public class Filmy implements Parcelable {
    public String image;
    public String number;
    public String name;
    public String title;
    public String description;


    public Filmy(String image, String title, String name, String number, String description) {
        this.image = image;
        this.title=title;
        this.number = number;
        this.name = name;
        this.description = description;
    }

    protected Filmy(Parcel in) {
        image = in.readString();
        number = in.readString();
        name = in.readString();
        title = in.readString();
        description = in.readString();
    }

    public static final Creator<Filmy> CREATOR = new Creator<Filmy>() {
        @Override
        public Filmy createFromParcel(Parcel in) {
            return new Filmy(in);
        }

        @Override
        public Filmy[] newArray(int size) {
            return new Filmy[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(image);
        dest.writeString(number);
        dest.writeString(name);
        dest.writeString(number);
        dest.writeString(description);
        dest.writeString(title);
    }
    // pokud by bylo private, tak musím udělat gettery a settery
}