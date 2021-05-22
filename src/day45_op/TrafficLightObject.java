package day45_op;

public class TrafficLightObject {
    public static void main(String[] args) {
        //create traffic light object
        TrafficLight trafficLight = new TrafficLight();
        //trafficLight.color = "red";  NOT THIS WAY
        //We will assign/update the value of color using a method of the class
        trafficLight.changeColor("red");

        trafficLight.showColor();

        trafficLight.changeColor("green");
        trafficLight.showColor();

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.changeColor("blue");
        trafficLight2.showColor();

    }
}
