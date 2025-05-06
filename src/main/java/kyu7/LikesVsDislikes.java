package kyu7;

import java.util.stream.Stream;

public class LikesVsDislikes {

    public static Button likeOrDislike(Button[] buttons) {
	Button state = Button.Nothing;
	
        for (Button button : buttons) {
            state = (state == button) ? Button.Nothing : button;
        }
        
        return state;
        // Stream.of(buttons).reduce(Button.Nothing, (s, b) -> s == b ? Button.Nothing : b);
    }

    static enum Button {
	Nothing, Like, Dislike
    }

}
