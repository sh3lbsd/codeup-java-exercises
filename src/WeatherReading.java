//import java.util.Date;
////================================= WARM UP
////
////Create a class called, WeatherReading, with the following members:
//public class WeatherReading {
//
//
////  private instance variables:
//        private double latitude;
//        private double longitude;
//        private Date recordedAt;
//        private double tempInCelsius;
//
////  public static method:
//public static double kelvinToCelsius(double kelvin) {
//        return kelvin - 273.15;
//        }
////    kelvinToCelsius - takes in a double and returns a double, converting temp from Kelvin to Celsius
////
////  public instance methods:
//public WeatherReading(double latitude, double longitude, Date recordedAt, double tempInKelvin) {
//        this.latitude =latitude;
//        this.longitude = longitude;
//        this.recordedAt = recordedAt;
//        this.tempInCelsius = kelvinToCelsius(tempInKelvin);}
////    getters and setters
////
////    for the setter for tempInCelsius, pass the input into the kelvinToCelsius method and assign the output to this.tempInCelsius
//
//        public double getTempInCelsius() {
//                return tempInCelsius;
//        }
//
//        //    when setting the tempInCelsius pass the input into the kelvinToCelsius method and assign the output to this.tempInCelsius
//        public void setTempInCelsius(double tempInCelsius) {
//                this.tempInCelsius = tempInCelsius;
//        }
//
//        //  add a constructor that sets all fields
//        public  (double tempInKelvin, double tempInCelsius) {
//                this.tempInCelsius = tempInCelsius;
//                this. = priceInCents;
//        }
//
////Add the following main method to test it out:
////
//  public static void main(String[] args) {
//
//    double latitude = -98.4936;
//    double longitude = 29.4241;
//    Date recordedAt = new Date();
//    double tempInKelvin = 300;
//    WeatherReading wr = new WeatherReading(latitude, longitude, recordedAt, tempInKelvin);
//    System.out.println(wr.getTempInCelsius());
//
//        }
//}
