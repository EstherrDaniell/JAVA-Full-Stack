package jfs_exp3;
class Video {
    private String videoName;
    private boolean checkout;
    private int rating;

    Video(String name) {
        videoName = name;
        checkout = false;
        rating = 0;
    }

    String getName() {
        return videoName;
    }

    void doCheckout() {
        checkout = true;
    }

    void doReturn() {
        checkout = false;
    }

    void receiveRating(int rating) {
        this.rating = rating;
    }

    int getRating() {
        return rating;
    }

    boolean getCheckout() {
        return checkout;
    }
}