package am.aca.musicapp.common.musicappexception;

/**
 * Created by Narek on 11.09.2016.
 */
public class MusicAppException extends RuntimeException {
    private String message;

    public MusicAppException(String message) {
        this.message = message;
    }

    public MusicAppException(String message, String message1) {
        super(message);
        message = message1;
    }

    public MusicAppException(String message, Throwable cause, String message1) {
        super(message, cause);
        message = message1;
    }

    public MusicAppException(Throwable cause, String message) {
        super(cause);
        this.message = message;
    }

    public MusicAppException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String message1) {
        super(message, cause, enableSuppression, writableStackTrace);
        message = message1;
    }
}
