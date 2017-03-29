package net.a6te.lazycoder.customadapterdemo1;

import java.util.ArrayList;

/**
 * Created by Mobile App Develop on 3/29/2017.
 */

public class ImageCollection {
    private String imageName;
    private String creditName;
    private int image;


    public ImageCollection() {
    }
    public ImageCollection(String imageName, String creditName) {
        this.imageName = imageName;
        this.creditName = creditName;
    }

    public ImageCollection(String imageName, String creditName, int image) {
        this.imageName = imageName;
        this.creditName = creditName;
        this.image = image;
    }



    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getCreditName() {
        return creditName;
    }

    public void setCreditName(String creditName) {
        this.creditName = creditName;
    }

    public ArrayList<ImageCollection> getAllImage()
    {
        ArrayList<ImageCollection> imageCollections = new ArrayList<>();
        imageCollections.add(new ImageCollection("Hannan", "Hannan Talukder", R.drawable.hitman));
        imageCollections.add(new ImageCollection("Hannan", "Hannan Talukder", R.drawable.avater));
        imageCollections.add(new ImageCollection("Hannan", "Hannan Talukder", R.drawable.avenger));
        imageCollections.add(new ImageCollection("Hannan", "Hannan Talukder", R.drawable.hercules));
        imageCollections.add(new ImageCollection("Hannan", "Hannan Talukder", R.drawable.moana));
        imageCollections.add(new ImageCollection("Hannan", "Hannan Talukder", R.drawable.panda));
        imageCollections.add(new ImageCollection("Hannan", "Hannan Talukder", R.drawable.returnx));
        imageCollections.add(new ImageCollection("Hannan", "Hannan Talukder", R.drawable.hitman));
        imageCollections.add(new ImageCollection("Hannan", "Hannan Talukder", R.drawable.avater));
        imageCollections.add(new ImageCollection("Hannan", "Hannan Talukder", R.drawable.avenger));
        imageCollections.add(new ImageCollection("Hannan", "Hannan Talukder", R.drawable.hercules));
        imageCollections.add(new ImageCollection("Hannan", "Hannan Talukder", R.drawable.moana));
        imageCollections.add(new ImageCollection("Hannan", "Hannan Talukder", R.drawable.panda));
        imageCollections.add(new ImageCollection("Hannan", "Hannan Talukder", R.drawable.returnx));

        return imageCollections;
    }
}
