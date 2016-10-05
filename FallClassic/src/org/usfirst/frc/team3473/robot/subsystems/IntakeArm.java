package org.usfirst.frc.team3473.robot.subsystems;

import org.usfirst.frc.team3473.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class IntakeArm extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public static void moveArm(double speed) {
    	RobotMap.TALON_intakeArm.set(speed);
    }
    
    public static  void moveRollers(double speed) {
    	RobotMap.TALON_intakeLeft.set(speed);
    	RobotMap.TALON_intakeRight.set(-speed);
    }
}

