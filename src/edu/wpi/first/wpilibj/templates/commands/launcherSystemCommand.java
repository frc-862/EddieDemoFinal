/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author Team862
 */
public class launcherSystemCommand extends CommandBase {
    
    
    public launcherSystemCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        super("Launcher System Operation");
        requires(launchersystemsubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        launchersystemsubsystem.launcherOperate();
        launchersystemsubsystem.loaderOperate();
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
