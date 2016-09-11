package am.aca.musicapp.controller;

import am.aca.musicapp.common.model.User;
import am.aca.musicapp.common.util.ConfigProperties;
import am.aca.musicapp.common.util.FromConsole;
import am.aca.musicapp.repository.implementations.AlbumRepository;
import am.aca.musicapp.repository.implementations.PlayListRepository;
import am.aca.musicapp.repository.implementations.TrackRepository;
import am.aca.musicapp.repository.implementations.UserRepository;

/**
 * Created by Narek on 11.09.2016.
 */
public class Controller {
    private static Controller controller = null;

    private Controller() {}

    public static Controller getInstance() {
        if (controller == null) {
            controller = new Controller();
        }
        return controller;
    }

	static User logedOnUser;

	FromConsole fromConsole = FromConsole.getInstance();
    ConfigProperties msg = ConfigProperties.getInstance();
    UserRepository userRepository = UserRepository.getInstance();
    TrackRepository trackRepository = TrackRepository.getInstance();
    AlbumRepository albumRepository = AlbumRepository.getInstance();
    PlayListRepository playListRepository = PlayListRepository.getInstance();

    private boolean inExecute;
    private boolean inMusicApp;
	private boolean inPlayer;
    private String input;
	public void execute(boolean start) {

        inExecute = start;
		input = fromConsole.getInput(msg.getMessage("S.I.or.S.U"));

		while (inExecute) {
			switch (input) {
                case "Sign Up":
                    signUp();
                    input = fromConsole.getInput(msg.getMessage("Successfully.S.U"));
                    break;

                case "Sign In":
                    signIn();
                    player(true);
                    input = fromConsole.getInput(msg.getMessage("S.I.or.S.U"));
                    break;

                case "Exit":
                    System.exit(0);
                    break;

                case "Help":
                    System.out.println(msg.getMessage("Start.Help"));
                    input = fromConsole.getInput(msg.getMessage("S.I.or.S.U"));
                    break;

                default:
                    input = fromConsole.getInput(msg.getMessage("Invalid.Command"));
                    break;
			}

		}

	}

	public void player(boolean start) {

        inMusicApp = start;
		String input;
        input = fromConsole.getInput("Write.Command");

		while (inPlayer) {
			switch (input) {
                case "Play Music":
                    playing(true);
                    break;

                case "Upload Track":
                    uploadTrack();
                    break;

                case "Upload Album":
                    uploadAlbum();
                    break;

                case "Create PlayList":
                    createPlayList();
                    break;

                case "Share Play List":
                    sharePlayList();
                    break;

                case "Sign Out":
                    logedOnUser = null;
                    execute(true);
                    break;

                case "Exit":
                    System.exit(0);
                    break;

                case "Help":
                    System.out.println(msg.getMessage("User.Program.Help"));
                    input = fromConsole.getInput("Pleas.Write.Command");
                    break;

                default:
                    input = fromConsole.getInput(msg.getMessage("Invalid.Command"));
                    break;
			}

		}

	}

    public void playing(boolean start) {

        inPlayer = start;
        String input;
        input = fromConsole.getInput("Pleas.Write.Command.For.Playing");

        while (start) {
            switch (input) {
                case "play":
                    play();
                    break;

                case "stop":
                    stop();
                    break;

                case "pause":
                    pause();
                    break;

                case "next":
                    next();
                    break;

                case "previous":
                    previous();
                    break;

                case "Help":
                    System.out.println(msg.getMessage("User.Program.Help"));
                    input = fromConsole.getInput("Pleas.Write.Command");
                    break;

                default:
                    input = fromConsole.getInput(msg.getMessage("Invalid.Command"));
                    break;
            }
        }
    }

	public void signUp() {
		String inputedUserName;
		inputedUserName = fromConsole.getInput(msg.getMessage("Input.UserName"));

		while (checkUserName(inputedUserName)) {
			System.out.println(msg.getMessage("UserName.Used"));
			inputedUserName = fromConsole.getInput(msg.getMessage("Input.UserName"));
		}
		String inputedPassword;
		inputedPassword = encriptPassword(fromConsole.getInput(msg.getMessage("Input.Password")));

		User user = new User(inputedUserName, inputedPassword);
		userRepository.create(user);
	}

	public boolean checkUserName(String userName) {
		boolean used = false;

		return used;
	}

	public String encriptPassword(String password) {
		String p = password;

		return p;
	}

	public void signIn() {


	}

    public void sharePlayList() {


    }

    public void uploadAlbum() {


    }

    public void uploadTrack() {


    }

    public void createPlayList() {


    }

    public void play() {


    }

    public void stop() {


    }

    public void pause() {


    }

    public void next() {


    }

    public void previous() {


    }

}
