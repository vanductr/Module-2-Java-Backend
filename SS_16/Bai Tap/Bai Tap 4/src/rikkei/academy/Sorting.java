package rikkei.academy;

import java.util.ArrayList;
import java.util.List;

public class Sorting {
    // Hàm main để chạy chương trình
    public static void main(String[] args) {
        // Tạo 1 Danh sách để chứa các đối tượng đội bóng
        FootballTeam[] footballTeamList = new FootballTeam[10];

        // Tạo đối tượng Đội bóng
        FootballTeam footballTeam1 = new FootballTeam(1, "Man Utd", 21, 32);
        FootballTeam footballTeam2 = new FootballTeam(2, "Tottenham", 21, 40);
        FootballTeam footballTeam3 = new FootballTeam(3, "Newcastle", 21, 32);
        FootballTeam footballTeam4 = new FootballTeam(4, "Liverpool", 21, 48);
        FootballTeam footballTeam5 = new FootballTeam(5, "Chelsea", 21, 31);
        FootballTeam footballTeam6 = new FootballTeam(6, "Brighton", 21, 32);
        FootballTeam footballTeam7 = new FootballTeam(7, "Arsenal", 21, 46);
        FootballTeam footballTeam8 = new FootballTeam(8, "West Ham", 21, 35);
        FootballTeam footballTeam9 = new FootballTeam(9, "Man City", 21, 43);
        FootballTeam footballTeam10 = new FootballTeam(10, "Aston Villa", 21, 43);

        // Lưu tất cả các đội bóng vào trong List
        footballTeamList[0] = footballTeam1;
        footballTeamList[1] = footballTeam2;
        footballTeamList[2] = footballTeam3;
        footballTeamList[3] = footballTeam4;
        footballTeamList[4] = footballTeam5;
        footballTeamList[5] = footballTeam6;
        footballTeamList[6] = footballTeam7;
        footballTeamList[7] = footballTeam8;
        footballTeamList[8] = footballTeam9;
        footballTeamList[9] = footballTeam10;


        // Hiển thị mảng ban đầu.
        System.out.println("Danh sách các đội bóng ban đầu:");
        for (FootballTeam footballTeam : footballTeamList) {
            footballTeam.displayGameInfo();
            System.out.println("-------------------------------");
        }
        
        // Hiển thị Danh sách đã được sắp xếp
//        bubbleSort(footballTeamList);
//        selectionSort(footballTeamList);
        insertionSort(footballTeamList);
        System.out.println("Danh sách các đội bóng sau khi đã được sắp xếp:");
        for (FootballTeam footballTeam : footballTeamList) {
            footballTeam.displayGameInfo();
            System.out.println("-------------------------------");
        }
    }
    // Thuật toán: Sắp xếp Nổi bọt
    private static void bubbleSort(FootballTeam[] footballTeams) {
        for (int i = 1; i < footballTeams.length; i++) {
            for (int j = 0; j < footballTeams.length - i; j++) {
                if (footballTeams[j].getScore() < footballTeams[j + 1].getScore()) {
                    FootballTeam team = footballTeams[j];
                    footballTeams[j] = footballTeams[j + 1];
                    footballTeams[j + 1] = team;
                }
            }
        }
    }
    // Thuật toán: Sắp xếp Chọn (Chia đôi mảng)
    private static void selectionSort(FootballTeam[] footballTeams) {
        for (int i = 0; i < footballTeams.length; i++) {
            FootballTeam phanTuLonNhat = footballTeams[i];
            int indexPhanTuLonNhat = i;

            for (int j = i + 1; j < footballTeams.length; j++) {
                if (footballTeams[j].getScore() > phanTuLonNhat.getScore()) {
                    phanTuLonNhat = footballTeams[j];
                    indexPhanTuLonNhat = j;
                }
            }

            if (indexPhanTuLonNhat != i) {
                footballTeams[indexPhanTuLonNhat] = footballTeams[i];
                footballTeams[i] = phanTuLonNhat;
            }
        }
    }
    // Thuật toán: Sắp xếp Chèn
    private static void insertionSort(FootballTeam[] footballTeams) {
        for (int i = 1; i < footballTeams.length; i++) {
            FootballTeam team = footballTeams[i];
            int j = i - 1;

            while (j >= 0 && footballTeams[j].getScore() < team.getScore()) {
                footballTeams[j + 1] = footballTeams[j];
                j--;
            }
            footballTeams[j + 1] = team;
        }
    }
}
