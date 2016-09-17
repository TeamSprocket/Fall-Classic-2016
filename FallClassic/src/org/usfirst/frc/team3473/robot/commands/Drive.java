package org.usfirst.frc.team3473.robot.commands;

import org.usfirst.frc.team3473.robot.OI;
import org.usfirst.frc.team3473.robot.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.command.Command;

public class Drive extends Command {
	protected void initialize() {
		
	}
	protected void execute() {
		//SPEED
		double speedleft = OI.JOYSTICK_left.getY()/2;
		double speedright = OI.JOYSTICK_left.getY()/2;
		
		Drivetrain.setLeft(speedleft);
		Drivetrain.setRight(speedright);
	}
	protected boolean isFinished() {
		return false;
	}
	protected void end() {
		
	}
	protected void interrupted() {
		
	}
}
