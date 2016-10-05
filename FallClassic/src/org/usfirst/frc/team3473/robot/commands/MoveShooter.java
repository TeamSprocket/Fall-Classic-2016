package org.usfirst.frc.team3473.robot.commands;

import org.usfirst.frc.team3473.robot.OI;
import org.usfirst.frc.team3473.robot.subsystems.ShooterArm;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MoveShooter extends Command {

    public MoveShooter() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(OI.JOYSTICK_gamepad.getRawAxis(2) > 0.5)
    		ShooterArm.moveRollers(1.0);
    	else if(OI.JOYSTICK_gamepad.getRawAxis(3) > 0.5)
    		ShooterArm.moveRollers(-1.0);
    	else
    		ShooterArm.moveRollers(0.0);
    	
    	double joystickValue = OI.JOYSTICK_gamepad.getRawAxis(5);
    	ShooterArm.moveArm(Math.abs(joystickValue) < 0.05 ? 0.0 : joystickValue);
    	
    	if(OI.JOYSTICK_gamepad.getRawButton(0) == true)
    		ShooterArm.moveServo(0.5);
    	else if(OI.JOYSTICK_gamepad.getRawButton(1) == true)
    		ShooterArm.moveServo(0.0);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
