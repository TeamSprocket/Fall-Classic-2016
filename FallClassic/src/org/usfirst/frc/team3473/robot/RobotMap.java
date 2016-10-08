package org.usfirst.frc.team3473.robot;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Servo;

public class RobotMap {
    public static AnalogInput SENSOR_pot;
    public static AnalogInput SENSOR_pot2;
    public static DigitalInput SENSOR_limitElevatorDown;
    public static DigitalInput SENSOR_limitElevatorUp;
    public static AnalogGyro SENSOR_gyro;
    
    public static CANTalon TALON_left1;
    public static CANTalon TALON_mid1;
    public static CANTalon TALON_left2;
    public static CANTalon TALON_right1;
    public static CANTalon TALON_mid2;
    public static CANTalon TALON_right2;
    public static CANTalon TALON_elevator;
    public static CANTalon TALON_intakeTop;
    public static CANTalon TALON_intakeBottom;
    public static CANTalon TALON_intakeActuation;
    public static CANTalon TALON_shooterLeft;
    public static CANTalon TALON_shooterRight;
    public static Servo servo;
    public static Servo servo2;
    
    public static void init() {
    	SENSOR_pot = new AnalogInput(Phannels.PORT_pot);
    	SENSOR_pot2 = new AnalogInput(Phannels.PORT_pot2);
    	SENSOR_gyro = new AnalogGyro(Phannels.PORT_gyro);
    	
    	//Drivebase
    	TALON_right1 = new CANTalon(Phannels.PORT_rightDrivebase1);
    	TALON_right2 = new CANTalon(Phannels.PORT_rightDrivebase2);
    	TALON_left1 = new CANTalon(Phannels.PORT_leftDrivebase1);
    	TALON_left2 = new CANTalon(Phannels.PORT_leftDrivebase2);
    	TALON_mid1 = new CANTalon(Phannels.PORT_midDrivebase1);
    	TALON_mid2 = new CANTalon(Phannels.PORT_midDrivebase2);
    	//SENSOR_limitElevatorDown = new DigitalInput(Phannels.PORT_limitElevatorDown);
    	//SENSOR_limitElevatorUp = new DigitalInput(Phannels.PORT_limitElevatorUp);
    	
    	//Intake
    	TALON_intakeTop = new CANTalon(Phannels.PORT_intakeTop);
    	TALON_intakeBottom = new CANTalon(Phannels.PORT_intakeBottom);
    	TALON_intakeActuation = new CANTalon(Phannels.PORT_intakeActuation);
    	servo = new Servo(Phannels.PORT_servo);
    	servo2 = new Servo(Phannels.PORT_servo2);
    	
    	//Outtake
    	TALON_shooterLeft = new CANTalon(Phannels.PORT_shooterLeft);
    	TALON_shooterRight = new CANTalon(Phannels.PORT_shooterRight);
    }
}
