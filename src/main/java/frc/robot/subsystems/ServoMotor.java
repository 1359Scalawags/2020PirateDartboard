package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ServoMotor extends SubsystemBase{
	Servo servo;

    public ServoMotor(){
		servo = new Servo(0);
		
	}
	
	public void gotoangle(double angle){
		servo.set(angle);
	}

	public double get() {
		return servo.get();
	}

	@Override
    public void periodic() {
		SmartDashboard.putNumber("Servo State", servo.get());
    }
}