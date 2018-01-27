package org.usfirst.frc.team3473.robot;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Servo;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.AnalogInput;

public class RobotMap {
    public static AnalogInput SENSOR_pot;
    public static DigitalInput SENSOR_limitElevatorDown;
    public static DigitalInput SENSOR_limitElevatorUp;
    
    public static WPI_TalonSRX TALON_rightFront;
    public static WPI_TalonSRX TALON_rightBack;
    public static WPI_TalonSRX TALON_rightMid;
    public static WPI_TalonSRX TALON_leftFront;
    public static WPI_TalonSRX TALON_leftBack;
    public static WPI_TalonSRX TALON_leftMid;
    public static WPI_TalonSRX TALON_elevator;
    public static WPI_TalonSRX TALON_rightBaneBot;
    public static WPI_TalonSRX TALON_leftBaneBot;
    public static WPI_TalonSRX TALON_intakeActuation;
    public static WPI_TalonSRX TALON_intake;
    public static Servo SERVO_leftShoot;
    public static Servo SERVO_rightShoot;
    
    public static void init() {
    	//SENSOR_pot = new AnalogInput(Phannels.PORT_pot);
    	SERVO_leftShoot = new Servo(0);
    	SERVO_rightShoot = new Servo(1);
    	TALON_rightFront = new WPI_TalonSRX(3);
    	TALON_rightBack = new WPI_TalonSRX(0);
    	TALON_leftFront = new WPI_TalonSRX(10);
    	TALON_leftBack = new WPI_TalonSRX(4);
    	//SENSOR_limitElevatorDown = new DigitalInput(Phannels.PORT_limitElevatorDown);
    	//SENSOR_limitElevatorUp = new DigitalInput(Phannels.PORT_limitElevatorUp);
    	TALON_rightBaneBot = new WPI_TalonSRX(6);
    	TALON_leftBaneBot = new WPI_TalonSRX(11);
    	TALON_intakeActuation = new WPI_TalonSRX(5);
    	TALON_rightMid = new WPI_TalonSRX(8);
    	TALON_leftMid = new WPI_TalonSRX(1);
    	TALON_intake = new WPI_TalonSRX(2);
    }
}
