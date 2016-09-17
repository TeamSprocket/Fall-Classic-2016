package org.usfirst.frc.team3473.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team3473.robot.RobotMap;

public class Drivetrain extends Subsystem {

	@Override
	protected void initDefaultCommand() {
	}
	
	public static void setLeft(double speed){
		RobotMap.TALON_left1.set(speed);
		RobotMap.TALON_left2.set(speed);
		RobotMap.TALON_mid1.set(speed);
	}
	
	public static void setRight(double speed){
		RobotMap.TALON_right1.set(speed);
		RobotMap.TALON_right2.set(speed);
		RobotMap.TALON_mid2.set(speed);
	}		
}
