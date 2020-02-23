package task.pet;

public class Pets {

//    attributes
//            type
//    name

   private String type;
    private String name;


//    constructor :
//    no arg constructor
//    set the breed to "unknown"
//    set the name to "noname"

    public Pets (){
        type="unknown";
        name="noname";
    }

    public Pets(String type, String name){
        this.type=type;
        this.name=name;
    }

//            2 args constructor
//    set the name and breed to what the caller passed
//    behaviours
//            getters , setters , toString

    public String getName(){return name;}
    public void setName(String name){this.name=name;}
    public String getType(){return type;}
    public void setType(String type){this.type=type;}

    public String toString() {
        return "Pets{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }


    public void Speal(){
        switch (type){
            case "cat":
                System.out.println("myu myu");
                break;
            case "sog":
                System.out.println("wow wow");
            case "beard":
                System.out.println("cik cik");
            case "angel fish":
                System.out.println("null");
        }

    }


    //    speak
//    accept no parameter
//    according to the type speak following
//    cat --> meow
//    dog --> woof
//    cow --> mooo
//    horse --> neinei







}
