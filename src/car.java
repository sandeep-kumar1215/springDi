

public class car {
    engine engineref ;
    public void setEngineref(engine engineref) {
        this.engineref = engineref;
    }





    public void drive(){
        int start = engineref.run();
        if(start==1){
            System.out.println("setterDI.car started and running");
        }
        else{
            System.out.println("setterDI.car didn't start and not running");
        }
    }
}
