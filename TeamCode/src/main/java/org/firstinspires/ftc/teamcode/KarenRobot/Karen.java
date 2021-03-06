package org.firstinspires.ftc.teamcode.KarenRobot;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.KarenRobot.General.Robot;
import org.firstinspires.ftc.teamcode.KarenRobot.RobotSubSystems.DriveSystem;
import org.firstinspires.ftc.teamcode.KarenRobot.RobotSubSystems.LiftSystem;
import org.firstinspires.ftc.teamcode.KarenRobot.RobotSubSystems.SensorSystem;
import org.firstinspires.ftc.teamcode.KarenRobot.RobotSubSystems.TeamMarkerSystem;
import org.firstinspires.ftc.teamcode.KarenUtil.SimpleColor;

/**
 * Created by Julian on 11/14/2017.
 */

public class Karen extends Robot {

    //DriveSystem
    public static final String DRIVE_RIGHT_KEY = "RD";//DC Port 0
    public static final String DRIVE_LEFT_KEY = "LD";//DC Port 1
    public static final double MIN_TURN_SPEED = 0.25;

    //VuforiaSystem
    public static final String vuforiaLicenseKey = "Ac8vX/3/////AAAAGRLM+gjmWUoAhO8Kns/kDEpxkCW1u1lX1uZW3r/rphUKMxf6jDE4oTHTZ3F/J0GwvD+hMipwaFBziRnmUDZHHXNM//wCa80uaLKJPlK7KkLqmz8dedEKTeMZomxY0T/dAee/7nGRrOtTihtJZvQJNv9RHvgWGF8pR0/lzZobtkU7V3uv+DC/gXY9sJxn/yQdxjxBXuW83wzVcT8tsefn7G8+9T9Til2ZOt/SNV8ilLdfiYFfMUaDdbJnTmaQlhITHP2dtmu71op2u5tsHlABrhs1RDwq3DPC+X+DLJfaPV8kTrgxgo0yxGjDgDmprty6x/BZkv7GD347DQlGBPRuhoSCzrtrR9XtC+FYeuVsbWOu";
    public static final String cameraViewID = "cameraMonitorViewId";
    public static final String relicTemplate = "relicVuMarkTemplate";
    public static final String vuMarkAsset = "RelicVuMark";

    //LiftSystem
    public static final String LIFT_MOTOR_UP_KEY = "LMU";
    public static final String LIFT_MOTOR_DOWN_KEY = "LMD";
    public static final int UP_HEIGHT = 8000; //Here
    public static final int DOWN_HEIGHT = 0;

    //TeamMarkerSystem
    public static final String TEAM_MARKER_SERVO_KEY = "TMS";

    //SensorSystem
    public static final String IMU_KEY = "IMU";

    public Karen(OpMode opMode, SimpleColor alliance, Boolean twoDrivers) {
        super(opMode);
        ALLIANCE = alliance;
        TWO_DRIVERS = twoDrivers;
        putSubSystem("sensor", new SensorSystem(this));
        putSubSystem("drive", new DriveSystem(this));
        putSubSystem("lift", new LiftSystem(this));
        putSubSystem("marker", new TeamMarkerSystem(this));
    }
}
