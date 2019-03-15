package com.example.acer.pixabay;

public class ImageModels {


    String imagelikes,imageview,imagedownload,pic;

    public String getImagelikes() {
        return imagelikes;
    }

    public void setImagelikes(String imagelikes) {
        this.imagelikes = imagelikes;
    }

    public String getImageview() {
        return imageview;
    }

    public void setImageview(String imageview) {
        this.imageview = imageview;
    }

    public String getImagedownload() {
        return imagedownload;
    }

    public void setImagedownload(String imagedownload) {
        this.imagedownload = imagedownload;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public ImageModels(String likes, String views, String download, String imageurl) {


        this.imagelikes=likes;
        this.imageview=views;
        this.imagedownload=download;
        this.pic=imageurl;

    }
}
