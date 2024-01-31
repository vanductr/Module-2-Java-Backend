package ss9.baitap3;

public class MainBT3 {
    public static void main(String[] args) {
        // Tạo đối tượng của lớp AudioPlayer
        AudioPlayer audioPlayer = new AudioPlayer();

        // Tạo đối tượng của lớp VideoPlayer
        VideoPlayer videoPlayer = new VideoPlayer();

        // Gọi đến phương thức play của 2 đối tượng
        audioPlayer.play();
        videoPlayer.play();
    }
}
