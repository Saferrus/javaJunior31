package lesson5;

public class Main2 {
    public static void main(String[] args) {
        //  ��� �������� ���� � ��������
        // ����� ���������� �������� ��� ��� ���
        //C:\Users\nikas\Downloads\USN

        String pathToImage = "C:\\Users\\nikas\\Downloads\\USN.png";
        if(pathToImage.endsWith(".png") || pathToImage.endsWith(".jpeg")){
            System.out.println("��� ��������!");
        }else {
            System.out.println("��� �� ��������!");
        }
    }
}
