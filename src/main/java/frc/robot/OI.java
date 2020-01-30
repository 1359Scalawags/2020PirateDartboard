// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package frc.robot;

import frc.robot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import java.util.function.Function;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.XboxController.Axis;
import edu.wpi.first.wpilibj2.command.button.*;

//import frc.robot.subsystems.*;


    /**
     * This class is the glue that binds the controls on the physical operator
     * interface to the commands and command groups that allow control of the robot.
     */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton speedoButton;
    public XboxController driverContoller;
    public JoystickButton shootButton;
    public JoystickButton lineupButton;
    public JoystickButton intakeBallButton;
    public JoystickButton controlPanelSetColorButton;
    public JoystickButton controlPanelSpinButton;
    public JoystickButton climbUpButton;
    public JoystickButton climbDownButton;
    public XboxController assistController;

    public JoystickButton testColor;
    public JoystickButton testMotor;

    public int phase =0;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        assistController = new XboxController(0);
        driverContoller = new XboxController(1);

        testColor = new JoystickButton(driverContoller, 1);
        testMotor = new JoystickButton(driverContoller, 2);

        testColor.whileHeld(new TestColorSensor());
        testMotor.whileHeld(new TestMotorSpeeds());
        


        //shootButton.whileHeld(new TestMotorSpeeds());

        //speedoButton = new JoystickButton(driverContoller, 1);
        
        //PWM-2

        // SmartDashboard Buttons
        // SmartDashboard.putData("ShootBall", new ShootBall());
        // SmartDashboard.putData("TestShooterSpeeds", new TestMotorSpeeds());

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public XboxController getDriverJoystick() {
        return driverContoller;
    }

    public XboxController getAssistJoystick() {
        return assistController;
    }

    public double getMainTriggers() {
		return Math.max(driverContoller.getTriggerAxis(Hand.kLeft), driverContoller.getTriggerAxis(Hand.kRight));
	}


    public double getRStickY() {
		if (Math.abs(driverContoller.getY(Hand.kRight)) > Constants.controllerDeadZone) {
			return -(driverContoller.getY(Hand.kRight) * (.3 * getMainTriggers() + .7));
		} else {
			return 0;
		}
	}

    public double getLStickY() {
		if (Math.abs(driverContoller.getY(Hand.kLeft)) > Constants.controllerDeadZone) {
			return -(driverContoller.getY(Hand.kLeft) * (.3 * getMainTriggers() + .7));
		} else {
			return 0;
		}
	}

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

