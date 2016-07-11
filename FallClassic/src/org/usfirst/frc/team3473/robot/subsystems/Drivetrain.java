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
		/*public void initDefaultCommand(){
		}
		
		public static void setTopRight(double speed){
			RobotMap.TALON_right1.set(speed);
		}
		public static void setTopLeft(double speed){
			RobotMap.TALON_left1.set(speed);
		}
		public static void setBackRight(double speed){
			RobotMap.TALON_right2.set(speed);
		}
		public static void setBackLeft(double speed){
			RobotMap.TALON_left2.set(speed);
		}
		public static double topRightCalc(double speed, double angle, double changespeed){
			double voltage;
			voltage = speed * Math.cos(angle + Math.PI / 4) - changespeed;
			return voltage;
		}
		public static double topLeftCalc(double speed, double angle, double changespeed){
			double voltage;
			voltage = speed * Math.sin(angle + Math.PI / 4) + changespeed;
			return voltage;
		}
		public static double bottomLeftCalc(double speed, double angle, double changespeed){
			double voltage;
			voltage = speed * Math.cos(angle + Math.PI / 4) + changespeed;
			return voltage;
		}
		public static double bottomRightCalc(double speed, double angle, double changespeed){
			double voltage;
			voltage = speed * Math.sin(angle + Math.PI / 4) - changespeed;
			return voltage;
		}		*/
}
