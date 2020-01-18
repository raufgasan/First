package day41;


  /*
    TV
    attributes :
    brand , isOn , currentChannel
    Stirng , boolean , int   (range from 1-50)
    behaviours :
    turnOn
            turnOff
    getcurrentChannel
    setcurrentChannel (newChannelNumber)
    moveForward
            moveBackward
            */
  public class TV {

      String name;
    boolean isOn;
    int currentChanel;

    public int getcurrentChannel(){
        return currentChanel;
    }

    public void setcurrentChannel(int newChannel){
        if(newChannel<0||newChannel>50){
            System.out.println("Invalid chanel, getting out");
            return;
        }

        if (isOn==true){
            currentChanel=newChannel;
        }else{
            System.out.println("Turn on TV first");
        }

    }



    public void turnOn(){

        if (isOn==false){
        isOn=true;
        System.out.println("Turning on TV");}
    }

    public void turnOff(){

        if(isOn==true){
            isOn=false;
        System.out.println("Turning off TV");}
    }


      public String toString() {
          return "TV{" +
                  "name='" + name + '\'' +
                  ", isOn=" + isOn +
                  ", currentChanel=" + currentChanel +
                  '}';
      }
  }
