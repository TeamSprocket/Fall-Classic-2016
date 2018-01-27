
package org.usfirst.frc.team3473.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team3473.robot.OI;
import org.usfirst.frc.team3473.robot.Robot;
import org.usfirst.frc.team3473.robot.subsystems.ActuateSubsystem;

/**
 *
 */
public class Actuator extends Command {

    public Actuator() {
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(OI.BUTTON_elevateUp.get()){
			ActuateSubsystem.actuate(1);
		}
		else if(OI.BUTTON_elevateDown.get()){
			ActuateSubsystem.actuate(-1);
		}
		else{
			ActuateSubsystem.actuate(0);
		}
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
