package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveBaseSubsystem extends SubsystemBase {
    
    TalonFX leftmotor;
    TalonFX leftmotor2;
    TalonFX leftmotor3;
    TalonFX rightmotor;
    TalonFX rightmotor2;
    TalonFX rightmotor3;

    static DriveBaseSubsystem instance;
    public static DriveBaseSubsystem getInstance(){
        if(instance == null){
        instance = new DriveBaseSubsystem();
        }
        return instance;
    }

    public DriveBaseSubsystem(){
        leftmotor = new TalonFX(0);
        leftmotor2 = new TalonFX(1);
        leftmotor3 = new TalonFX(2);
        rightmotor = new TalonFX(3);
        rightmotor2 = new TalonFX(4);
        rightmotor3 = new TalonFX(5);
    }
    public void setSpeedLeft(double speedLeft){
        leftmotor.set(ControlMode.PercentOutput, speedLeft);
        leftmotor2.set(ControlMode.PercentOutput, speedLeft);
        leftmotor3.set(ControlMode.PercentOutput, speedLeft);
    }
    public void setSpeedRight(double speedRight){
        rightmotor.set(ControlMode.PercentOutput, speedRight);
        rightmotor2.set(ControlMode.PercentOutput, speedRight);
        rightmotor3.set(ControlMode.PercentOutput, speedRight);
    }

    public void driveBaseMove(double moveSpeed, double Turn){
            if(moveSpeed + Turn > 1){
            setSpeedLeft((moveSpeed + Turn) / (moveSpeed + Turn));
            setSpeedRight((moveSpeed - Turn) / (moveSpeed + Turn));
            }
            else if(moveSpeed + Turn < -1){
            setSpeedLeft((moveSpeed + Turn) / -(moveSpeed + Turn));
            setSpeedRight((moveSpeed - Turn) / -(moveSpeed + Turn));
            }
            else{
                setSpeedLeft(moveSpeed + Turn);
                setSpeedRight(moveSpeed - Turn);
        }
    }
}
