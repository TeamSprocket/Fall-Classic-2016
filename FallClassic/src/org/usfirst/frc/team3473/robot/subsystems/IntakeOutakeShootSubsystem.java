
package org.usfirst.frc.team3473.robot.subsystems;

import org.usfirst.frc.team3473.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class IntakeOutakeShootSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	@Override
    public void initDefaultCommand() {
    }
	public static void moveRollers(double speed) {
		RobotMap.TALON_rightBaneBot.set(-speed);
		RobotMap.TALON_leftBaneBot.set(speed);
	}
	public static void tread(double speed){
		if(speed>0){
			RobotMap.TALON_intake.set(.7*speed);
		}
		else{
			RobotMap.TALON_intake.set(.5 * speed);
		}
	}
	public static void shoot(double speed){
		RobotMap.SERVO_leftShoot.set(speed);
		RobotMap.SERVO_rightShoot.set(speed);
	}
}

