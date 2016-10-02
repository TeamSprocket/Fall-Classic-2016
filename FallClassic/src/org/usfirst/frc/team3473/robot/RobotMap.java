package org.usfirst.frc.team3473.robot;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Servo;

public class RobotMap {
    public static AnalogInput SENSOR_pot;
    public static DigitalInput SENSOR_limitElevatorDown;
    public static DigitalInput SENSOR_limitElevatorUp;
    
    public static CANTalon TALON_right1;
    public static CANTalon TALON_right2;
    public static CANTalon TALON_left1;
    public static CANTalon TALON_left2;
    public static CANTalon TALON_mid1;
    public static CANTalon TALON_mid2;
    public static CANTalon TALON_intakeArm;
    public static CANTalon TALON_intakeLeft;
    public static CANTalon TALON_intakeRight;
    public static CANTalon TALON_shooterArm;
    public static CANTalon TALON_shooterLeft;
    public static CANTalon TALON_shooterRight;
    public static Servo servo;
    
    public static void init() {
    	//SENSOR_pot = new AnalogInput(Phannels.PORT_pot);
    	TALON_right1 = new CANTalon(Phannels.PORT_rightDrivebase1);
    	TALON_right2 = new CANTalon(Phannels.PORT_rightDrivebase2);
    	TALON_left1 = new CANTalon(Phannels.PORT_leftDrivebase1);
    	TALON_left2 = new CANTalon(Phannels.PORT_leftDrivebase2);
    	//SENSOR_limitElevatorDown = new DigitalInput(Phannels.PORT_limitElevatorDown);
    	//SENSOR_limitElevatorUp = new DigitalInput(Phannels.PORT_limitElevatorUp);
    	TALON_mid1 = new CANTalon(Phannels.PORT_midDrivebase1);
    	TALON_mid2 = new CANTalon(Phannels.PORT_midDrivebase2);
    	TALON_intakeArm = new CANTalon(Phannels.PORT_intakeArm);
    	TALON_intakeLeft = new CANTalon(Phannels.PORT_intakeLeft);
    	TALON_intakeRight = new CANTalon(Phannels.PORT_intakeRight);
    	TALON_shooterArm = new CANTalon(Phannels.PORT_shooterArm);
    	TALON_shooterLeft = new CANTalon(Phannels.PORT_shooterLeft);
    	TALON_shooterRight = new CANTalon(Phannels.PORT_shooterRight);
    	servo = new Servo(Phannels.PORT_servo);
    }
}
