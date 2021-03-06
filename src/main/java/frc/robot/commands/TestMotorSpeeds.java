package frc.robot.commands;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
//import frc.robot.Robot;
import frc.robot.Robot;

/**
 *
 */
public class TestMotorSpeeds extends CommandBase {

    private double speedA, speedB;

    public TestMotorSpeeds() {
        speedA = 0.0;
        speedB = 0.0;
    }

    public TestMotorSpeeds(double speedA_, double speedB_) {   
        speedA = speedA_;   
        speedB = speedB_; 

        SmartDashboard.putNumber("Motor_Speed_A", speedA);
        SmartDashboard.putNumber("Motor_Speed_B", speedB);
    }

    // Called just before this Command runs the first time
    @Override
    public void initialize() {
        // SmartDashboard.putNumber("Top_Motor_Speed", topSpeed);
        // SmartDashboard.putNumber("Bottom_Motor_Speed", bottomSpeed);
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    public void execute() {
        double a = Robot.oi.getLStickY(); //possibly need to remap the range of stick values to [-1,1]
        double b = Robot.oi.getRStickY(); //possibly need to remap the range of stick values to [-1,1]

        // double a = SmartDashboard.getNumber("MotorA", 0);
        // double b = SmartDashboard.getNumber("MotorB", 0);
        
        SmartDashboard.putNumber("Left Stick Y", Robot.oi.getLStickY());

        Robot.motorSystem.updateMotorRPM(a, b);
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    public boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    public void end(boolean interrupted) {
        Robot.motorSystem.updateMotorRPM(0, 0);
    }


}