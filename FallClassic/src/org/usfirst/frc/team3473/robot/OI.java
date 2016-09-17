package org.usfirst.frc.team3473.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team3473.robot.commands.ExampleCommand;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static final Joystick //Regular Joysticks (lmao)
		JOYSTICK_left = new Joystick(0),
		JOYSTICK_right = new Joystick(1);
	
	public static final Joystick //Xbox Controller
		JOYSTICK_gamepad = new Joystick(2);

	public static final Joystick //Wheel
		JOYSTICK_wheel = new Joystick(4);
		//uses JOYSICK_left
	
	public static final JoystickButton
		BUTTON_shiftL = new JoystickButton(JOYSTICK_left, 1),
		BUTTON_shiftR = new JoystickButton(JOYSTICK_right, 1),
		//BUTTON_elevateUp = new JoystickButton(JOYSTICK_gamepad, 6),
		//BUTTON_elevateDown = new JoystickButton(JOYSTICK_gamepad, 5),
		BUTTON_intake = new JoystickButton(JOYSTICK_gamepad, 4),
		BUTTON_driveIntake = new JoystickButton(JOYSTICK_gamepad, 3),
		BUTTON_driveOuttake = new JoystickButton(JOYSTICK_gamepad, 2),
		BUTTON_LStick = new JoystickButton(JOYSTICK_gamepad, 5),
		BUTTON_RStick = new JoystickButton(JOYSTICK_gamepad, 6);
}

