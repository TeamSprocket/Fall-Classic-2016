package org.usfirst.frc.team3473.robot.commands;

import org.usfirst.frc.team3473.robot.OI;
import org.usfirst.frc.team3473.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command {
	protected void initialize() {
		
	}
	protected void execute() {
		/*double speed = OI.JOYSTICK_left.getY();
		double angle = OI.JOYSTICK_right.getDirectionRadians();
		double changespeed = 1.0;
		double v2 = Drivetrain.topRightCalc(speed, angle, changespeed);
		double v1 = Drivetrain.topLeftCalc(speed, angle, changespeed);
		double v3 = Drivetrain.bottomLeftCalc(speed, angle, changespeed);
		double v4 = Drivetrain.bottomRightCalc(speed, angle, changespeed);
		//set motor speeds
		Drivetrain.setTopRight(v2);
		Drivetrain.setTopLeft(v1);
		Drivetrain.setBackLeft(v3);
		Drivetrain.setBackRight(v4);*/
		
		Drivetrain.set(OI.JOYSTICK_wheel.getX(), OI.JOYSTICK_throttle.getY(), OI.JOYSTICK_wheel.getRawButton(6));
	}
	protected boolean isFinished() {
		return false;
	}
	protected void end() {
		
	}
	protected void interrupted() {
		
	}
}
