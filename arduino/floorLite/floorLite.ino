
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

void firebasereconnect()
{
  Serial.println("Trying to reconnect");
    Firebase.begin(FIREBASE_HOST, FIREBASE_AUTH);
  }

int l;
void loop() {
  // put your main code here, to run repeatedly:

   if (Firebase.failed()) {
      Serial.print("setting number failed:");
      Serial.println(Firebase.error());
      firebasereconnect();
      return;


  l=Firebase.getString("S").toInt();//The value read from the firebase is read in the form of String and is converted into Integer
  if(l==1){
      digitalWrite(Ledpin,HIGH);
      Serial.println("lightON");
    }
    else if(l==0){
      digitalWrite(Ledpin,LOW);
      Serial.println("lightOFF");
    }

} 


}
