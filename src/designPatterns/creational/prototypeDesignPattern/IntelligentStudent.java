package designPatterns.creational.prototypeDesignPattern;

public class IntelligentStudent extends Student {
    int iq;

    public IntelligentStudent(){}
    public IntelligentStudent(IntelligentStudent IS){
        super(IS);
        this.iq=IS.iq;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}
