package lesson5;

public class Main2 {
    public static void main(String[] args) {
        //  нам приходит путь к картинке
        // нужно напечатать картинка это или нет
        //C:\Users\nikas\Downloads\USN

        String pathToImage = "C:\\Users\\nikas\\Downloads\\USN.png";
        if(pathToImage.endsWith(".png") || pathToImage.endsWith(".jpeg")){
            System.out.println("Это картинка!");
        }else {
            System.out.println("Это не картинка!");
        }
    }
}
