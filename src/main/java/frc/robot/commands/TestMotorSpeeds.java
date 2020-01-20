package frc.robot.commands;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
//import frc.robot.Robot;
import frc.robot.Robot;

/**
 *
 */
public class TestMotorSpeeds extends CommandBase {

    private double topSpeed;
    private double bottomSpeed;

    public TestMotorSpeeds() {
        topSpeed = 0.5;
        bottomSpeed = 0.5;
    }

    public TestMotorSpeeds(double top, double bottom) {
        topSpeed = top;   
        bottomSpeed = bottom; 
    }

    // Called just before this Command runs the first time
    @Override
    public void initialize() {
        SmartDashboard.putNumber("Top_Motor_Speed", topSpeed);
        SmartDashboard.putNumber("Bottom_Motor_Speed", bottomSpeed);
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    public void execute() {
        topSpeed = SmartDashboard.getNumber("Top_Motor_Speed", 0);
        bottomSpeed = SmartDashboard.getNumber("Bottom_Motor_Speed", 0);
        //Robot.motorSystem.setShooterSpeed(topSpeed, bottomSpeed);
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    public boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    public void end(boolean interrupted) {
        //Robot.motorSystem.setShooterSpeed(0, 0);
    }


}
