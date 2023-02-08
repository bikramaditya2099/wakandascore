package com.wakanda.util;

import java.math.BigDecimal;

import com.pi4j.gpio.extension.pca.PCA9685GpioProvider;
import com.pi4j.gpio.extension.pca.PCA9685Pin;
import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinPwmOutput;
import com.pi4j.io.gpio.Pin;
import com.pi4j.io.i2c.I2CBus;
import com.pi4j.io.i2c.I2CDevice;
import com.pi4j.io.i2c.I2CFactory;

public class ServoControl {
public static void main(String[] args) throws Exception{
	
	System.out.println("Started");
    BigDecimal frequency = new BigDecimal("50");
	//Set the control frequency of the servo, generally 50hz, a period of 20ms
    BigDecimal frequencyCorrectionFactor = new BigDecimal("1");
	//Set the correction factor, the actual output frequency of PCA9685 has an error with the set frequency, so it needs to be corrected. If it is necessary to correct, just fill in 1
    I2CBus bus = I2CFactory.getInstance(I2CBus.BUS_1);
    
    final PCA9685GpioProvider provider = new PCA9685GpioProvider(bus, 0x40, frequency, frequencyCorrectionFactor);
  // GpioPinPwmOutput[] myOutputs = provisionPwmOutputs(provider);
    provider.reset();
    Pin pin_0 = PCA9685Pin.ALL[0];
    provider.setPwm(pin_0,0, 500);
	//The third value here is related to the steering gear control angle
	//Calculation formula: date=4096*((angle*11)+500)/20000
	Thread.sleep(1000);
	//Add sleep here, otherwise the servo may not have time to respond
	provider.setPwm(pin_0,0, 300);
	Thread.sleep(1000);
	provider.setPwm(pin_0,0, 500);
	Thread.sleep(1000);
	provider.setPwm(pin_0,0, 300);
}

private static GpioPinPwmOutput[] provisionPwmOutputs(final PCA9685GpioProvider gpioProvider) {
    GpioController gpio = GpioFactory.getInstance();
    GpioPinPwmOutput myOutputs[] = {
            gpio.provisionPwmOutputPin(gpioProvider, PCA9685Pin.PWM_00, "uesd"),
            gpio.provisionPwmOutputPin(gpioProvider, PCA9685Pin.PWM_01, "not used"),
            gpio.provisionPwmOutputPin(gpioProvider, PCA9685Pin.PWM_02, "not used"),
            gpio.provisionPwmOutputPin(gpioProvider, PCA9685Pin.PWM_03, "not used"),
            gpio.provisionPwmOutputPin(gpioProvider, PCA9685Pin.PWM_04, "not used"),
            gpio.provisionPwmOutputPin(gpioProvider, PCA9685Pin.PWM_05, "not used"),
            gpio.provisionPwmOutputPin(gpioProvider, PCA9685Pin.PWM_06, "not used"),
            gpio.provisionPwmOutputPin(gpioProvider, PCA9685Pin.PWM_07, "not used"),
            gpio.provisionPwmOutputPin(gpioProvider, PCA9685Pin.PWM_08, "not used"),
            gpio.provisionPwmOutputPin(gpioProvider, PCA9685Pin.PWM_09, "not used"),
            gpio.provisionPwmOutputPin(gpioProvider, PCA9685Pin.PWM_10, "not used"),
            gpio.provisionPwmOutputPin(gpioProvider, PCA9685Pin.PWM_11, "not used"),
            gpio.provisionPwmOutputPin(gpioProvider, PCA9685Pin.PWM_12, "not used"),
            gpio.provisionPwmOutputPin(gpioProvider, PCA9685Pin.PWM_13, "not used"),
            gpio.provisionPwmOutputPin(gpioProvider, PCA9685Pin.PWM_14, "not used"),
            gpio.provisionPwmOutputPin(gpioProvider, PCA9685Pin.PWM_15, "not used")};  
			//Note that everything must be initialized here
    return myOutputs;
}

}
