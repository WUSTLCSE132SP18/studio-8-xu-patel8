#include <Wire.h> // Must include Wire library for I2C
#include <SparkFun_MMA8452Q.h> // Includes the SFE_MMA8452Q library


MMA8452Q accel;

void setup() {
  Serial.begin(9600);
  accel.init(); // Default init: +/-2g and 800Hz ODR
}



void loop() {

  if (accel.available()) {
    accel.read();
    double accelerationX = accel.cx;
    double accelerationY = accel.cy;
    double accelerationZ = accel.cz;
    Serial.print(accelerationX, 3);
    Serial.print(",");
    Serial.print(accelerationY, 3);
    Serial.print(",");
    Serial.println(accelerationZ, 3);
  }


}

