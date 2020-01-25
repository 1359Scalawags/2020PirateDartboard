package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.util.Color;
import edu.wpi.first.wpilibj2.command.CommandBase;
//import frc.robot.Robot;
import frc.robot.Robot;
import frc.robot.subsystems.ColorSystem;

/**
 *
 */
public class TestColorSensor extends CommandBase {


    public TestColorSensor() {
        
        
    }

    // Called just before this Command runs the first time
    @Override
    public void initialize() {
        // SmartDashboard.putNumber("Consistency:", Robot.colorSystem.getConsistency());
        // SmartDashboard.putString("Current Color:", Robot.colorSystem.getColor().toString().substring(37,45));
        SmartDashboard.putString("Current RGB:", "R="+Robot.colorSystem.getColor().red+" G="+Robot.colorSystem.getColor().green+" B="+Robot.colorSystem.getColor().blue);
        SmartDashboard.putString("Color", Robot.colorSystem.getColorName());

        
        // int phase = Robot.oi.phase;
        // SmartDashboard.putString("phase "+phase, Robot.colorSystem.getResults(1000));

        // Robot.oi.phase++;

    }

   

    // Called repeatedly when this Command is scheduled to run
    @Override
    public void execute() {
        SmartDashboard.putNumber("Consistency:", Robot.colorSystem.getConsistency());
        SmartDashboard.putString("Current Color:", Robot.colorSystem.getColor().toString());
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
