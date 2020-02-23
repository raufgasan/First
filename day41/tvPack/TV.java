package day41.tvPack;

public class TV {

    /**
     * TV
     * attributes :
     * brand , isOn , currentChannel
     * String , boolean , int   (range from 0-50)
     * behaviours :
     * turnOn
     * turnOff
     * getCurrentChannel
     * setCurrentChannel (newChannelNumber)
     * moveForward
     * moveBackward
     */


    String name;
    boolean isOn;
    int currentChannel;

    /**
     * A method to return the value of current channel for the TV
     *
     * @return the value of current channel for the TV
     */
    public int getCurrentChannel() {
        return currentChannel;
    }


    public void turnOn() {


        if (isOn == false) { // checking for equality
            System.out.println("Turning on TV");
            isOn = true; // assigning the value of isOn to true
        }
    }

    public void turnOff() {

        // if(isOn){ // this will also
        if (isOn == true) {

            System.out.println("Turning off TV");
            isOn = false;

        }


    }

    // valid channel is from 0-50
    public void setCurrentChannel(int newChannel) {

        // if my channel is out of range i want to exit from the method
        if (newChannel < 0 || newChannel > 50) {
            System.out.println("INVALID CHANNEL, GETTING OUT");
            return; // early exit from the method
        }
    }
    public String toString() {
        return "TV{" +
                "name='" + name + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }
}