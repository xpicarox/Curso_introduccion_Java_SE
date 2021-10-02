public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives -1;
        System.out.println(lives); //4

        lives--; //Deremento
        System.out.println(lives); //3

        lives++; //Incremento
        System.out.println(lives); //4

        
        // Gana un regalo por ganar una vida
        int gift = 100 + lives++; //Posfijo
        System.out.println(gift);
        System.out.println(lives); //5

        int gift_ = 100 + ++lives; //Prefijo
        System.out.println(gift_);
        System.out.println(lives); //5
    }
}
