package msku.ceng.madlab.week3;

import android.graphics.Bitmap;
import android.location.Location;

public class Post {
    private String messages;
    private Location location;
    private Bitmap image;

    public String getMessage() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }
}
