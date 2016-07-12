package org.usfirst.frc.team3473.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team3473.robot.RobotMap;

public class Drivetrain extends Subsystem {
	
	private static final double reducePercentage = 0.5;
	private static final double error = 0.05;

	@Override
	protected void initDefaultCommand() {
	}
	
	public static void setLeft(double speed){
		RobotMap.TALON_left1.set(speed * reducePercentage);
		RobotMap.TALON_left2.set(speed * reducePercentage);
		RobotMap.TALON_mid1.set(speed * reducePercentage);
	}
	
	public static void setRight(double speed){
		RobotMap.TALON_right1.set(-speed * reducePercentage);
		RobotMap.TALON_right2.set(-speed * reducePercentage);
		RobotMap.TALON_mid2.set(-speed * reducePercentage);
	}
	
	public static void set(double wheel, double throttle, boolean turnOnCenter) {
		if(Math.abs(wheel) < error)
			wheel = 0;
		if(Math.abs(throttle) < error)
			throttle = 0;
		if(turnOnCenter) {
			setLeft(wheel);
			setRight(-wheel);
		}
		else if(wheel == 0.0) {
			setLeft(-throttle);
			setRight(-throttle);
		}
		else {
			double speedLeft = -throttle + 0.8 * wheel;
			double speedRight = -throttle - 0.8 * wheel;
			setLeft(speedLeft);
			setRight(speedRight);
		}
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
