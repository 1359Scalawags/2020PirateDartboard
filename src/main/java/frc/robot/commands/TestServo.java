package frc.robot.commands;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
//import frc.robot.Robot;
import frc.robot.Robot;

/**
 *
 */
public class TestServo extends CommandBase {

    boolean forward = true;

    public TestServo() {
        addRequirements(Robot.servoMotor);
        
    }

    // Called just before this Command runs the first time
    @Override
    public void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    public void execute() {
        
        Robot.servoMotor.get();
        // if(Robot.servoMotor.get() >= 1-0.05 && forward) {
        //     forward = false;
        // }
        
        // if(Robot.servoMotor.get() <= 0+0.05 && !forward) {
        //     forward = true;
        // }

        // if(forward) {
        //    Robot.servoMotor.gotoangle(1); 
        // } else {
        //     Robot.servoMotor.gotoangle(0);
        // }
        // double val = (Robot.oi.getLStickY()+0.7)/1.4;
        double val = (Robot.oi.getLStickY()+1)/2;

        SmartDashboard.putNumber("key", val);
        Robot.servoMotor.gotoangle(val);
        
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    public boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    public void end(boolean interrupted) {
    }


}