
package org.usfirst.frc.team3473.robot.subsystems;

import org.usfirst.frc.team3473.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ActuateSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	@Override
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

	public static void actuate(double speed) {
			if(speed>0){
				RobotMap.TALON_intakeActuation.set(.7 * speed);
			} else {
				RobotMap.TALON_intakeActuation.set(.5 * speed);
			}
		}
		
	
}

