package org.usfirst.frc.team3473.robot.commands;

import org.usfirst.frc.team3473.robot.OI;
import org.usfirst.frc.team3473.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command {
	protected void initialize() {
		
	}
	protected void execute() {
		/*GENERIC
		double speedleft = OI.JOYSTICK_left.getY()/2;
		double speedright = OI.JOYSTICK_left.getY()/2;
		
		Drivetrain.setLeft(speedleft);
		Drivetrain.setRight(speedright);*/
		
		//holding
		double yAxisSpeed = OI.JOYSTICK_left.getY()/2;
		double xAxisSpeed = OI.JOYSTICK_right.getX()/2;
		
		boolean pressed = true;
		boolean isHeld = OI.BUTTON_toggleHold.get();
		if(pressed == isHeld){
			yAxisSpeed = -yAxisSpeed;
			xAxisSpeed = -xAxisSpeed;
		}
		//holding
		
		Drivetrain.setLeft(yAxisSpeed + xAxisSpeed);
		Drivetrain.setRight(yAxisSpeed + xAxisSpeed);
	}
	protected boolean isFinished() {
		return false;
	}
	protected void end() {
		
	}
	protected void interrupted() {
		
	}
}
