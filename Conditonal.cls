public class Conditonal {
    //instances block
    {
        System.debug('instances block is implemented');
    }
    //static block
    static{
        System.debug('static block is implemented');
    }
     Integer age=20;
    //if else statement
    public void display(){
      
        if(age>18){
            System.debug('u can vote');
        }
        else{
             System.debug('u can not vote');
        }
    }
    //switch statement
    public void say(){
        switch on age{
            when 18{
                System.debug('The age is 18');
            }
                        when 19{
                System.debug('The age is 19');
            }
                        when 30{
                System.debug('The age is 30');
            }
                        when 70{
                System.debug('The age is 70');
            }
            when else{
                System.debug('default value');
            }
    	}
    }
    
}