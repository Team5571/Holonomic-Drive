// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.

package org.usfirst.frc5571.HolonomicDrive.commands;

import org.usfirst.frc5571.HolonomicDrive.Constants;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousDriveToAutoZone extends CommandGroup
{
	public AutonomousDriveToAutoZone()
	{
		// drive forward at half power for one second
		addSequential(new ChassisDriveStraight(Constants.AUTONOMOUS_AUTOZONE_DRIVE_TIME, Constants.AUTONOMOUS_AUTOZONE_DRIVER_POWER, Constants.AUTONOMOUS_AUTOZONE_DRIVE_ANGLE));	
	}
}