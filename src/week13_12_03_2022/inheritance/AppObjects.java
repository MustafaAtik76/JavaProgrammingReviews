package week13_12_03_2022.inheritance;

public class AppObjects {

    public static void main(String[] args) {
        //create an Instagram object

        Instagram instagram = new Instagram(5.6);

        System.out.println(instagram);

        instagram.postPhoto();
        instagram.useTheApp(30);
        System.out.println("----------------------------------------------");
        Discord discord = new Discord(4.2);

        System.out.println(discord);
        discord.chat();
        discord.useTheApp(25);

    }



}
