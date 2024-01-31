package rikkei.academy;

public class MyListTest {
    public static void main(String[] args) {
        // Cài đặt các trường hợp thực thi trong main()
        // Trường hợp 1: Tạo đối tượng listInteger chứa danh sách các số Nguyên.
        // Hiển thị các phần tử được thêm vào list và phần tử vượt quá số phần tử được thêm vào
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);

        System.out.println("element 4: " + listInteger.get(4));
        System.out.println("element 1: " + listInteger.get(1));
        System.out.println("element 2: " + listInteger.get(2));

        // Trường hợp 2: Hiển thị phần tử ở vị trí -1
        listInteger.get(-1);
        System.out.println("element -1: " + listInteger.get(-1));
    }
}
