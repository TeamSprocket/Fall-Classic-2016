
package org.usfirst.frc.team3473.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team3473.robot.OI;
import org.usfirst.frc.team3473.robot.Robot;
import org.usfirst.frc.team3473.robot.subsystems.IntakeOutakeShootSubsystem;

/**
 *
 */
public class IntakeOutakeShoot extends Command {

    public IntakeOutakeShoot() {
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	
    	if (OI.BUTTON_driveIntake.get()) {
			IntakeOutakeShootSubsystem.moveRollers(1);
			IntakeOutakeShootSubsystem.tread(-1);
		} 
		else if(OI.BUTTON_driveOutake.get()){
			IntakeOutakeShootSubsystem.moveRollers(-1);
			IntakeOutakeShootSubsystem.tread(1);
		}
		else if(OI.BUTTON_prepShoot.get()){
			IntakeOutakeShootSubsystem.moveRollers(-1);
		}
		else {
			IntakeOutakeShootSubsystem.moveRollers(0);
			IntakeOutakeShootSubsystem.tread(0);
		}
    	
    	if(OI.BUTTON_shoot.get()){
			IntakeOutakeShootSubsystem.shoot(0);
		}
		else{
			IntakeOutakeShootSubsystem.shoot(1);
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
