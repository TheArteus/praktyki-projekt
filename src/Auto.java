
class Opony{

}

public class Auto {

    int a = 4;
    double b = 6.8;
    Opony opony;

    void Jedz(){
        System.out.println("brum brum");

    }

    Opony get_opony(){
        return opony;
    }

    void set_a_b(int a, double b, Opony opony){
        this.a=a;
        this.b=b;
        this.opony = opony;
    }


}
