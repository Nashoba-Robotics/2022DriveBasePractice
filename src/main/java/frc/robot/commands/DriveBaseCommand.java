package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveBaseSubsystem;
import frc.robot.subsystems.JoystickSubsystem;

class DriveBaseCommand extends CommandBase{


public DriveBaseCommand() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(DriveBaseSubsystem.getInstance());
  }

      // Called when the command is initially scheduled.
  public void initialize() {

  }

  // Called every time the scheduler runs while the command is scheduled.
  public void execute() {
    DriveBaseSubsystem.getInstance().driveBaseMove(JoystickSubsystem.getInstance().getmoveSpeedJoystick(), JoystickSubsystem.getInstance().getTurnJoystick());
  }

  // Called once the command ends or is interrupted.
  public void end(boolean interrupted) {
    DriveBaseSubsystem.getInstance().driveBaseMove(0, 0);
  }

  // Returns true when the command should end.
  public boolean isFinished() {
    return false;
  }

}