public class Hello {
    //instances method
    public void display(){
        Integer a=10;
        Integer b=20;
        Integer c=a+b;
        System.debug('The sum is= '+c);
    }
    //class method
    public Integer say(Integer a,Integer b){
        return a+b;
    }
    //return static method
    public static Integer go(Integer a,Integer b){
        Integer c=a+b;
        return c;
    }
    //non return static method
    public static void got(Integer a,Integer b){
        Integer c=a+b;
        System.debug(c);
        
    }
    //constructor
   public Hello(){
        System.debug('Constructor is implemented');
    }
    //parametrized constrctor
    public Hello(String name,Integer roll){
        System.debug('The name is='+name+' The roll no is ='+roll);
    }
}