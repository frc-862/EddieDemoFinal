
package edu.wpi.first.wpilibj.templates.commands;


/**
 *
 * @author Team862
 */
public class driveTrainCommand extends CommandBase {
    

    public driveTrainCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        super("Drive Train Operation");
        requires(drivetrainsubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        drivetrainsubsystem.driveControl();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
