package baitap3;

public class StopWatch {
    // Khai báo 1 biến thành viên trong lớp 'StopWatch' với kiểu dữ liệu là 'long'
    // và mức độ truy cập là private
    private long startTime;
    private long endTime;

    // Constructor không tham số
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    // Getter cho startTime
    public long getStartTime() {
        return startTime;
    }

    // Getter cho endTime
    public long getEndTime() {
        return endTime;
    }

    // Phương thức bắt đầu đo đếm thời gian
    public void start() {
        startTime = System.currentTimeMillis();
    }

    // Phương thức dừng đo đếm thời gian
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    // Phương thức lấy thời gian đã trôi qua (đã đo)
    public long getElapsedTime() {
        return endTime - startTime;
    }
}

