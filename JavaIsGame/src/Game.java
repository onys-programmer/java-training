

public class Game {
    public void welcome() {
        System.out.println("Java Is Game에 오신것을 환영합니다 용사여!");
    }


    public static void main(String args[]) {
        Game game1 = new Game();
        String keys = "";
        game1.welcome();
        //game1.recieveInput(keys);
    }
}
