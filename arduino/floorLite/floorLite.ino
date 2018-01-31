
#include <ESP8266WiFi.h>
#include<FirebaseArduino.h>

#define FIREBASE_HOST "xxxxxxxxxxxxxxxxxx.firebaseio.com" //Your Firebase Project URL goes here without "http:" , "\" and "/" 
#define FIREBASE_AUTH "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" //Your Firebase Database Secret goes here

#define WIFI_SSID "xxxxxxxxxx" //your WiFi SSID for which yout NodeMCU connects
#define WIFI_PASSWORD "xxxxxxxxx"//Password of your wifi network 

void setup() {
  // put your setup code here, to run once:

  Serial.begin(115200); //baud rate ,if you want to see the process in the serial monitor ,same baud rate should be set.
  pinMode(Ledpin,OUTPUT);

  WiFi.begin(WIFI_SSID,WIFI_PASSWORD);
  Serial.print("connecting");
  while (WiFi.status()!=WL_CONNECTED){
    Serial.print(".");
    delay(500);
}

void loop() {
  // put your main code here, to run repeatedly:

}
