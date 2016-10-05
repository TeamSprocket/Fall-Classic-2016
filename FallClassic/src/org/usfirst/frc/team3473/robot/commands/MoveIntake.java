package org.usfirst.frc.team3473.robot.commands;

import org.usfirst.frc.team3473.robot.OI;
import org.usfirst.frc.team3473.robot.subsystems.IntakeArm;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MoveIntake extends Command {

    public MoveIntake() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(OI.JOYSTICK_gamepad.getRawButton(4) == true)
    		IntakeArm.moveRollers(1.0);
    	else if(OI.JOYSTICK_gamepad.getRawButton(5) == true)
    		IntakeArm.moveRollers(-1.0);
    	else
    		IntakeArm.moveRollers(0.0);
    	
    	double joystickValue = OI.JOYSTICK_gamepad.getRawAxis(1);
    	IntakeArm.moveArm(Math.abs(joystickValue) < 0.05 ? 0.0 : joystickValue);
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
