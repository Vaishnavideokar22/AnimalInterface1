interface Animal{
    void Eat();
}
class Lion implements Animal{
    public void Eat(){
        System.out.println("Lion Eats Deer");
    }
}
class Tiger implements Animal{
    public void Eat(){
        System.out.println("Tiger Eats Deer");
    }
}
class Deer implements Animal{
    public void Eat(){
        System.out.println("Deer Eats Grass");
    }
}


public class AnimalInterface1 {

    public static void main(String[] args) {
        
        Lion l1 = new Lion();
        l1.Eat();

        Tiger t1 = new Tiger();
        t1.Eat();

        Deer d1 = new Deer();
        d1.Eat();
    }
    
}
