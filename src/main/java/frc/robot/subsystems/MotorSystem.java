// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.smartdashboard.SendableRegistry;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Spark;
import frc.robot.Constants;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

/**
 *
 */
public class MotorSystem extends SubsystemBase {

    private Encoder speedEncoderA;
    private Encoder speedEncoderB;
    private Spark motorA;
    private Spark motorB;

    private PIDController controllerA;
    private PIDController controllerB;

    public MotorSystem() {
        // controllerA = new PIDController(Constants.MOTORS_P, Constants.MOTORS_I, Constants.MOTOR_D);
        // controllerB = new PIDController(Constants.MOTORS_P, Constants.MOTORS_I, Constants.MOTOR_D);

        // SendableRegistry.add(controllerA, "Motor A");
        // SendableRegistry.add(controllerB, "Motor B");

        // speedEncoderA = new Encoder(Constants.MotorA_EncoderA, Constants.MotorA_EncoderB, false, EncodingType.k4X);
        // SendableRegistry.add(speedEncoderA, "Encoder A");
        // speedEncoderA.setDistancePerPulse(Constants.MOTOR_ENCODER_MULTIPLIER);
        // speedEncoderA.setSamplesToAverage(4);

        // speedEncoderB = new Encoder(Constants.MotorB_EncoderA, Constants.MotorA_EncoderB, false, EncodingType.k4X);
        // SendableRegistry.add(speedEncoderB, "Encoder B");
        // speedEncoderB.setDistancePerPulse(Constants.MOTOR_ENCODER_MULTIPLIER);
        // speedEncoderB.setSamplesToAverage(4);
                
        // motorA = new Spark(Constants.MOTORA_ID);
        // addChild("BallMotorA",motorA);
        // motorA.setInverted(false);
                
        // motorB = new Spark(Constants.MOTORB_ID);
        // addChild("BallMotorB",motorB);
        // motorB.setInverted(true);
                          
    }
  
    public void setShooterSpeed(double speedA, double speedB) {
        double actualA = speedEncoderA.getRate();
        double actualB = speedEncoderB.getRate();
        controllerA.setSetpoint(speedA);
        controllerB.setSetpoint(speedB);
        double desiredA = controllerA.calculate(actualA);
        double desiredB = controllerB.calculate(actualB);
        motorA.set(desiredA);
        motorB.set(desiredB);
    }

}
