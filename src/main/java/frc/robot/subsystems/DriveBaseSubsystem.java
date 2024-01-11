package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBaseSubsystem extends SubsystemBase {
    TalonFX motor;
    public DriveBaseSubsystem(){
        TalonFX motor = new TalonFX();
    }
    public void setSpeed(double sppeed){
        motor.set(ControlMode.PercentOutput, speed);
    }
}
