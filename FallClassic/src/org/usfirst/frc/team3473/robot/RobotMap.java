package org.usfirst.frc.team3473.robot;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.AnalogInput;

public class RobotMap {
    public static AnalogInput SENSOR_pot;
    public static AnalogInput SENSOR_pot2;
    public static DigitalInput SENSOR_limitElevatorDown;
    public static DigitalInput SENSOR_limitElevatorUp;
    
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
    
    public static void init() {
    	SENSOR_pot = new AnalogInput(Phannels.PORT_pot);
    	SENSOR_pot2 = new AnalogInput(Phannels.PORT_pot2);
    	TALON_right1 = new CANTalon(Phannels.PORT_rightDrivebase1);
    	TALON_right2 = new CANTalon(Phannels.PORT_rightDrivebase2);
    	TALON_left1 = new CANTalon(Phannels.PORT_leftDrivebase1);
    	TALON_left2 = new CANTalon(Phannels.PORT_leftDrivebase2);
    	//SENSOR_limitElevatorDown = new DigitalInput(Phannels.PORT_limitElevatorDown);
    	//SENSOR_limitElevatorUp = new DigitalInput(Phannels.PORT_limitElevatorUp);
    	TALON_intakeTop = new CANTalon(Phannels.PORT_intakeTop);
    	TALON_intakeBottom = new CANTalon(Phannels.PORT_intakeBottom);
    	TALON_intakeActuation = new CANTalon(Phannels.PORT_intakeActuation);
    	TALON_mid1 = new CANTalon(Phannels.PORT_midDrivebase1);
    	TALON_mid2 = new CANTalon(Phannels.PORT_midDrivebase2);
    }
}
