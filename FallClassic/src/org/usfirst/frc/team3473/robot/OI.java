package org.usfirst.frc.team3473.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team3473.robot.commands.IntakeOutakeShoot;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static final Joystick
		JOYSTICK_gamepad = new Joystick(2); //Port = 2 on newer driver station
	
	public static final Joystick
		JOYSTICK_right = new Joystick(1),
		JOYSTICK_left = new Joystick(0);

	public static final JoystickButton
		BUTTON_shoot = new JoystickButton(JOYSTICK_gamepad, 8),
		BUTTON_shiftL = new JoystickButton(JOYSTICK_left, 1),
		BUTTON_shiftR = new JoystickButton(JOYSTICK_right, 1),
		BUTTON_elevateUp = new JoystickButton(JOYSTICK_gamepad, 1),
		BUTTON_elevateDown = new JoystickButton(JOYSTICK_gamepad, 2),
		BUTTON_driveIntake = new JoystickButton(JOYSTICK_gamepad, 5),
		BUTTON_prepShoot = new JoystickButton(JOYSTICK_gamepad, 6),
		BUTTON_driveOutake = new JoystickButton(JOYSTICK_gamepad, 7);
}

